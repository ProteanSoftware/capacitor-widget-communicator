package com.proteansoftware.capacitor.widgetCommunicator;

import com.getcapacitor.JSArray;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

@NativePlugin
public class WidgetCommunicator extends Plugin {

  public static WidgetData WidgetData = new WidgetData();

  @PluginMethod
  public void updateWidgetData(PluginCall call) {
    JSArray value = call.getArray("data");

    try {
      List<JSONObject> data = value.toList();
      WidgetData.setWidgetData(data);
      call.success();
    } catch (JSONException e) {
      call.error(e.getMessage(), e);
    }
  }
}
