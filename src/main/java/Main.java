import test.hassan.impl.FlyRocketPowered;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public class Main {

    public static void main(String [] args){

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }

}
