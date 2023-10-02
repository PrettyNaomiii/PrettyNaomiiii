/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author ragam
 */
public class DuckSimulator {
    
    public static void main(String() args){
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("pilih tipe duck:");
            System.out.println("1. MallardDuck");
            System.out.println("2. RubberDuck");
            System.out.println("3. DecoyDuck");
            System.out.println("4. ModelDuck");
            System.out.println("0. keluar");
            int pilih = scanner.nextInt();
            
            if (pilih == 0){
                System.out.println("keluar dari program!!");
            }
            Duck duck = null;
            
            switch (pilih){
                case 1:
                   duck = new MallardDuck();
                    break;
                case 2:
                   duck = new RubberDuck();
                   break;
                case 3:
                   duck = new DecoyDuck();
                   break;
                case 4:
                   duck = new ModelDuck();
                   break;
                
                default:
                    System.out.println("pilih yang anda masukan tidak ada");
            }
            
            if (duck!= null){
                System.out.println("memilih: " +duck.getclass().getsimplename());
                duck.performQuack();
                duck.performFly();
            }
        }  while (true); 
       
    }
}
