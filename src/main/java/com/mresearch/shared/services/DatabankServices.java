package com.mresearch.shared.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 3/17/14
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
@RemoteServiceRelativePath("rpc/databankService")
public interface DatabankServices extends RemoteService {

  public String getServiceName();
  public String getLayout(String name);

}
