package com.proteansoftware.capacitor.widgetCommunicator;

import com.getcapacitor.JSArray;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import org.json.JSONException;

import java.util.Collections;
import java.util.List;

@NativePlugin
public class WidgetCommunicator extends Plugin {

    public static List WidgetData = null;

    @PluginMethod
    public void updateWidgetData(PluginCall call) {
        JSArray value = call.getArray("data");

        try {
            WidgetData = Collections.unmodifiableList(value.toList());
            call.success();
        } catch (JSONException e) {
            call.error(e.getMessage(), e);
        }
    }
}
