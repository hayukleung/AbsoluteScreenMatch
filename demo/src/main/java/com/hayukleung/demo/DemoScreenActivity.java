package com.hayukleung.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * 屏幕适配
 *
 * Created by hayukleung on 12/14/15.
 */
public class DemoScreenActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo_screen);

    View view = findViewById(R.id.square);
    ViewGroup.LayoutParams params = view.getLayoutParams();

    Log.d(getString(R.string.app_name),
        String.format("view-width --> %d, view-height --> %d", params.width, params.height));
  }
}
