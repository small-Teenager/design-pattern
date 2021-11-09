package decorator.service.impl;

import decorator.service.Zoo;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/4 10:50
 */
public class TigerZoo implements Zoo {
    @Override
    public void makeArchitecture() {
        System.err.println("Zoo: makeArchitecture Tiger");
    }
}
