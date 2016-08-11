package com.smallplanet.tyberg.tammy.hellojni4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static native String getStringFromNative();

    static {
        System.loadLibrary("helloJni");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView field = (TextView)findViewById(R.id.text);
        field.setText(getStringFromNative());
    }
}
