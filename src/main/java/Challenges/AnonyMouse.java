package Challenges;

import java.util.Random;
import java.util.Scanner;

public class AnonyMouse {
    public static void main(String [] args){
        Random random = new Random();
        int[] arr = new int[9];
        int count =0;
        int end = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To The Mouse Hunt Game YOHOHOHOHOHOHO !!!");
        System.out.println("__________________________________________________");
        while (end<10){

            System.out.println("\nTo Hunt the mouse just write the number on which location you think mouse is !!!\n" +
                    "(in 1,2,3,4  respectively the real mouse is hidden you have to gu6ess correctly\n " +
                    "To exit type anything greater than 10");

            int randdom = random.nextInt(9)+1;
            int c=0;
            for(int i = 1;i<10;i++){
                if(count==3){
                    System.out.println();
                    count=0;
                }
                count++;
                System.out.print("    🐭    ");
            }
            System.out.println("\n__________________________________________________________");
            int in = sc.nextInt();
            if (in>9){
                end=in;
                System.out.println("MotherFucker, You Exited The Game Successfully !!!");
                break;
            }
            if (in == randdom){
                System.out.println("Congratulations !!! You Killed The mouse. ");
                for (int i= 0;i<arr.length;i++){

                    if(count==3){
                        System.out.println();
                        count=0;
                    }
                    count++;
                    if(i==randdom-1){
                        System.out.print("    💀    ");
                    }else {
                        System.out.print("    O    ");
                    }
                }
                end =11;
                break;


            }else {
                System.out.println("Oops You missed it !! Try again !\n This was the mouse's location.");
                for (int i = 0; i < arr.length; i++) {

                    if (count == 3) {
                        System.out.println();
                        count = 0;
                    }
                    count++;
                    if (i == randdom - 1) {
                        System.out.print("    🐭    ");
                    } else {
                        System.out.print("    O    ");
                    }
                }
            }
        }
    }
}
