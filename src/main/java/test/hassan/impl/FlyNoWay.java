package test.hassan.impl;

import test.hassan.behaviour.FlyBehaviour;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I cant fly");
    }
}
