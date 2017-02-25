import test.hassan.impl.FlyNoWay;
import test.hassan.impl.FlyWithWings;
import test.hassan.impl.Quack;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Im a real mallard duck");

    }
}
