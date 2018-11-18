
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

  protected void showAlertDialog() {
    AlertDialogFragment.newInstance(R.string.dialog_title, R.string.dialog_message)
            .show(getSupportFragmentManager(), "dialogFragment");
}

protected void captureScreenshot(@Nullable View... ignoredViews) {

    Instacapture.capture(this, new SimpleScreenCapturingListener() {
        @Override
        public void onCaptureComplete(Bitmap bitmap) {

            Utility.getScreenshotFileObservable(BaseSampleActivity.this, bitmap)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Action1<File>() {
                        @Override
                        public void call(File file) {

                            startActivity(ShowScreenShotActivity.buildIntent(BaseSampleActivity.this,
                                    file.getAbsolutePath()));
                        }
                    });
        }
    }, ignoredViews);


    Instacapture.captureRx(this, ignoredViews).subscribe(new Action1<Bitmap>() {
        @Override
        public void call(Bitmap bitmap) {

        }
    });

}
}