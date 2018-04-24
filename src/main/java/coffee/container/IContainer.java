package coffee.container;

import coffee.domain.Portion;

public interface IContainer {

    public boolean getPortion(Portion portion) throws NotEnoughException;
    public int getCurrentVolume();
    public int getTotalVolume();
    public void refillContainer();

}