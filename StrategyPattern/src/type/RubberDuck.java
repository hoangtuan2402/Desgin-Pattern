package type;

import base.Duck;
import behavior.FlyBehavior;
import behavior.QuackBehavior;
import behavior.implement.FlyNoWay;
import behavior.implement.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
