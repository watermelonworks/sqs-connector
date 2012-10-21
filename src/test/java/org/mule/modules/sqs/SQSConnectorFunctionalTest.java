/**
 * Mule SQS Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules.sqs;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class SQSConnectorFunctionalTest extends FunctionalTestCase {

    @Override
    protected String getConfigResources() {
        return "sqs.xml";
    }

    // TODO: Unit Test each Connector method.
    
    @Ignore("Rewrite this test! It was trying to hit an actual Amazon instance.")
    @Test
    public void testSendMessage() throws Exception {
        Assert.assertTrue(true);
    }
}
