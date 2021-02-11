package com.deevvi.httpstatuscode;

/**
 * Collection of all known HTTP response status codes.
 */
public enum HttpStatusCode {

    /**
     * 1XX
     */
    CONTINUE(100, "Continue", HttpStatusSource.RFC_7231, true),
    SWITCHING_PROTOCOL(101, "Switching Protocols", HttpStatusSource.RFC_7231, true),
    PROCESSING(102, "Processing", HttpStatusSource.RFC_2518, true),
    EARLY_HINTS(103, "Early Hints", HttpStatusSource.RFC_8297, true),

    /**
     * 2XX
     */
    OK(200, "Ok", HttpStatusSource.RFC_7231, true),
    CREATED(201, "Created", HttpStatusSource.RFC_7231, true),
    ACCEPTED(202, "Accepted", HttpStatusSource.RFC_7231, true),
    NON_AUTH_INFO(203, "Non-Authoritative Information", HttpStatusSource.RFC_7231, true),
    NO_CONTENT(204, "No Content", HttpStatusSource.RFC_7231, true),
    RESET_CONTENT(205, "Reset Content", HttpStatusSource.RFC_7231, true),
    PARTIAL_CONTENT(206, "Partial Content", HttpStatusSource.RFC_7233, true),
    MULTI_STATUS(207, "Multi-Status", HttpStatusSource.RFC_4918, true),
    ALREADY_REPORTED(208, "Already Reported", HttpStatusSource.RFC_5842, true),
    THIS_IS_FINE(218, "This Is Fine", HttpStatusSource.APACHE_WEB_SERVER, false),
    IM_USED(226, "IM Used", HttpStatusSource.RFC_3229, true),

    /**
     * 3XX
     */
    MULTIPLE_CHOICES(300, "Multiple Choices", HttpStatusSource.RFC_7231, true),
    MOVED_PERMANENTLY(301, "Moved Permanently", HttpStatusSource.RFC_7231, true),
    FOUND(302, "Found", HttpStatusSource.RFC_7231, true),
    SEE_OTHER(303, "See Other", HttpStatusSource.RFC_7231, true),
    NOT_MODIFIED(304, "Not Modified", HttpStatusSource.RFC_7232, true),
    USE_PROXY(305, "Use Proxy", HttpStatusSource.RFC_7231, true),
    SWITCH_PROXY(306, "Switch Proxy", HttpStatusSource.RFC_2616, true),
    TEMPORARY_REDIRECT(307, "Temporary Redirect", HttpStatusSource.RFC_7231, true),
    PERMANENT_REDIRECT(308, "Permanent Redirect", HttpStatusSource.RFC_7538, true),

