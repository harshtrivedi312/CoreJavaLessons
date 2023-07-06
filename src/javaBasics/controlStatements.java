package javaBasics;

public class controlStatements {
    public static void main(String[] args) {



        // if statement

        //1. simple if statement
        //2. if else statement
        //3. nested if else
        //4. if else if statements

        //1. simple if statement

//        if(condition){
//            statement 1; executes when condition is true
//        }


        int a = 10;
        int b = 20;

        if (a + b > 20){
            System.out.println("a+b is grater then 20");
        }
// if else statement

        if (a+b < 50){
            System.out.println("a+b is less then 20");
        }else {
            System.out.println("a+b is grater then 20");
        }

        //if- else if - else

        if (a+b == 50){
            System.out.println("a+b is equal to 50");
        } else if (a+b >10) {
            System.out.println("a+b is greater then 10");
        }else {
            System.out.println("a+b is nither equal to 50 nor less then 10");
        }

        //nested if else

        String city = "California";

        if (city.endsWith("USA")){
            if (city.contains("virginia")){
                System.out.println("you live in virginia USA");
            } else if (city.contains("colorado")) {
                System.out.println("you live in colorado USA");
            }else {
                System.out.println(city.split(",")[0]);
            }
        }else{
            System.out.println("you are form Space Alien");
        }


        //The parameter weekday is true if it is a weekday,
        // and the parameter vacation is true if we are on vacation.
        // We sleep in if it is not a weekday, or we're on vacation.
        // Return true if we sleep in.

        // ! means not in java
        // || this is or operator in java

        sleepIn(true,false);
        System.out.println(nhundred(95));
        sStatement();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
if (!weekday || vacation){
    System.out.println("true");
    return true;
}else {
    System.out.println("flase");
    return false;
}



    }
    //Given an int n, return true if it is within 10 of 100 or 200.
//90-110
//190-210
// || or operator
// && operator
    public static boolean nhundred (int n){
       if((n <= 90 || n >= 110) && (n <= 190 || n >= 210)){
           return false;
       }else {
           return true;
       }
    }
//Given 2 int values, return whichever value is nearest
// to the value 10,
// or return 0 in the event of a tie.

    // int a = 8 int b = 13 --> 8;

    public static int to10(int a , int b){
        int diffA = (a-10);
        int diffB = (b-10);

        if (diffA < diffB){
            System.out.println(a);
            return a;
        } else if (diffB < diffA) {
            System.out.println(b);
            return b;
        }else {
            System.out.println(0);
            return 0;
        }
    }

    // Return true if the given non-negative number is a
    // multiple of 3 or a multiple of 5.
    // Use the % "mod" operator

    public static boolean mod35(int x){
        if (x%3==0 || x%5==0){
            System.out.println(true);
            return true;
        }else {
            return false;
        }
    }

    //Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

    public static boolean make10(int q , int w){
        if(q == 10 || w ==10 || q+w==10){
            System.out.println("true");
            return true;
        }else {
            System.out.println(false);
            return false;
        }

    }

// java Switch case statements..

    // A switch statement is a control statement in programming that allows you to execute
    // diff blocks of code based on the value of a variable or an expression
    // it provides a consise way to handle multiple cases without using multiple
    // if-else statements.
    // Switch is provided with an expression
    // that can be a constant or literal expression that can be evaluated.
    //The value of the expression is matched with each test case till a match is found.

    // example of school grades



    public static void sStatement(){
int day = 6;
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("UnKnown Day");
        }
    }



}
