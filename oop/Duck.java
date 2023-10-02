/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author ragam
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackbehavior;
    
    public Duck() {
    }
    
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        quackbehavior = qb;
    }
    
    abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackbehavior.quack();
    }
    
    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    Object getclass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
