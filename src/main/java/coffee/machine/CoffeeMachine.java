package coffee.machine;

import coffee.container.IContainer;
import coffee.container.NotEnoughException;
import coffee.domain.Portion;

public class CoffeeMachine implements ICoffeeMachine {

    private IContainer coffeeContainer;
    private IContainer waterContainer;

    public CoffeeMachine(IContainer cContainer, IContainer wContainer) {
        coffeeContainer = cContainer;
        waterContainer = wContainer;
    }

    @Override
    public boolean makeCoffee(Portion portion) throws NotEnoughException {

        boolean isEnoughCoffee = coffeeContainer.getPortion(portion);
        boolean isEnoughWater = waterContainer.getPortion(portion);

        if (isEnoughCoffee && isEnoughWater) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public IContainer getWaterContainer() {
        return waterContainer;
    }

    @Override
    public IContainer getCoffeeContainer() {
        return coffeeContainer;
    }

}