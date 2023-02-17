package type;

import base.Duck;
import behavior.implement.FlyWithWings;
import behavior.implement.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super( new FlyWithWings(), new Quack());
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

