public class Converter {
  public static void main(String[] args) {

     double meters = 0.00;
     int feet;
     double inches;
  


     System.out.println ("Enter distance in Meters : ");
     meters = scnr.nextDouble ();
   double totalFeet = meters *3.28;
   feet = (int) totalFeet;
   inches = (totalFeet - feet) * 12;



     System.out.printf("%.2f meters in Feet and Inches is : %d' %.2f\"",meters, feet, inches);

    
  
    
  }
}