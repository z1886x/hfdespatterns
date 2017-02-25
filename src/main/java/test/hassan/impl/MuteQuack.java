package test.hassan.impl;

import test.hassan.behaviour.QuackBehaviour;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
