import java.util.Scanner;

public class NameWelcome {
    public static void main(String[] args) {
        testmain3(args);
    }

   public static void testmain3(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str0 = scnr.next();
        String str1 = scnr.next();
        String str11 = scnr.next();
        String tmpStr = scnr.nextLine();
        String str2 = scnr.nextLine();
        String str3 = scnr.nextLine();
         System.out.println( "str0:" + str0);
         System.out.println( "str1:" + str1);
         System.out.println( "str11:" + str11);
         System.out.println( "tmpStr:" + tmpStr);
         System.out.println( "str2:" + str2);
          System.out.println( "str3:" + str3);
       System.out.println();
   }
   
   public static void testmain2(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str0 = scnr.next();
        String str1 = scnr.next();
        String tmpStr = scnr.nextLine();
        String str2 = scnr.nextLine();
        String str3 = scnr.nextLine();
         System.out.println( "str0:" + str0);
         System.out.println( "str1:" + str1);
         System.out.println( "tmpStr:" + tmpStr);
         System.out.println( "str2:" + str2);
          System.out.println( "str3:" + str3);
       System.out.println();
   }

    public static void testmain(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter first name: ");
        firstName = scnr.nextLine(); // Gets entire line up to ENTER

        System.out.println("Enter last name: ");
        lastName = scnr.nextLine(); // Gets entire line up to ENTER

        System.out.println();
        System.out.println("Welcome " + firstName + " " + lastName + "!");
        System.out.println("May I call you " + firstName + "?");

    }

}