import java.util.Scanner;
import java.util.Random;

public class generateString {
    static String set = "A0b!C2d@E3f#G4h$I5jK6l7M&n8O-p_Q?r9StUvWxYzaBcDeFgHiJkLmNoPqRsTuVwXyZ";
    static int size = set.length();
    static char[] SET = set.toCharArray();
    
    static void rndm(int len) {
        Random generate = new Random();
        System.out.print("Randomly generated string = ");
        for(byte i=0; i<len; i++) {
            System.out.print(SET[generate.nextInt(size)]);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int lenGTH;

        while(true) {
            System.out.printf("Enter the length of string you want to generate (min. 8 and max. 15): ");
            lenGTH = scan.nextInt();
            if(lenGTH<8 || lenGTH>15)
            System.out.printf("Specified length out of bounds\n\n");
            else {
                scan.close();
                break;
            }
        }
        rndm(lenGTH);
    }
}