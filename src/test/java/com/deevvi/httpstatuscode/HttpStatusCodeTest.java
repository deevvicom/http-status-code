package com.deevvi.httpstatuscode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link HttpStatusCode} class.
 */
public class HttpStatusCodeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCode() {

        //call
        HttpStatusCode.resolve(30);
    }

    @Test
    public void testInfoStatusCode() {

        //call
        HttpStatusCode code = HttpStatusCode.resolve(100);
        HttpStatusCode statusCode = HttpStatusCode.resolve(100);
        statusCode.isSuccessful();
        //verify
        Assert.assertEquals("Continue", code.getName());
        Assert.assertEquals(HttpStatusSource.RFC_7231, code.getSource());
        Assert.assertTrue(code.isOfficial());
        Assert.assertTrue(code.isInformational());
    }

    @Test
    public void testInvalidValue() {

        Assert.assertFalse(HttpStatusCode.isValidValue(999));
    }
}
