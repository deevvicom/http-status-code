package com.deevvi.httpstatuscode;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertNotNull(type);
        Assert.assertEquals(type, HttpStatusCodeType.INFORMATIONAL);
        Assert.assertTrue(type.isInformational());
        Assert.assertFalse(type.isServerError());
    }

    @Test
    public void testSuccessCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(201);

        //verify
        Assert.assertNotNull(type);
        Assert.assertTrue(type.isSuccessful());
    }

    @Test
    public void testRedirectCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(302);

        //verify
        Assert.assertNotNull(type);
        Assert.assertTrue(type.isRedirect());
    }

    @Test
    public void testUserErrorCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(404);

        //verify
        Assert.assertNotNull(type);
        Assert.assertTrue(type.isClientError());
    }

    @Test
    public void testServerErrorCode() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(502);

        //verify
        Assert.assertNotNull(type);
        Assert.assertTrue(type.isServerError());
    }

    @Test
    public void testServerErrorCode1016() {

        //call
        HttpStatusCodeType type = HttpStatusCodeType.resolve(1016);

        //verify
        Assert.assertNotNull(type);
        Assert.assertTrue(type.isServerError());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidErrors() {

        //call
        HttpStatusCodeType.resolve(333);
    }

}
