package com.android.chapter.one.viewmodel;

import android.view.View.OnClickListener;
import com.android.chapter.one.component.DaggerMainActivityModelComponent;
import com.android.chapter.one.component.MainActivityModelComponent;
import com.android.chapter.one.model.ChapterOneOfOne;
import com.android.chapter.one.model.ChapterOneOfThree;
import com.android.chapter.one.model.ChapterOneOfTwo;
import javax.inject.Inject;

/**
 * Created by sagarkhakhar on 24/09/17.
 */

public class MainActivityModel {

  @Inject
  ChapterOneOfOne mChapterOneOfOne;

  @Inject
  ChapterOneOfTwo mChapterOneOfTwo;

  @Inject
  ChapterOneOfThree mChapterOneOfThree;

  public MainActivityModel(){
    MainActivityModelComponent build = DaggerMainActivityModelComponent.create();
    build.inject(this);
  }

  public OnClickListener setOnButtonClickOne(){
    return view -> {
      mChapterOneOfOne.methodOneOfOne();
    };
  }


  public OnClickListener setOnButtonClickTwo(){
    return view -> {
      mChapterOneOfTwo.methodOneOfTwo();
    };
  }

  public OnClickListener setOnButtonClickThree(){
    return view -> {
      mChapterOneOfThree.methodOneOfThree();
    };
  }
}