    /**
     * 4XX
     */
    BAD_REQUEST(400, "Bad Request", HttpStatusSource.RFC_7231, true),
    UNAUTHORIZED(401, "Unauthorized", HttpStatusSource.RFC_7235, true),
    PAYMENT_REQUIRED(402, "Payment Required", HttpStatusSource.RFC_7235, true),
    FORBIDDEN(403, "Forbidden", HttpStatusSource.RFC_7231, true),
    NOT_FOUND(404, "Not Found", HttpStatusSource.RFC_7231, true),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", HttpStatusSource.RFC_7231, true),
    NOT_ACCEPTABLE(406, "Not Acceptable", HttpStatusSource.RFC_7231, true),
    PROXY_AUTH_REQUIRED(407, "Proxy Authentication Required ", HttpStatusSource.RFC_7235, true),
    REQUEST_TIMEOUT(408, "Request Timeout", HttpStatusSource.RFC_7231, true),
    CONFLICT(409, "Conflict", HttpStatusSource.RFC_7231, true),
    GONE(410, "Gone", HttpStatusSource.RFC_7231, true),
    LENGTH_REQUIRED(411, "Length Required", HttpStatusSource.RFC_7231, true),
    PRECONDITION_FAILED(412, "Precondition Failed", HttpStatusSource.RFC_7232, true),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large", HttpStatusSource.RFC_7231, true),
    URI_TOO_LONG(414, "URI Too Long", HttpStatusSource.RFC_7231, true),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type", HttpStatusSource.RFC_7231, true),
    RANGE_NOT_SATISFIABLE(416, "Range Not Satisfiable", HttpStatusSource.RFC_7233, true),
    EXPECTATION_FAILED(417, "Expectation Failed", HttpStatusSource.RFC_7231, true),
    I_M_A_TEAPOT(418, "I'm a teapot", HttpStatusSource.RFC_2324, true),
    PAGE_EXPIRED(419, "Page Expired", HttpStatusSource.LARAVEL_FRAMEWORK, false),
    METHOD_FAILURE(420, "Method Failure", HttpStatusSource.SPRING_FRAMEWORK, false),
    ENHANCE_YOUR_CALM(420, "Enhance Your Calm", HttpStatusSource.TWITTER, false),
    MISDIRECTED_REQUEST(421, "Misdirected Request", HttpStatusSource.RFC_7540, true),
    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity", HttpStatusSource.RFC_4918, true),
    LOCKED(423, "Locked", HttpStatusSource.RFC_4918, true),
    FAILED_DEPENDENCY(424, "Failed Dependency", HttpStatusSource.RFC_4918, true),
    TOO_EARLY(425, "Too Early", HttpStatusSource.RFC_8470, true),
    UPGRADE_REQUIRED(426, "Upgrade Required", HttpStatusSource.RFC_7231, true),
    PRECONDITION_REQUIRED(427, "Precondition Required", HttpStatusSource.RFC_6585, true),
    TOO_MANY_REQUESTS(429, "Too Many Requests", HttpStatusSource.RFC_6585, true),
    REQUEST_HEADER_FIELDS_TOO_LARGE_SHOPIFY(430, "Request Header Fields Too Large", HttpStatusSource.SHOPIFY, false),
    REQUEST_HEADER_FIELDS_TOO_LARGE(431, "Request Header Fields Too Large", HttpStatusSource.RFC_6585, true),
    LOGIN_TIMEOUT(440, "Login Time-out", HttpStatusSource.INTERNET_INFORMATION_SERVICES, false),
    NO_RESPONSE(444, "No Response", HttpStatusSource.NGINX, false),
    RETRY_WITH(449, "Retry With", HttpStatusSource.INTERNET_INFORMATION_SERVICES, false),
    BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS(450, "Blocked by Windows Parental Controls", HttpStatusSource.MICROSOFT, false),
    REDIRECT(451, "Redirect", HttpStatusSource.INTERNET_INFORMATION_SERVICES, false),
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "Unavailable For Legal Reasons", HttpStatusSource.RFC_7725, true),
    HTTP_ELB_460(460, "HTTP ELB 460", HttpStatusSource.AWS_ELB, false),
    HTTP_ELB_463(463, "HTTP ELB 463", HttpStatusSource.AWS_ELB, false),
    HTTP_ELB_464(464, "HTTP ELB 464", HttpStatusSource.AWS_ELB, false),
    REQUEST_HEADER_TOO_LARGE(494, "Request header too large", HttpStatusSource.NGINX, false),
    SSL_CERTIFICATE_ERROR(495, "SSL Certificate Error", HttpStatusSource.NGINX, false),
    SSL_CERTIFICATE_REQUIRED(496, "SSL Certificate Required", HttpStatusSource.NGINX, false),
    HTTP_REQUEST_SENT_TO_HTTPS_PORT(497, "HTTP Request Sent to HTTPS Port", HttpStatusSource.NGINX, false),
    INVALID_TOKEN(498, "Invalid Token", HttpStatusSource.ESRL, false),
    TOKEN_REQUIRED(499, "Token Required", HttpStatusSource.ESRL, false),
    CLIENT_CLOSED_REQUEST(499, "Client Closed Request", HttpStatusSource.NGINX, false),


    /**
     * 5XX
     */
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", HttpStatusSource.RFC_7231, true),
    NOT_IMPLEMENTED(501, "Not Implemented", HttpStatusSource.RFC_7231, true),
    BAD_GATEWAY(502, "Bad Gateway", HttpStatusSource.RFC_7231, true),
    SERVICE_UNAVAILABLE(503, "Service Unavailable", HttpStatusSource.RFC_7231, true),
    GATEWAY_TIMEOUT(504, "Gateway Timeout", HttpStatusSource.RFC_7231, true),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported", HttpStatusSource.RFC_7231, true),
    VARIANT_ALSO_NEGOTIATES(506, "Variant Also Negotiates", HttpStatusSource.RFC_2295, true),
    INSUFFICIENT_STORAGE(507, "Insufficient Storage", HttpStatusSource.RFC_4918, true),
    LOOP_DETECTED(508, "Loop Detected", HttpStatusSource.RFC_5842, true),
    NOT_EXTENDED(510, "Not Extended", HttpStatusSource.RFC_2774, true),
    NETWORK_AUTHENTICATION_REQUIRED(511, "Network Authentication Required", HttpStatusSource.RFC_6585, true),
    BANDWIDTH_LIMIT_EXCEEDED(509, "Bandwidth Limit Exceeded", HttpStatusSource.APACHE_WEB_SERVER, false),
    WEB_SERVER_RETURNED_AN_UNKNOWN_ERROR(520, "Web Server Returned an Unknown Error", HttpStatusSource.CLOUDFLARE, false),
    WEB_SERVER_IS_DOWN(521, "Web Server Is Down", HttpStatusSource.CLOUDFLARE, false),
    CONNECTION_TIMED_OUT(522, "Connection Timed Out", HttpStatusSource.CLOUDFLARE, false),
    ORIGIN_IS_UNREACHABLE(523, "Origin Is Unreachable", HttpStatusSource.CLOUDFLARE, false),
    A_TIMEOUT_OCCURRED(524, "A Timeout Occurred", HttpStatusSource.CLOUDFLARE, false),
    SSL_HANDSHAKE_FAILED(525, "SSL Handshake Failed", HttpStatusSource.CLOUDFLARE, false),
    INVALID_SSL_CERTIFICATE(526, "Invalid SSL Certificate", HttpStatusSource.CLOUDFLARE, false),
    RAILGUN_ERROR(527, "Railgun Error", HttpStatusSource.CLOUDFLARE, false),
    SITE_IS_OVERLOADED(529, "Site is overloaded", HttpStatusSource.QUALYS, false),
    SITE_IS_FROZEN(530, "Site is frozen", HttpStatusSource.PANTHEON, false),
    ORIGIN_DNS_ERROR(530, "Origin DNS Error", HttpStatusSource.PANTHEON, false),
    UNAUTHORIZED_AWS_ELB(561, "Unauthorized", HttpStatusSource.AWS_ELB, false),
    NETWORK_READ_TIMEOUT_ERROR(598, "Network read timeout error", HttpStatusSource.UNKNOWN, false),
    NETWORK_CONNECT_TIMEOUT_ERROR(599, "Network connect timeout error", HttpStatusSource.UNKNOWN, false),

    /**
     * Others
     */
    ORIGIN_DNS_ERROR_2(1016, "Origin DNS Error", HttpStatusSource.PANTHEON, false);


    /**
     * Constructor.
     */
    HttpStatusCode(int code, String name, HttpStatusSource source, boolean official) {

        this.code = code;
        this.name = name;
        this.source = source;
        this.official = official;
    }

    /**
     * The HTTP code.
     */
    private final int code;

    /**
     * The name of the HTTP code.
     */
    private final String name;

    /**
     * The RFC where the code is documented or the company that released the code.
     */
    private final HttpStatusSource source;

    /**
     * Flag to inform if the code is official (aka part of a RFC) or
     * if it was released by another entity and consequently is not part of the standard.
     */
    private final boolean official;


    /**
     * Get the HTTP status code.
     *
     * @return the HTTP status code.
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP status name.
     *
     * @return the HTTP status name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the RFC where the code was published or the entity that released it.
     *
     * @return the RFC where the code was published or the entity that released it.
     */
    public HttpStatusSource getSource() {
        return source;
    }

    /**
     * Return the flag if the code is official or if it's an informal one.
     *
     * @return <code>true</code> if code is part of a RFC, <code>false</code> if code was released by another entity.
     */
    public boolean isOfficial() {
        return official;
    }

    /**
     * Checks if code is a 1XX, representing the INFO category.
     *
     * @return <code>true</code> if code represents a 1XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isInformational() {

        return HttpStatusCodeType.resolve(code) == HttpStatusCodeType.INFORMATIONAL;
    }

    /**
     * Checks if code is a 2xx, representing the SUCCESSFUL category.
     *
     * @return <code>true</code> if code represents a 2XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isSuccessful() {

        return HttpStatusCodeType.resolve(code).isSuccessful();
    }

    /**
     * Checks if code is a 3XX, representing the REDIRECTION category.
     *
     * @return <code>true</code> if code represents a 3XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isRedirect() {

        return HttpStatusCodeType.resolve(code).isRedirect();
    }

    /**
     * Checks if code is a 4XX, representing the CLIENT ERROR category.
     *
     * @return <code>true</code> if code represents a 4XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isClientError() {

        return HttpStatusCodeType.resolve(code).isClientError();
    }

    /**
     * Checks if code is a 5XX, representing the SERVER ERROR category.
     *
     * @return <code>true</code> if code represents a 5XX HTTP status code, <code>false</code> otherwise.
     */
    public boolean isServerError() {

        return HttpStatusCodeType.resolve(code).isServerError();
    }

    /**
     * Convert an integer into an HTTP status code.
     *
     * @param code integer value.
     * @return the HTTP status code
     * @throws IllegalArgumentException - if code provided cannot be translated to a HTTP status code
     */
    public static HttpStatusCode resolve(int code) {

        for (HttpStatusCode statusCode : values()) {
            if (statusCode.code == code) {

                return statusCode;
            }
        }

        throw new IllegalArgumentException(String.format("No valid code found for value [%d]", code));
    }

    /**
     * Checks if a numeric value represents a valid HTTP status code
     *
     * @param code numeric value
     * @return <code>true</code> if code provided represents a valid HTTP status code, <code>false</code> otherwise
     */
    public static boolean isValidValue(int code) {

        for (HttpStatusCode statusCode : values()) {
            if (statusCode.code == code) {

                return true;
            }
        }

        return false;
    }
}
