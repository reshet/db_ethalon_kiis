package com.mresearch.server.business;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 4/13/14
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */

public class LayoutLoaderImplTest {
  public static void main(String[] args) {
    LayoutLoaderImpl layoutM = new LayoutLoaderImpl();
    System.out.println(layoutM.loadLayout("layout1"));
    System.out.println(layoutM.loadLayout("layout2"));

  }
}
