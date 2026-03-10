import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CompileIt {
    public static void main(String[] args) {
        test3(args);
   }

   public static void test3(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //String str0 = scnr.next();
        String tmpStr = scnr.nextLine();

        ProcessBuilder processBuilder = new ProcessBuilder("ls", "-l", "./");

        try {
            // Start the process
            Process process = processBuilder.start();

            // Read the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if ( line.contains( tmpStr ) ){
                System.out.println(line);
                }
            }

            // Wait for the process to finish and get exit code
            int exitCode = process.waitFor();
            System.out.println("\nExited with code: " + exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


   public static void test2(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //String str0 = scnr.next();
        String tmpStr = scnr.nextLine();

        //System.out.println( "str0:" + str0);
        //System.out.println( "tmpStr:" + tmpStr);
        System.out.println();

        ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "ls -l | grep ." + tmpStr  + " > jon.txt");
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