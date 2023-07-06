package arrays;

import java.util.Arrays;

public class ArraysInJava {

    public static void main(String[] args) {

//
//        int[] numbers = new int[5]; //declaration and instantiation
//        numbers[0] = 10; //initialization
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//
//        for (int i = 0; i < numbers.length; i++) {
//           // System.out.println(numbers[i]);
//            Class<?> elementType = numbers.getClass().getComponentType();
//            System.out.println(elementType.getName());
//        }
//
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int j : arr) {
//            System.out.println(j);
//        }




//        evenArray();
//        removeDuplicates();

//        int[] a = {1,2,3,4,5};
//        min(a);
//
//
//        int arr3[] = arGet();
//        for (int i = 0; i<arr3.length;i++){
//            System.out.println(arr3[i]);
//        }
//
//        int [] b= {1, 1, 2, 3, 1};
//        System.out.println(array123(b));
//
//
//        int[] ab= {1,2,2,3,2,2,2};
//        System.out.println(noTriples(ab));
//
//        System.out.println(count9());
//
//
//        arb();
//        abb();

    //    mno();
      //  pot();

//        int[] nums1= {1,3,4,5};
//        System.out.println(unlucky1(nums1));
//
//        int[] nums2= {1,3,4};
//        System.out.println(unlucky1(nums2));
//
//        int[] nums3= {1,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(middel(nums3)));

      //  addMatrix();
       // crossMatrix();

        mulMatrix();
    }


    // print the even numbers from the array.

//    public static void evenArray(){
//        int [] arr1 ={1,2,3,4,5,6,10} ;
//        System.out.println("even numbers in given array: ");
//        for (int i =0; i < arr1.length; i++){
//            if (arr1[i] % 2 == 0){
//                System.out.println(arr1[i]);
//            }
//        }
//
//    }



    // remove repeating names from the array.

//    public static void removeDuplicates(){
//        String [] name = {"john","victor","sam","Donald","Eva","mark","john","sam"};
//
//        int length  = name.length;
//        for (int i = 0; i< length; i++){
//            for (int j = i+1; j < length; j++){
//                if(name[i].equals(name[j])){
//                    name[j] =name[length - 1];
//                    length --;
//                    j--;
//                }
//            }
//        }
//        System.out.println("names after removing duplicates");
//        for (int i= 0;i<length; i++){
//            System.out.println(name[i]);
//        }
//    }

//    static void min(int arr[]){
//        int min= arr[0];
//
//        for (int i = 1; i<arr.length; i++){
//            if (min > arr[i])
//                min=arr[i];
//            System.out.println(min);
//        }
//    }

    // write a method that returns an array int ab[] = {10,20,30,40,50,60,70,80,90}

  //  static int[] arGet(){
     //   return new int[]{10,20,30,40,50,60,70,80,90};
  //  }

    //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears
    // in the array somewhere.
    //
    //
    //array123([1, 1, 2, 3, 1]) → true
    //array123([1, 1, 2, 4, 1]) → false
    //array123([1, 1, 2, 1, 2, 3]) → true

//    public static boolean array123(int[] num){
//        for(int i = 0; i<num.length-2;i++){
//            if(num[i] == 1 && num[i+1] == 2 && num[i+2] == 3){
//                return true;
//            }
//        }
//        return false;
//    }

