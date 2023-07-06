package IOinJAVA;

import java.io.*;

public class IoJava {
    //reading a file in java

    public static void main(String[] args) {
        //A stream is a sequence of bytes that is read and/or written to,
        // while a buffer is a sequence of bytes that is stored.



       // writeFile();
       // readFile();
        StandardInput();
    }

    public static void readFile(){
        File file = new File("/users/harsh/Desktop/myfile1.txt");
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void writeFile(){
        File file = new File("/users/harsh/Desktop/myfile1.txt");

        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
        {
            bufferedWriter.write("Hello I wrote this file from Java");
            bufferedWriter.newLine();
            bufferedWriter.write("This is how we write files from java for report");
            System.out.println("File writing complete");

        }catch (IOException e){
           e.printStackTrace();
        }
    }

    public static void StandardInput(){
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))){

            System.out.println("Enter your name: ");
            String name = bufferedReader.readLine();
            System.out.println("Hello "+name+"!");

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
