package com.mresearch.server.business;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 3/29/14
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Component("kiisArchiver")
public class KiisArchiverImpl implements Archiver {
  public String getServiceName() {
    return "KIIS Institute archiver";  //To change body of implemented methods use File | Settings | File Templates.
  }
}
