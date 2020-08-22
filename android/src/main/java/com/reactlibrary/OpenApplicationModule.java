package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class OpenApplicationModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public OpenApplicationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "OpenApplication";
    }

    @ReactMethod
    private void openApplication(String packageName, Promise promise) {
        PackageManager pm = this.reactContext.getPackageManager();
        try {
            this.reactContext.startActivity(pm.getLaunchIntentForPackage(packageName));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
