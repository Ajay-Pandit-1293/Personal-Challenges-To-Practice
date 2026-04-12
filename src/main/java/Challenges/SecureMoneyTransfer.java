package Challenges;

import java.util.Random;
import java.util.Scanner;

// Some of the things is in Hardcoded mode , the focus is the logic only


// The Question is
//Today's Challenge (Level Easy):  Create two distict users A & B(or more as you wish) in a bank with name and balance only,
// when A wants to send money to B , Bank generates a 5 digit random number to it , So A sends that random number to B instead of direct money ,
// B inserted that number to bank and recieved the corresponding money, Rules to remember : random number must generate on the basis of the user B and amount.
//
//        For example : A wants to send 5,000 to B, he sends request to the Bank (bank ko class bana sakte ho ya method wo aapki marzi ).
//        then the bank takes the amount and name of the reciever.
//        Rules for random number:
//        1). Genrate random 5 digit number.
//        2). Add amount in it.
//        3). Multiply it by the First letter of his name (A-1,B-2,C-3....)
//4). Give this number to the B.
//        5). He then verifies the number from the bank.
//        6). if successful then credit the money.
//
//        it must map to the user B, if this number used by A or any other user it must fails,
//        don't forget the edge cases.
//
//        Hint : Create seprate class for users and Bank, save the random number then check again for the second user.
//
// 😁 Yohohohohoho


public class SecureMoneyTransfer {

