//import java.util.Scanner;

public class MoneyConverter {
   public static void main(String[] args) {
      //Scanner scnr = new Scanner(System.in);
      int totalPennies = 154;
      //int numDimes;
      //int numNickels;
      //int numPennies;

     // totalPennies = scnr.nextInt();

      int numDimes = totalPennies/10;
       
       totalPennies = totalPennies % 10;
       int numNickels = (totalPennies / 5);
       int numPennies = totalPennies % 5;

      numNickels = numDimes % 5;
      numPennies = totalPennies % 1;

      System.out.println("Dimes: " + numDimes);
      System.out.println("Nickels: " + numNickels);
      System.out.println("Pennies: " + numPennies);
      System.out.println("Pennies: " + totalPennies);
   }
}
