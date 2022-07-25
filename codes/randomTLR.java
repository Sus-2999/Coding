import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class randomTLR {
    static Random generate = new Random();

    public static void main(String args[]) {

        //Same as java.util.Random.generate.nextDouble(lower bound, upper bound)
        System.out.println("Randomly generated double value between 20 and 100 = "+ThreadLocalRandom.current().nextDouble(20.0, 100.0));
        //All the methods of java.util.Random class are present in the ThreadLocalRandom class of java.util.concurrent package
        genRndm(20);
        genRndm(20, 10, 30);        
    }

    static void genRndm(int n) {
        System.out.println("Random "+n+" integers are as follows:");
        generate.ints(n).forEach(System.out::println);
    }

    static void genRndm(int n, int l, int u) {
        System.out.println("Random "+n+" integers between "+l+" and "+u+" are as follows:");
        generate.ints(n, l, u).forEach(System.out::println);
    }
}