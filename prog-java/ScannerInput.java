import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        test2(args);
   }

   public static void test2(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str0 = scnr.next();
        String tmpStr = scnr.nextLine();

        System.out.println( "str0:" + str0);
        System.out.println( "tmpStr:" + tmpStr);
        System.out.println();
   }
  public static void test1(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str0 = scnr.next();
        String str1 = scnr.next();
        System.out.println( "str0:" + str0);
        System.out.println( "str1:" + str1);
        System.out.println();
   }


   


}