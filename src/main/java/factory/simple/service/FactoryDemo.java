package factory.simple.service;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:32
 * 工厂模式
 */
public class FactoryDemo {

    public static void main(String args[]) {
        MusicFactory musicFactory = new MusicFactory();
        Music music = musicFactory.getMusic("QQ");
        music.play();
    }
}
