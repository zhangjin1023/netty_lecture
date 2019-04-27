package com.shengsiyuan.netty.firstexample;

import io.netty.channel.nio.NioEventLoopGroup;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 张锦
 * @date: 2019/4/27 13:37
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
public class TestServer {
    public static void main(String[] args){
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
    }
}
