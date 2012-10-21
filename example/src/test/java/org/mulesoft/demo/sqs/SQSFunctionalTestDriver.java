/**
 * Mule SQS Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mulesoft.demo.sqs;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.construct.Flow;
import org.mule.tck.junit4.FunctionalTestCase;

/**
 * @author Adrian Cole
 */
public class SQSFunctionalTestDriver extends FunctionalTestCase {

   @Override
   protected String getConfigResources() {
      return "mule-config.xml";
   }

   @Test
   public void testProduceAndConsume() throws Exception {
      MuleEvent event = getTestEvent("");
      event.getMessage().setPayload("Hello world");
      MuleEvent process = lookupFlowConstruct("producer").process(event);
      assertNull(process.getMessage().getExceptionPayload());
   }

   private Flow lookupFlowConstruct(final String name) {
      return (Flow) muleContext.getRegistry().lookupFlowConstruct(name);
   }

}
