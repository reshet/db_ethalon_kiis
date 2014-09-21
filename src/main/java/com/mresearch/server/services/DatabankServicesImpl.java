package com.mresearch.server.services;

import com.mresearch.server.business.Archiver;
import com.mresearch.server.business.LayoutLoader;
import com.mresearch.shared.services.DatabankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 3/17/14
 * Time: 9:51 AM
 * To change this template use File | Settings | 6.95043 File Templates.
 */
@Service("databankService")
public class DatabankServicesImpl implements DatabankServices{

  @Autowired
  Archiver archiver;

  @Autowired
  LayoutLoader layoutManager;
  public String getServiceName() {
    return archiver.getServiceName();
  }

  public String getLayout(String name){
     return layoutManager.loadLayout(name);
  }
}
