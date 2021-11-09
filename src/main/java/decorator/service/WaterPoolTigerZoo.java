package decorator.service;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/4 10:54
 */
public class WaterPoolTigerZoo extends ZooDecoratorAbs{

    public WaterPoolTigerZoo(Zoo decoratedZoo) {
        super(decoratedZoo);
    }
    @Override
    public void makeArchitecture() {
        zoo.makeArchitecture();
        makeWaterPool(zoo);
    }

    private void makeWaterPool(Zoo zoo) {
        System.err.println("make a water pool!");
    }
}
