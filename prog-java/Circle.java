public class Circle {
    public static void main(String[] args) {
        System.out.println( "--------Circle---------" );
        outputInFloat(10.25f);
        System.out.println( "-----------------------" );
        outputInInt(10.25f);
   }


    static void outputInFloat(float x){
        System.out.println("Radius : " + x);
        System.out.println("Diameter : " + x * 2);
        System.out.println("Circumference : " + x * 2 * 3.1415 );
        System.out.println("Area : " + (x * x) * 3.1415f );
        System.out.println("Area of Semicircle : "+ (x * x) * 3.1415 * 0.5 );
    }

    static void outputInInt(float x){
        System.out.println("Radius : " + (int) x);
        System.out.println("Diameter : " +  (int) (x * 2) );
        System.out.println("Circumference : " +  (int) (x * 2 * 3.1415) );
        System.out.println("Area : " + (int) ((x * x) * 3.1415f) );
        System.out.println("Area of Semicircle : "+ (int)((x * x) * 3.1415 * 0.5) );
    }
 }