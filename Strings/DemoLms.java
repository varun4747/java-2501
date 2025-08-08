 package Strings;

import java.util.Scanner;

// public class DemoLms {
//     public static void main(String[] args) {
//         int i = 10;
//         String s = "Hello";

//         // Demo d1 = "Java"; # Other classes Error, only 
//         // for strings it is supported

//         DemoLms d1 = new DemoLms();
//         System.out.println(d1); // Object Address

//         String s1 = new String();
//         System.out.println(s1); // empty string

//         String ss1 ="hello";
//         String ss2 ="hello";

//         // == earlier with operators, compare values
//         // == now with strings, compare memory address

//         System.out.println(ss1 == ss2);

//         System.out.println(System.identityHashCode(ss1));
//         System.out.println(System.identityHashCode(ss2));

//         // new keyword -> every time new object is created
//         String ss3 = new String("hello");
//         String ss4 = new String("hello");

//         System.out.println(System.identityHashCode(ss3));
//         System.out.println(System.identityHashCode(ss4));

//         // to compare the content / values
//         System.out.println(ss1.equals(ss2));
//         System.out.println(ss1.equals(ss3));

//         // Note 
//         // == compare strings for memory address
//         // == do equality checks(compare value) with primitives 
//         // equals() do equality checks(compare value) with strings

//         // // substring
//         String sss1 = "hello java";
//         System.out.println(sss1.substring(2));
//         System.out.println(sss1.substring(2,6));
        

//     }
// }

public class DemoLms {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

         String s3 = new String("hello");
         System.out.println(s3);
         System.out.println(s1==s3);
         System.out.println(s1.equals(s3));

        System.out.println("enter your username: ");
        String userName=sc.next();
        if(userName.length()<6){
            System.out.println("Atleast 6 charcters are required!");
        }else{
            System.out.println("Enter the Password: ");
        }

        System.out.println("Enter your Mail: ");
         String mail=sc.next();
         System.out.println("original mail: "+mail);
         System.out.println("Lower case mail: "+(mail.toLowerCase()));
         System.out.println("Upper case mail: "+(mail.toUpperCase()));
         System.out.println("Trimmed mail: "+(mail.trim()));
         System.err.println("contains: "+(mail.contains("@")));

         
}
}
