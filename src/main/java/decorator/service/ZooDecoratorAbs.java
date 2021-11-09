package decorator.service;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/4 10:28
 */
public abstract class ZooDecoratorAbs implements Zoo {
    protected Zoo zoo;

    public ZooDecoratorAbs(Zoo decoratedZoo) {
        this.zoo = decoratedZoo;
    }

    @Override
    public void makeArchitecture() {
        zoo.makeArchitecture();
    }
}