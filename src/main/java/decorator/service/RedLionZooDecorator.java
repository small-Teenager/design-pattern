package decorator.service;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/4 10:29
 */
public class RedLionZooDecorator extends ZooDecoratorAbs {

    public RedLionZooDecorator(Zoo decoratedZoo) {
        super(decoratedZoo);
    }

    @Override
    public void makeArchitecture() {
        zoo.makeArchitecture();
        setRedEnclosure(zoo);
    }

    private void setRedEnclosure(Zoo zoo) {
        System.err.println("Zoo Enclosure: Red");
    }
}
