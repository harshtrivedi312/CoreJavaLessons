package regex;

import java.util.Arrays;
import java.util.regex.*;


public class Regex {

    //Java regex.Regex
    //regular expression

 // the java regex or regular expression is an API to define a pattern for
   // searching or manipulation of String.

    //JAVA.UTIL.regex package from JAVA

    //MatchResult interface
    //Matcher class
    //Pattern class
    //patternSyntaxException Class

    public static void main(String[] args) {
        //1st way
//        Pattern p = Pattern.compile("..s"); //represents single character
//        Matcher m =  p.matcher("mas");
//        boolean b = m.matches();

        //second way
    //    boolean b2= Pattern.compile(".s").matcher("as").matches();

        //third Way
     //   boolean b3 = Pattern.matches(".s","as");

      //  System.out.println(b+" "+b2+" "+b3);

     //example--String str = "hallos"; // check if it ends with 's';

      //  boolean b4 = Pattern.matches(".....s","hallos");

        // Matching URL
//
//        String regex = "^https?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?$";
//        String url = "https://www.google.com";
//        boolean isMatch  = url.matches(regex);
//        System.out.println(isMatch);


        //extracting numbers
//        String sregex= "\\d+";
//        String text = "I have 10 apples anf 5 mangoes.";
//
//        Pattern pp = Pattern.compile(sregex);
//        Matcher mm = pp.matcher(text);
//        while(mm.find()){
//            System.out.println(mm.group());
//        }

        //Validate email address

        String rx ="^[a-zA-Z0-9._%+-]+@[A-Za-z]+\\.com$";
        String mail = "htri@gmail.com";
        boolean isValid = mail.matches(rx);
        System.out.println(isValid);


        //Splitting string after each ,
//
//            String rxx = "\\s* , \\s*";
//            String txt = "abc , def , hij , klm , mno";
//            String[] letters = txt.split(rxx);
//            System.out.println(Arrays.toString(letters));
//
//        String reg = "\\bcat\\b";
//        String tet = "I have a cat named Kitty. My cat is cute.";
//        String replacement = "dog";
//        String modifiedText = tet.replaceAll(reg, replacement);
//        System.out.println(modifiedText);




    }

}
