
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Base64;

import com.tarek360.instacapture.Instacapture;
import com.tarek360.instacapture.listener.SimpleScreenCapturingListener;

import java.io.ByteArrayOutputStream;


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


    @ReactMethod
    public void takeScreenshot(ReadableMap config, final Callback successCallback, final Callback cancelCallback) {
        Activity currentActivity = getCurrentActivity();

        Instacapture.capture(currentActivity, new SimpleScreenCapturingListener() {
            @Override
            public void onCaptureComplete(Bitmap bitmap) {
                try {
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                    byte[] b = baos.toByteArray();
                    String temp = Base64.encodeToString(b, Base64.DEFAULT);

                    successCallback.invoke(temp);

                } catch (Exception e) {
                    cancelCallback.invoke(e);
                }

            }
        }, null);




    }

}