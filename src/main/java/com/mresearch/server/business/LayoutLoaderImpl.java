package com.mresearch.server.business;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 4/13/14
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Component("layoutManager")
public class LayoutLoaderImpl implements LayoutLoader {
  public String loadLayout(String name){
    StringBuilder contents = new StringBuilder();
    //return "<b>Some layout html for "+name+"</b></br>";
    InputStream inputStream = null;
    Resource resource = null;
    try {
      try{
        resource = new FileSystemResource("src/main/java/com/mresearch/layout/"+name+".xml");
       //resource = new FileSystemResource("src/sample.txt");
        inputStream = resource.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
          contents.append(scanner.nextLine());
        }
      }finally {
        if (inputStream != null) {
          inputStream.close();
        }
      }
    }catch (IOException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }

    return contents.toString();
  }

}
