package com.carry.httprequest.http.persenter;

import com.carry.httprequest.http.HttpMethods;
import com.carry.httprequest.http.entity.GoodsEntity;

import java.util.List;

import rx.Observable;
import rx.Subscriber;


public class GoodsPresenter extends HttpMethods {
    public static void listByKeywords(Subscriber<List<GoodsEntity>> subscriber, String keywords){
        Observable<List<GoodsEntity>> observable = goodsService.listByKeywords(keywords)
                .map(new HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable, subscriber);
    }
}
