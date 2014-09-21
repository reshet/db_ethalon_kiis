package com.mresearch.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA.
 * User: reshet
 * Date: 4/14/14
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class DynamicLayout extends Composite {
  interface DynamicLayoutUiBinder extends UiBinder<Widget, DynamicLayout> {}

  private static final DynamicLayoutUiBinder binder = GWT.create(DynamicLayoutUiBinder.class);

  public DynamicLayout(){

  }

}
