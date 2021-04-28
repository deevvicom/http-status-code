package com.deevvi.httpstatuscode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Tests for {@link HttpStatusCode} class.
 */
public class HttpStatusCodeTest {

    @Test
    public void testInvalidCode() {

        //call
        Assertions.assertThrows(IllegalArgumentException.class, () -> HttpStatusCode.resolve(30));
    }

    @Test
    public void testInfoStatusCode() {

        //call
        HttpStatusCode code = HttpStatusCode.resolve(100);
        HttpStatusCode statusCode = HttpStatusCode.resolve(100);
        statusCode.isSuccessful();
        //verify
        assertThat(code.getName()).isEqualTo("Continue");
        assertThat(code.getSource()).isEqualTo(HttpStatusSource.RFC_7231);
        assertThat(code.isOfficial()).isTrue();
        assertThat(code.isInformational()).isTrue();
    }

    @Test
    public void testInvalidValue() {

        assertThat(HttpStatusCode.isValidValue(999)).isFalse();
    }
}
