package factory.simple.service;

import factory.simple.service.impl.KuGouMusic;
import factory.simple.service.impl.QQMusic;
import factory.simple.service.impl.WYYMusic;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:25
 */
public class MusicFactory {

    /**
     * 生成不同类型的工厂类
     * @param type
     * @return
     */
    public Music getMusic(String type) {
        Music music = null;
        if (type.equals("kugou")) {
            music = new KuGouMusic();
        } else if (type.equals("QQ")) {
            music = new QQMusic();
        } else if (type.equals("wangyiyun")) {
            music = new WYYMusic();
        }
        return music;
    }
}
