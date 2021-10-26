package factory.abs.service.impl;

import factory.abs.service.MusicMethod;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:22
 */
public class KuGouMusicMethod implements MusicMethod {

    @Override
    public void play() {
        System.err.println("使用酷狗播放");
    }
}
