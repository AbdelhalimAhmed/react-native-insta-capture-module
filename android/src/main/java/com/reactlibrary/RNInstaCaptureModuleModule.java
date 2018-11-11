
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;

public class RNInstaCaptureModuleModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNInstaCaptureModuleModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNInstaCaptureModule";
  }

  @ReactMethod //to expose a method to JavaScript
  public void getModuleList(final Callback callback) {
    try {
        WritableArray list = getList();
        callback.invoke(null, list);
    } catch (Exception e) {
        callback.invoke("Error", null);
    }
  }


  private WritableArray getList() {
    WritableArray listArr = Arguments.createArray();
    listArr.pushString("Halim is here");
    listArr.pushString("react-native-camera");
    listArr.pushString("react-native-map");

    return listArr;
  }
}