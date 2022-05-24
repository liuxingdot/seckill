package com.jesper.seckill.redis;

public class GoodsKey extends BasePrefix {

    private GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static GoodsKey getGoodsList = new GoodsKey(60, "gl");  //商品信息
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd"); //商品详细信息
    public static GoodsKey getGoodsStock = new GoodsKey(0, "gs");   //商品库存
}
