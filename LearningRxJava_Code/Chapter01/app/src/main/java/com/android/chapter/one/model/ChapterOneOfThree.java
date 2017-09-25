package com.android.chapter.one.model;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

@Module
public class ChapterOneOfThree {

    @Provides
    public ChapterOneOfThree providesObject(){
        return new ChapterOneOfThree();
    }

    public void methodOneOfThree() {
        Observable<Long> secondIntervals =
                Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(s -> System.out.println(s));
/* Hold main thread for 5 secondsso Observable above has chance to fire */
        sleep(5000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}