/*
 * Copyright (c) 2015 EDMI NZ
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of EDMI. 
 * ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with EDMI.
 */
package nz.co.edmi.servicemixdemo;

import java.io.InputStream;
import java.net.URL;


import org.apache.camel.builder.RouteBuilder;

public class URLFetcher extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    from("file:///Users/simonvandersluis/camel/URLFetcher")
            .convertBodyTo(String.class)
            .convertBodyTo(URL.class)
            .convertBodyTo(InputStream.class)
            .to("file:///Users/simonvandersluis/camel/dump");
  }
}
