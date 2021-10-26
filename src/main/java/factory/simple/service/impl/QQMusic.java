package factory.simple.service.impl;

import factory.simple.service.Music;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:18
 */
public class QQMusic implements Music {

    @Override
    public void play() {
     System.err.println("使用QQ音乐播放");
    }
}
