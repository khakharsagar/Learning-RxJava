package com.android.chapter.one.model;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;

@Module
public class ChapterOneOfTwo {

    @Provides
    public ChapterOneOfTwo providesObject(){
        return new ChapterOneOfTwo();
    }

    public void methodOneOfTwo() {
        Observable<String> myStrings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        myStrings.map(s -> s.length()).subscribe(s ->
                System.out.println(s));
    }
}