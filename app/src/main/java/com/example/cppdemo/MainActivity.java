package com.example.cppdemo;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private class MyThread extends Thread{
        public void run(){
            String command = "start x";
            command += " -c -l 0.0.0.0:3333 -r 10.0.2.2:4096 -a --raw-mode faketcp";
            startService(command);
        }
    }
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public void click(View view){
        MyThread thread = new MyThread();
        thread.start();
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     * To start the tunnel
     */
    public native void startService(String str);
}
