package factory.abs.service;


/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/25 11:32
 * 工厂方法模式
 */
public class MethodFactoryDemo {

    public static void main(String args[]) {
        MethodMusicFactory musicFactory = new KuGouMusicFactory();
        musicFactory.makeMusic().play();
    }
}
