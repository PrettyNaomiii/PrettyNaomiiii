/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author ragam
 */
public class RubberDuck extends Duck{
    
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        //quackbehavior = new Squeak();
        quackbehavior = () -> System.out.println("Squeak");
    }
    
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackbehavior){
        this.flyBehavior = flyBehavior;
        this.quackbehavior = quackbehavior;
    }
    
    @Override
    public void display(){
        System.out.println("I'm a rubber duckie");
    }
}
