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
package nz.co.edmi.servicemixdemo.json;



import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.thoughtworks.xstream.XStream;

public class FooBarWriter {

  private Foo foo;
  private Gson gson;
  private XStream xstream;

  @Before
  public void createMarshallers() {
    gson = new Gson();
    xstream = new XStream();
  }

  @Before
  public void createFooBar() {
    foo = new Foo("test foo");
    foo.addBar(new Bar(10, 50));
    foo.addBar(new Bar(100, 500));
    foo.addBar(new Bar(1000, 5000));
  }


  @Ignore("Not really a test, but useful for creating json")
  @Test
  public void writeFooBarJson() {
    System.out.print(gson.toJson(foo));
  }

  @Ignore("Not really a test, but useful for creating xml")
  @Test
  public void writeFooBarXml() {
    System.out.print(xstream.toXML(foo));
  }

}
