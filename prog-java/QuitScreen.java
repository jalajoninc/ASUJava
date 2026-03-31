import java.util.Scanner;


public class QuitScreen {
   public static void main(String[] args) {
      //test(args);
         loop1(args);
   }


      public static void loop1(String[] args) {

         for ( int i = 0; i > -4; --i ){
            System.out.printf("jwb %d", i );
         }

         for ( int i = 0; i > -4; i-- ){
            System.out.printf("jwb %d", i );
         }

         for ( int i = 0; i < 4; i++ ){
            System.out.printf("jwb %d", i );
         }


      }

      public static void test2(String[] args) {
         Scanner scnr = new Scanner(System.in);
         int numInput;
         int finalVal;

         finalVal = 0;
         numInput = scnr.nextInt();

         while (numInput > -7){

            if (numInput%4 != 0) {
               finalVal = numInput + finalVal;
               System.out.println("jwb 1Final value is " + finalVal);
            } else {
               finalVal = finalVal - numInput;
               System.out.println("jwb 2Final value is " + finalVal);
            }
            numInput = scnr.nextInt(); 
         }
         System.out.println("Final value is " + finalVal);
      }

      public static void test(String[] args) {
         int numInput;
         int finalVal;
         int[] myinput = {32, 75, 200, 43, 81, 0, 120, -7};
         int i = 0;
         finalVal = 0;

         while ( true ) {
            numInput =  myinput[i];
            System.out.println("jwb Input is " + myinput[i]);

            if (numInput%4 != 0) {
               finalVal = numInput + finalVal;
               System.out.println("jwb 1Final value is " + finalVal);
            } else {
               finalVal = finalVal - numInput;
               System.out.println("jwb 2Final value is " + finalVal);
            }
            i++;
         }   
      
       }
}