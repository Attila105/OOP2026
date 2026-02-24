package oop.labor02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("BT1");
//        System.out.println(account1.getAccountNumber() + " " + account1.getBalance());
//        account1.deposit(1000);
//        System.out.println(account1.getAccountNumber() + " " + account1.getBalance());
        Rectangle rectang1 = new Rectangle(3, -2);
        System.out.println("Length: " + rectang1.getLength() + " Width: " + rectang1.getWidth() + " Area: " + rectang1.area() + " Perimeter: " + rectang1.perimeter());
        Rectangle[] rectangles = new Rectangle[10];
//        for(int i = 0; i < rectangles.length; i++){
//            System.out.println(rectangles[i]);
//        }
        // use a random generator
        Random rand = new Random();
//generate positive random numbers less than a bound
        double sumArea = 0;
        for(int i = 0; i < rectangles.length; i++){
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10) ;
            rectangles[ i ] = new Rectangle(length, width);
            System.out.println("Length: " + rectang1.getLength() + " Width: " + rectang1.getWidth() + " Area: " + rectang1.area() + " Perimeter: " + rectang1.perimeter());

            sumArea += rectangles[i].area();

        }
        System.out.println(sumArea);

    }
}
