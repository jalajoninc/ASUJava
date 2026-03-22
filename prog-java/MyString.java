

public class MyString {
    public static void main(String[] args) {
 
        // String s1 = "j1";
        // Character c1 = s1.charAt(0);
        // Character c2 = s1.charAt(1);

        // if (( c2 > '0' ) && ( c2 < '9' ) ){
        //     System.out.println( "true 26" );
        // }
        test2();
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