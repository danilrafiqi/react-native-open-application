package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

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
    private boolean openApplication(Promise promise, String packageName) {
        PackageManager pm = this.reactContext.getPackageManager();
        try {
            this.reactContext.startActivity(pm.getLaunchIntentForPackage(packageName));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
