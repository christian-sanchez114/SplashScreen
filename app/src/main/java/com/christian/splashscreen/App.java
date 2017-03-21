package com.christian.splashscreen;

import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by christian on 21/03/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 3 secs
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));
    }
}
