public class MeterToFeet {
    public static void main(String[] args) {
       System.out.println("Hello, world john! xxx");
      meterToFeetFunc( 55.55 );
   }

static int meterToFeetFunc(double meters){

    //double meters = 10.25;
    int feet;
    double inches;

    double totalFeet = meters * 3.28084;
    feet = (int) totalFeet;
    inches = (totalFeet - feet);
    inches = inches * 12;

    System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"",meters, feet, inches );
    System.out.println();

    inches = Math.floor(inches * 100.0) / 100.0;
    System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"",meters, feet, inches  );
    System.out.println();

    return 1;
    }

}