package javaBasics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

 A a = new A();
 a.isPresent("do");
 a.isThere();
    }


    public class Long{
        private String number;

        public String getNumber(){
            return this.number;
        }
        public void setNumber(String number){
            this.number = number;
        }
    }

    //public access modifier
    public class Starbucks{
        public int salary;

        public int getSalary(){
            return this.salary;
        }

        public int setSalary(){
            this.salary = salary;
            return salary;
        }
    }
    //Protected Access Modifier

   public static class A{
      void isPresent(String a){
           System.out.println("world" +" " + a);
       }
        void isThere(){
            isPresent("hello");
        }

    }

    }





