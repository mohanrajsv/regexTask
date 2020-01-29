package com.company;
import  java.io.*;
import java.util.StringTokenizer;

public class StringOp {
    static String data;
    int id;
    String clg;

    //constructor
    StringOp(int id, String clg){
        this.id=id;
        this.clg=clg;
    }

    //overriding the toString() method
    public String toString(){
        return "id : " +id+ " and college : "+ clg;
    }

    public static void main(String[] args) {
        String name = "Mohanraj";
        //length
        System.out.println("------length----");
        System.out.println("length : "+name.length());


        //compareTo
        System.out.println("------compareTo----");
        String s1="HEllo";
        String s2="hello";
        String s3="hello";
        String s4="flag";
        System.out.println(s1.compareToIgnoreCase(s2)); // 0 because both are equal

        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"

        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        //concat
        System.out.println("------concat----");
        String con="hello";
        con=con.concat("how are you");
        System.out.println(con);

        //isEmpty
        System.out.println("------isEmpty----");
        String e=" ";
        String e2="hello";
        System.out.println(e.isEmpty());

        //trim
        System.out.println("--------trim----");
        String trim1="  hello   ";
        System.out.println(s1.trim()); // with trim()

        //change case
        System.out.println("UPPER CASE : "+ name.toUpperCase());
        System.out.println("LOWER CASE "+ name.toLowerCase());

        //valueOf
        System.out.println("---------valueOf-------");
        int age = 20;
        String ag = String.valueOf(age);
        System.out.println("AGE :"+ag);

        //replace
        System.out.println("------------replace--------");
        String rep="1Hey, welcome to 9Adventnet0 and ZOHO";
        String replaceString=rep.replace("[0-9]","ZOHO");
        System.out.println(replaceString);

        //contains
        System.out.println("-----------------contains------------");
        String greet=" hello how are you doing";
        System.out.println(greet.contains("how are you"));
        System.out.println(greet.contains("hello"));
        System.out.println(greet.contains("fine"));

        //equals
        System.out.println("-------------equals-------------");
        String
                name1 = "Mohanraj",
                name2 = "mohanraj";
        System.out.println(name1.equals(name2));

        System.out.println("-------------equalsIgnoreCase-------------");
        System.out.println(name1.equalsIgnoreCase(name2));

        ///toCharArray
        System.out.println("-----toCharArray-----");
        char[] ch=rep.toCharArray();
        for(int i=0;i<ch.length;i++)
            System.out.print(ch[i]);
        System.out.println();

        //getBytes
        System.out.println("----getBytes------------");
        String by="ABC";
        byte[] b=by.getBytes();
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);

        //charAt()
        System.out.println("------------------charAt--------------");
        System.out.println(name.charAt(2));

        //substring
        System.out.println("--------------------substring-------------");
        System.out.println(name.substring(3));

        //String tokenizer
        System.out.println("--------------StringTokenizer--------------");
        StringTokenizer stk = new StringTokenizer(greet);
        while(stk.hasMoreTokens())
            System.out.println(stk.nextToken());

        //toString
        StringOp e1 = new StringOp(01,"SRIT");
        System.out.println("----toString-------");
        System.out.println(e1);

    }
}

