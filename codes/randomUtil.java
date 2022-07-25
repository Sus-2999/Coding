import java.util.Random;

public class randomUtil {
    public static void main(String[] args){
        Random generate = new Random();

        //generates random integer in the interval [0, upper limit)
        System.out.printf("A random integer between 0 and 100 = %d\n\n", generate.nextInt(100));
        
        //generates random integer in the interval [lower limit, upper limit)
        System.out.printf("A random integer between 25 and 250 = %d\n\n", generate.nextInt(25, 250));
        
        int B = generate.nextInt();
        long C = generate.nextLong();
        float D = generate.nextFloat(); //Similar to java.lang.Math.random();
        double E = generate.nextDouble(); //Same as java.lang.Math.random();
        System.out.println("Randomly generated integer = "+B);
        System.out.println("Randomly generated long = "+C);
        System.out.println("Randomly generated floating value = "+D);
        System.out.println("Randomly generated double value = "+E);
        System.out.println("Randomly generated boolean value = "+generate.nextBoolean());
        System.out.println("Randomly generated exponential value = "+generate.nextExponential());
        
        byte[] byteArray = new byte[10];
        generate.nextBytes(byteArray); //takes a byte array as its parameter to store random byte values
        System.out.printf("\nArray containing 10 random bytes is as follows:\n");
        System.out.print("[");
        for(byte i=0; i<byteArray.length; i++){
            System.out.print(" "+byteArray[i]);
        }
        System.out.println(" ]");
    }    
}