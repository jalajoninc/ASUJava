
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world john! xxx");
        int numPizza = 2;
       int numSlicesPerPizza= 8;
      
       int totalSlices = (numPizza * numSlicesPerPizza);

 //     System.out.println("Dimes: " + numPizza);
 //     System.out.println("Nickels: " + numSlicesPerPizza);
 //     System.out.println("Pennies: " + totalSlices);

      sum( 55.55 );

   }

static int sum(double meters){

    //double meters = 10.25;
    int feet;
    double inches;

    double totalFeet = meters * 3.28084;
    feet = (int) totalFeet;
    inches = (totalFeet - feet);
    inches = inches * 12;

        System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"",meters, feet, inches );

    double inz = Math.floor(inches * 100.0) / 100.0;

 //   inches = totalFeet * 12.0;

    System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"",meters, feet, inches );
    System.out.println();
    System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"",meters, feet, inz );
    System.out.println();

    return 1;
    }

}