    //Given an array of ints, we'll say that a triple is a value appearing 3 times
    // in a row in the array. Return true if the array does not contain any triples.
    //
    //
    //noTriples([1, 1, 2, 2, 1]) → true
    //noTriples([1, 1, 2, 2, 2, 1]) → false
    //noTriples([1, 1, 1, 2, 2, 2, 1]) → false


//public static boolean noTriples(int[] nums){
//        for (int i= 0; i < nums.length-2; i++ ){
//            int first = nums[i];
//            if (nums[i+1] == first && nums[i+2] == first){
//                System.out.println("thre are triplets");
//            }
//            }
//
//    System.out.println("there are no triplets");;
//    return false;
//}
//Given an array of ints, return the number of 9's in the array.
//
//
//arrayCount9([1, 2, 9]) → 1
//arrayCount9([1, 9, 9]) → 2
//arrayCount9([1, 9, 9, 3, 9]) → 3

//public static int count9(){
//        int[] nums= {1,2,9,2,9,9,4,9};
//        int count = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] ==9){
//                count++;}
//        }
//        return count;
//}

//public static void arb(){
//    // multi dimensional Array
//
//    int [][] abc = new int[3][3]; //array with 3 rows and 3 columns
//
//    abc[0][0] =1;
//    abc[0][1] =2;
//    abc[0][2] =3;
//    abc[1][0] =4;
//    abc[1][1] =5;
//    abc[1][2] =6;
//    abc[2][0] =7;
//    abc[2][1] =8;
//    abc[2][2] =9;
//
//for (int i =0;i< abc.length;i++){
//    for (int j = 0; j< abc[i].length; j++){
//        System.out.print(abc[i][j]+ " ");
//    }
//    System.out.println();
//}
//    }
//    public static void abb(){
//        System.out.println("this is a 3x3 array");
//        int[][] arr ={{1,2,3},{2,3,4},{3,4,5}};
//
//        for (int i = 0; i<3;i++){
//            for (int j = 0; j<3;j++){
//                System.out.print(arr[i][j]+ " ") ;
//            }
//            System.out.println();
//        }
//    }

// Jagged array

//    public static void mno(){
//
//        int [][] arra = new int[3][];
//
//        arra[0] = new int[3];
//        arra[1]= new int[4];
//        arra[2] = new int[2];
//
//        //initializing a jagged array
//
//        int count = 0;
//
//        for (int i = 0; i < arra.length; i++){
//            for (int j = 0; j < arra[i].length;j++){
//                arra[i][j] = count++;
//            }
//        }
//
//        for (int i = 0; i<arra.length;i++){
//            for (int j = 0;j<arra[i].length;j++){
//                System.out.print(arra[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pot(){
//        int [][] jaga = new int[3][];
//
//        jaga[0] = new int[] {1,2,3};
//        jaga[1]= new int[]{4,6,7,8};
//        jaga[2]= new int[] {1,2,3,4,5,6};
//
//        //printing the elements of the array in the simplest way..
//
//        System.out.println(jaga[0][1]);
//        System.out.println(jaga[1][0]);
//        System.out.println(jaga[2][3]);
//
//        for (int i = 0;i< jaga.length;i++){
//            for (int j = 0; j < jaga[i].length; j++){
//                    System.out.print(jaga[i][j] + " "); // print the array
//            }
//            System.out.println(); // printing in new line
//        }
//
//    }

//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
// Return true if the given array contains an unlucky 1 in the first 2 or last 2
// positions in the array.
//
//
//unlucky1([1, 3, 4, 5]) → true
//unlucky1([2, 1, 3, 4, 5]) → true
//unlucky1([1, 1, 1]) → false

//    public static boolean unlucky1(int[] nums) {
//        if (nums.length < 2){
//            System.out.println("array is too short");
//            return false;
//}
//        for (int i = 0; i <= 1; i++){
//            if (nums[i] == 1 && nums[i+1] ==3){
//                return true;
//            }
//        }
//        int lastIndes = nums.length-1;
//        for (int i = lastIndes -1 ; i <= lastIndes; i++){
//            if (nums[i] == 1 && nums[i+1] == 3){
//                return true;
//            }
//        }
//        return false;
//    }

    //Given an array of ints of odd length, return a new array length 3 containing
    // the elements from the middle of the array. The array length will be at least 3.
    //
    //
    //midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    //midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    //midThree([1, 2, 3]) → [1, 2, 3]
//
//    public static int[] middel(int[] nums){
//        int middleIndex = nums.length/2;
//        int[] result = new int[3];
//
//        result[0] = nums[middleIndex-1];
//        result[1] = nums[middleIndex];
//        result[2] = nums[middleIndex+1];
//
//        return result;
//    }
//


    //addition of t matrix in an array.

    public static void addMatrix(){
    int [][] abc = {{1,2,3},{1,2,3}};
    int [][] def = {{1,2,3},{1,2,3}};

    // creating another matrix to store the results
    int hij[][] = new int[2][3];

    //adding and printing addition of both array

    for(int i=0; i<2;i++){
        for (int j = 0; j<3;j++){
            hij[i][j]= abc[i][j]+def[i][j];
            System.out.print(hij[i][j]+ " ");
        } System.out.println();
    }




    }

    public static void crossMatrix(){

        int [][]q = {{2,2,2},{4,4,4}};
        int [][] w = {{2,2,2},{3,3,3}};

        int [][] result = new int[q.length][q[0].length];

        for (int i = 0; i< q.length; i++){
            for(int j = 0; j < q[0].length;j++){
                result[i][j] = q[i][j] + w[q.length - i -1][j];
            }
        }
        System.out.println("Matric Cross Addition");
        for (int i = 0;i< result.length;i++){
            for (int j=0; j < result[0].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    // multiply 2 matrix

    public static void mulMatrix(){
        int[][] e = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] f = {{1,1,1},{2,2,2},{3,3,3}};

       int [][] result = multiplyMatrix(e,f);

        System.out.println("matrix multiplication");
        for (int i =0; i< result.length;i++){
            for (int j = 0; j< result[0].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
}
public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i< rows1;i++){
            for (int j = 0; j<cols2; j++){
                for (int k=0;k<cols1;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
}



    }

