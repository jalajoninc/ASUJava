import java.util.Scanner;

public class CountCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char userIn;
		int sum;

		sum = 0;
		userIn = scnr.next().charAt(0);

      while (userIn != 'q') {
          userIn = scnr.next().charAt(0);
          sum = sum+1;  
      }

   	System.out.println(sum);
	}
}