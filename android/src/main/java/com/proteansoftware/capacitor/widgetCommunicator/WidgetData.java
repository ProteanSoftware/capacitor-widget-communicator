package com.proteansoftware.capacitor.widgetCommunicator;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WidgetData extends Observable {
  public List<JSONObject> WidgetData = new ArrayList<JSONObject>();

  public List getWidgetData() {
    return WidgetData;
  }

  public void setWidgetData(List<JSONObject> widgetData) {
    this.WidgetData = widgetData;
    setChanged();
    notifyObservers();
  }
}