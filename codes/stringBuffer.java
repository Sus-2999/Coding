public class stringBuffer {
    public static void main(String args[]) {
        StringBuffer Str = new StringBuffer("My name is Sushil");
        System.out.println("Buffered string Str = "+Str);
        System.out.println("Length of Str = "+Str.length());
        System.out.println("Capacity of the buffer of Str = "+Str.capacity());
        Str.reverse();
        System.out.print("Str reversed = "+Str);

        //Other methods of the StringBuffer class are same and/or similar to those of the String literal class
    }
}