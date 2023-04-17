package com.senlainc.model;

import com.senlainc.di.InjectProperty;
import com.senlainc.di.Singleton;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("filmB")
    private String film;

    public RecommendatorImpl() {
        System.out.println("recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("cool movie "+ film);
    }
}
