package exceptionHandeling;

public class javaexceptions {

    public static void main(String[] args) {
     ex1();
     ex2();
     ex3();
     ex4();
     ex5();
     ex6();
     ex7();
     ex8(12);
     ex9(2,10);
     ex10();
    }


    public static void ex1(){
        try {
            int[] nums = {1,2,3};
            System.out.println(nums[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your Array " + e.getMessage()) ;
        }
    }

    public static void ex2(){
        try {
               //   int result = 10/0;
                  String str = null;
                  System.out.println(str.length());

        } catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public static void ex3(){
        try{
            String str ="abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static void ex4(){
        try {
            int [] ar = new int[5];
            ar[6] = 50;
            System.out.println(ar[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void ex5(){
        try {
            int[] arr={1,2,3,4,5};
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("there is more code");
    }

    public static void ex6(){
        try {
            int[] arr = new int[5];
            arr[6] = 30/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Still more code");
        }
    }

    public static void ex7(){
        try {
            int[] arr = new int[5];
            arr[6] = 30;
            System.out.println(arr[6]);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Even more code");
        }
    }

    //throw and throws key words//

    public static void ex8(int a){
      try {
          if (a<18){
              throw new ArithmeticException("Can not drive");
          }else if (a>18){
              System.out.println("you can drive");
          }else {
              System.out.println("code continue");
          }
      }catch (Exception e){
          System.out.println(e);
      }
    }

    public static void ex9(int d, int dd) throws ArithmeticException{
        if(dd == 0){
            throw new ArithmeticException("dd is equal to 0");
        }else {
            System.out.println(d/dd);
        }
    }

    public static void ex10(){
        try {
            throw new UserDefinedException("This ia a user defined exception");
        }catch (UserDefinedException ude){
            System.out.println(ude.getMessage());
        }
    }
}
class UserDefinedException extends Exception{
    public UserDefinedException (String str){
        super(str);
    }
}

//throw is a keyword is used to throw an exception explicitly in the code,inside
//the function or the block of the code..

// throws keyword is used in the method signature to declare an exception
// might be thrown by the method while execution of the code.


