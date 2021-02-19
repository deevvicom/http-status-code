package com.deevvi.httpstatuscode;

import org.junit.Assert;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Tests for {@link HttpStatusCodeType} class.
 */
public class HttpStatusCodeTypeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidValue() {

        //call
        HttpStatusCodeType.resolve(20);
    }

    @Test
    public void testInformationalCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(100);

        //verify
        assertThat(type).isNotNull();
        assertThat(type).isEqualTo(HttpStatusCodeType.INFORMATIONAL);
        assertThat(type.isInformational()).isTrue();
        assertThat(type.isServerError()).isTrue();
    }

    @Test
    public void testSuccessCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(201);

        //verify
        assertThat(type).isNotNull();
        assertThat(type.isSuccessful()).isTrue();
    }

    @Test
    public void testRedirectCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(302);

        //verify
        assertThat(type).isNotNull();
        assertThat(type.isRedirect()).isTrue();
    }

    @Test
    public void testUserErrorCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(404);

        //verify
        assertThat(type).isNotNull();
        assertThat(type.isClientError()).isTrue();
        assertThat(type.isRedirect()).isFalse();
    }

    @Test
    public void testServerErrorCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(502);

        //verify
        assertThat(type).isNotNull();
        assertThat(type.isServerError()).isTrue();
    }

    @Test
    public void testServerErrorCode1016() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(1016);

        //verify
        assertThat(type).isNotNull();
        assertThat(type.isServerError()).isTrue();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidErrors() {

        //call
        HttpStatusCodeType.resolve(333);
    }

}
