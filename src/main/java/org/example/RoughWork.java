package org.example;

public class RoughWork {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int count =0;

        for (int i= 0;i<arr.length;i++){

            if(count==3){
                System.out.println();
                count=0;
            }
            count++;
            if(i==7-1){
                System.out.print("    🐭    ");
            }else {
                System.out.print("    O    ");
            }
        }
    }
}
