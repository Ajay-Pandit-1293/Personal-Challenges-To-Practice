package Challenges;

import java.util.ArrayList;
import java.util.Scanner;

// this is not fully solved yet , it has some big bugs so i'll solve it later


// TO check the duplicates without the looops in an array , not even internally or in prebuilt functions;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int i =0;
        int[] arr = new int[n];
//   Note: THis is the loop to input the array not for checking the dooooooplicatesssssss , remember it dude;
        while (i < n) {
            System.out.print("Enter the "+(i+1)+"th element to the array : ");
            arr[i] = sc.nextInt();
            i++;
        }
        ArrayList<Integer> arrr = new ArrayList<>();
        int j =0;
        dooooooooooplicateFunctionnnnnnnn(arrr,arr,j);
        System.out.println("THe Duplicates is : "+ arrr);

    }
    public static void  dooooooooooplicateFunctionnnnnnnn(ArrayList<Integer> arrr,int[] arr ,int j){
        if (j==arr.length-1){
            return;
        }
        if(arr[j]==arr[j+1]) System.out.println("THis is the duplicate : "+arr[j]);
        dooooooooooplicateFunctionnnnnnnn(arrr,arr,j+1);


    }
}
