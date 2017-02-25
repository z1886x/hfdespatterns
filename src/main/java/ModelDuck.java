import test.hassan.impl.FlyNoWay;
import test.hassan.impl.Quack;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("Im a model duck");

    }
}
