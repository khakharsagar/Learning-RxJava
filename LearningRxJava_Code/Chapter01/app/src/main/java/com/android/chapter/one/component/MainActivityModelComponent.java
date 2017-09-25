package com.android.chapter.one.component;

import com.android.chapter.one.activity.MainActivity;
import com.android.chapter.one.model.ChapterOneOfOne;
import com.android.chapter.one.model.ChapterOneOfThree;
import com.android.chapter.one.model.ChapterOneOfTwo;
import com.android.chapter.one.viewmodel.MainActivityModel;
import dagger.Component;

/**
 * Created by sagarkhakhar on 24/09/17.
 */

@Component(modules = {ChapterOneOfOne.class, ChapterOneOfTwo.class, ChapterOneOfThree.class})
public interface MainActivityModelComponent {
  void inject(MainActivityModel mainActivityModel);
}
