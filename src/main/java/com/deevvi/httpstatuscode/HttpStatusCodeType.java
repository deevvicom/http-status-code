package com.deevvi.httpstatuscode;

public enum HttpStatusCodeType {

    INFORMATIONAL(1),
    SUCCESSFUL(2),
    REDIRECTION(3),
    CLIENT_ERROR(4),
    SERVER_ERROR(5);

    /**
     * Field representing the first digit of the error code, from where the type is determined.
     */
    private final int value;

    /**
     * Constructor.
     */
    HttpStatusCodeType(int value) {

        this.value = value;
    }

    /**
     * Checks if code is a 1XX, representing the INFO category.
     *
     * @return <code>true</code> if code represents a 1XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isInformational() {

        return this == INFORMATIONAL;
    }

    /**
     * Checks if code is a 2xx, representing the SUCCESSFUL category.
     *
     * @return <code>true</code> if code represents a 2XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isSuccessful() {

        return this == SUCCESSFUL;
    }

    /**
     * Checks if code is a 3XX, representing the REDIRECTION category.
     *
     * @return <code>true</code> if code represents a 3XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isRedirect() {

        return this == REDIRECTION;
    }

    /**
     * Checks if code is a 4XX, representing the CLIENT ERROR category.
     *
     * @return <code>true</code> if code represents a 4XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isClientError() {

        return this == CLIENT_ERROR;
    }

    /**
     * Checks if code is a 5XX, representing the SERVER ERROR category.
     *
     * @return <code>true</code> if code represents a 5XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isServerError() {
        return this == SERVER_ERROR;
    }

    public static HttpStatusCodeType resolve(int statusCode) {

        if (!HttpStatusCode.isValidValue(statusCode)) {
            throw new IllegalArgumentException(String.format("Code [%d] is not valid.", statusCode));
        }

        for (HttpStatusCodeType category : values()) {
            if (statusCode / 100 == category.value) {
                return category;
            }
        }

        if (statusCode == HttpStatusCode.ORIGIN_DNS_ERROR_2.getCode()) {
            return SERVER_ERROR;
        }

        throw new IllegalArgumentException(String.format("Code [%d] is not valid.", statusCode));
    }
}
