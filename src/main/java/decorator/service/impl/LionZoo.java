package decorator.service.impl;

import decorator.service.Zoo;

/**
 * @description: 狮子园
 * @author: yaodong zhang
 * @date: 2021/11/4 10:27
 */
public class LionZoo implements Zoo {

    @Override
    public void makeArchitecture() {
        System.err.println("Zoo: makeArchitecture Lion");
    }
}