    public static int key =0;
    public static void main(String[] args) {
        String user1 = "Gullu";
        String user2 = "Ajay";
        String user3 = "Pandit";
        int money1 = 15000;// mai deposite wala option baad me dalunga abbhi mujhe neend aa rahi hai
        int money2 = 15000;// mai withdraw wala option bhi baad me dalunga kyuki abhi neend aa rahi hai
        int money3 = 15000;// The truth is mai ab is code me kush bhi change nahi karunga poora bank banaunga
        int inbox1=0;
        int inbox2=0;
        int inbox3=0;
        int exit = 0;
        int back =0;
        Scanner sc = new Scanner(System.in);
        while (exit<4){
            System.out.println("For which user you want to login : ");
            System.out.println("1)."+user1+"\n2)."+user2+"\n3)."+user3+"\n4).Exit (Press anything " +
                    "greater than 3 )");
            System.out.print("Your Choice : ");
            int n = sc.nextInt();sc.nextLine();
            switch(n){
                case 1 -> {
                    System.out.println("You are now user \"Gullu\" ");
                        back=0;
                    while(back<6){
                        System.out.println("--------------------------------------------------------------------------------------------------------");
                        System.out.println("What Action do you want to perform with your account :");
                        System.out.println("1).Send Money\n2).Recieve money\n3).Check Your Inbox\n4).Check Balance \n5).Logout as Gullu" +
                                "(Press anything greater than 5 to logout)");
                        System.out.print("Your Choice : ");
                        int m = sc.nextInt();sc.nextLine();
                        switch(m)  {
                            case 1 ->{
                                System.out.println("Enter the amount : ");
                                int amount = sc.nextInt();
                                if(amount>money1){
                                    System.out.println("Mere dost tera balance kam hai paise nahi bhej sakta tu ");
                                }else {
                                System.out.println("Send Money to : 1).Ajay 2).Pandit");
                                int c = sc.nextInt();
                                if (c==1){
                                    inbox2=Bank(amount,user2);
                                    money1=money1-amount;
                                    System.out.println("Money send successfully !!! Tell the reciever to check their inbox and use the code " +
                                            "before it expires to recieve the amount ");
                                } else if (c==2) {
                                    inbox3=Bank(amount,user3);
                                    money1=money1-amount;
                                    System.out.println("Money send successfully !!! Tell the reciever to check their inbox and use the code " +
                                            "before it expires to recieve the amount ");
                                }}

                            }
                            case 2 ->{

                                System.out.println("Put the Code to recieve money(the generated random number , " +
                                        "you can it in your inbox)**if you don't have type anything to return");
                                int g = sc.nextInt();
                                char firstChar = Character.toUpperCase(user1.charAt(0));
                                int value = firstChar - 'A' + 1;
                               if (g==inbox1){
                                   g=g/value;
                                   g=g-key;
                                   money1=money1+g;
                                   inbox1=0;
                                   System.out.println("Money recieved successfully !! amount recieved : "+g+" rupees");
                               }else {
                                   System.out.println("Galat Code dala hai mere dost , dobara daal !!!");
                               }
                            }
                            case 3 -> {
                                System.out.println("Your inbox status is : "+inbox1);
                            }
                            case 4 ->{
                                System.out.println("Your current balance is : "+money1);
                            }

                            default -> back =m;
                        }
                    }
                }
                case 2 ->{
                    System.out.println("You are now user \"Ajay\" ");
                        back=0;
                    while(back<6){
                        System.out.println("--------------------------------------------------------------------------------------------------------");

                        System.out.println("What Action do you want to perform with your account :");
                        System.out.println("1).Send Money\n2).Recieve money\n3).Check Your Inbox\n4).Check Balance \n5).Logout as Gullu" +
                                "(Press anything greater than 5 to logout)");
                        System.out.print("Your Choice : ");
                        int m = sc.nextInt();sc.nextLine();
                        switch(m)  {
                            case 1 ->{
                                System.out.println("Enter the amount : ");
                                int amount = sc.nextInt();
                                if(amount>money1){
                                    System.out.println("Mere dost tera balance kam hai paise nahi bhej sakta tu ");
                                }else {
                                    System.out.println("Send Money to : 1).Gullu 2).Pandit");
                                    int c = sc.nextInt();
                                    if (c==1){
                                        inbox1=Bank(amount,user1);
                                        money2=money2-amount;
                                        System.out.println("Money send successfully !!! Tell the reciever to check their inbox and use the code " +
                                                "before it expires to recieve the amount ");
                                    } else if (c==2) {
                                        inbox3=Bank(amount,user3);
                                        money2=money2-amount;
                                        System.out.println("Money send successfully !!! Tell the reciever to check their inbox and use the code " +
                                                "before it expires to recieve the amount ");
                                    }}

                            }
                            case 2 ->{
                                System.out.println("Put the Code to recieve money(the generated random number , " +
                                        "you can it in your inbox)**if you don't have type anything to return");
                                int g = sc.nextInt();
                                char firstChar = Character.toUpperCase(user2.charAt(0));
                                int value = firstChar - 'A' + 1;
                                if (g==inbox2){
                                    g=g/value;
                                    g=g-key;
                                    money2=money2+g;
                                    inbox2=0;
                                    System.out.println("Money recieved successfully !! amount recieved : "+g+" rupees");
                                }else {
                                    System.out.println("Galat Code dala hai mere dost , dobara daal !!!");
                                }
                            }
                            case 3 -> {
                                System.out.println("Your inbox status is : "+inbox2);
                            }
                            case 4 ->{
                                System.out.println("Your current balance is : "+money2);
                            }

                            default -> back =m;
                        }
                    }
                }
                case 3 ->{
                    System.out.println("You are now user \"Pandit\" ");
                    back=0;
                    while(back<6){
                        System.out.println("--------------------------------------------------------------------------------------------------------");

                        System.out.println("What Action do you want to perform with your account :");
                        System.out.println("1).Send Money\n2).Recieve money\n3).Check Your Inbox\n4).Check Balance \n5).Logout as Gullu" +
                                "(Press anything greater than 5 to logout)");
                        System.out.print("Your Choice : ");
                        int m = sc.nextInt();sc.nextLine();
                        switch(m)  {
                            case 1 ->{
                                System.out.println("Enter the amount : ");
                                int amount = sc.nextInt();
                                if(amount>money1){
                                    System.out.println("Mere dost tera balance kam hai paise nahi bhej sakta tu ");
                                }else {
                                    System.out.println("Send Money to : 1).Gullu 2).Ajay");
                                    int c = sc.nextInt();
                                    if (c==1){
                                        inbox1=Bank(amount,user1);
                                        money3=money3-amount;
                                        System.out.println("Money send successfully !!! Tell the reciever to check their inbox and use the code " +
                                                "before it expires to recieve the amount ");
                                    } else if (c==2) {
                                        inbox2=Bank(amount,user2);
                                        money3=money3-amount;
                                        System.out.println("Money send successfully !!! Tell the reciever to check their inbox and use the code " +
                                                "before it expires to recieve the amount ");
                                    }}

                            }
                            case 2 ->{
                                System.out.println("Put the Code to recieve money(the generated random number , " +
                                        "you can it in your inbox)**if you don't have type anything to return");
                                int g = sc.nextInt();
                                char firstChar = Character.toUpperCase(user3.charAt(0));
                                int value = firstChar - 'A' + 1;
                                if (g==inbox3){
                                    g=g/value;
                                    g=g-key;
                                    money3=money3+g;
                                    inbox3=0;
                                    System.out.println("Money recieved successfully !! amount recieved : "+g+" rupees");
                                }else {
                                    System.out.println("Galat Code dala hai mere dost , dobara daal !!!");
                                }
                            }
                            case 3 -> {
                                System.out.println("Your inbox status is : "+inbox3);
                            }
                            case 4 ->{
                                System.out.println("Your current balance is : "+money3);
                            }

                            default -> back =m;
                        }
                    }
                }
                default -> exit =n;

            }
        }

    }

    public static int Bank (int amount , String user ){
        Random random = new Random();
        int num = 10000+random.nextInt(90000);
        key =num;
        char firstChar = Character.toUpperCase(user.charAt(0));
        int value = firstChar - 'A' + 1;
        int result = (num+amount)*value;
        return result;
    }


}
