package javaBasics;

class inClass {
     public static void main(String[] args) {

         // i want to count from 1- 10

         for (int i = 1; i <= 10; i++ ){
             System.out.print(i);
         }


         // print even numbers 1-10
         for(int i = 0; i<=10; i++){
             if(i%2 == 0){
                 System.out.print(i);
             }else {
                 System.out.print(" ");
             }
         }

         // print odd numbers 1-10
         for(int i = 0; i<=10; i++){
             if(i%2 == 0){
                 System.out.print(" ");
             }else {
                 System.out.print(i);
             }
         }
         //sum for 1-100
          int sum = 0;
         for ( int i= 1; i <= 100; i++){
             sum += i;
         }
         System.out.println(sum);


         // give me a multiplication table for 5

         int number = 5;

         for(int i = 1; i<=10;i++){
             System.out.println(number + "x" + i + "=" +(number*i));
         }

     }

     //java control flow statements
     // Decision making Statements
     //// if else statements
     //// switch statements

     //loop ststements
     // do while
     // while
     // for loop
     // for each loop

     ///Jump statements
     /// break statements
     /// continue statement















}
