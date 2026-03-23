

public class MyString {
    public static void main(String[] args) {

        sortIt();
   }

public static void sortIt() {
    int one = 7;
    int two = 5;
    int three = 2;

    if ( one > two ) {
      int tmp  = one;
      one = two;
      two = tmp;
    } 
 
    if ( two > three ) {
      int tmp  = two;
      two = three;
      three = tmp;
    } 

    if ( one > two ) {
      int tmp  = one;
      one = two;
      two = tmp;
    } 


    System.out.printf( "%c %d %x", 'a', (int) 'a', (int) 'a' );
    System.out.printf( "%c %d", 'a', (int) 'a' );

}


public static void test2() {
    String s1 = "j1";    
    Character c1 = s1.charAt(0);
    Character c2 = s1.charAt(1);

    if (Character.isDigit(c1)) {
      System.out.println(c1 + " is a digit.");
    } else {
      System.out.println(c1 + " is NOT a digit."); // This will run
    }

    if (Character.isDigit(c2)) {
      System.out.println(c2 + " is a digit.");
    } else {
      System.out.println(c2 + " is NOT a digit."); // This will run
    }
}

public static void test3() {
   String s1 = "j1";
    
    Character c1 = s1.charAt(0);
    Character c2 = s1.charAt(1);

    if ( Character.isDigit('2') == true ){
      System.out.println( c1 + " true 55" );
    }
}


}