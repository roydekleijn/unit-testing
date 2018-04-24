package coffee.machine;

import coffee.container.IContainer;
import coffee.container.NotEnoughException;
import coffee.domain.Portion;

public interface ICoffeeMachine {

    public boolean makeCoffee(Portion portion) throws NotEnoughException;
    public IContainer getCoffeeContainer();
    public IContainer getWaterContainer();

}