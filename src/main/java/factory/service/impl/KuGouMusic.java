package factory.service.impl;

import factory.service.Music;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:22
 */
public class KuGouMusic implements Music {
    @Override
    public void play() {
        System.err.println("使用酷狗播放");
    }
}
