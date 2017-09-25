package com.android.chapter.one.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.android.chapter.one.R;
import com.android.chapter.one.databinding.ActivityMainBinding;
import com.android.chapter.one.viewmodel.MainActivityModel;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    activityMainBinding.setViewModel(new MainActivityModel());
  }
}
