package factory.service.impl;

import factory.service.Music;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:24
 */
public class WYYMusic implements Music {

    @Override
    public void play() {
        System.err.println("使用网易云音乐播放");
    }
}
