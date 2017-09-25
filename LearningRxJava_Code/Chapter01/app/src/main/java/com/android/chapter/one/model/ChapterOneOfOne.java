package com.android.chapter.one.model;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;

@Module
public class ChapterOneOfOne {

  @Provides
  public ChapterOneOfOne providesObject(){
    return new ChapterOneOfOne();
  }
    public void methodOneOfOne() {
        Observable<String> myStrings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        myStrings.subscribe(s -> System.out.println(s));
    }
}