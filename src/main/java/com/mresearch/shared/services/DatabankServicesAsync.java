package com.mresearch.shared.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

public interface DatabankServicesAsync {
  void getServiceName(AsyncCallback<String> async);

  void getLayout(String name, AsyncCallback<String> async);
}
