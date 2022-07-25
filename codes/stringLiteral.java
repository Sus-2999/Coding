public class stringLiteral {
    public static void main(String[] args) {
        String Str1 = "My bike is So Fast!!";
        String Str2 = "My Bike is so fast!!";

        System.out.printf("Str1 = %s\n", Str1);
        System.out.printf("Str2 = %s\n\n", Str2);
        System.out.printf("Length of Str1 = %d\n", Str1.length());
        System.out.printf("Character at index 6 of Str1 = %c\n", Str1.charAt(6));
        System.out.printf("Index of character 's' in Str2 = %d\n", Str2.indexOf('s'));
        System.out.printf("Index of character 's' in Str2 after index 12 = %d\n", Str2.indexOf('s', 13));
        System.out.println("Str1 is same as Str2 : "+Str1.equals(Str2));
        System.out.println("Str1 is same as Str2 (ignoring case sensitivity) : "+Str1.equalsIgnoreCase(Str2));
        System.out.printf("\nResult of lexicograhical comparision between Str1 and Str2:\n");
        if(Str1.compareTo(Str2)<0)
            System.out.println("Str1 comes before Str2 in lexicographical order");
        else
            System.out.println("Str1 comes after Str2 in lexicographical order");
        System.out.println("");
        if(Str1.compareToIgnoreCase(Str2)==0)
            System.out.printf("If we ignore case sensitivity, then Str1 and Str2 occupy the same position in a dictionary\n\n");
        System.out.println("Str1 starts with the string \"bike\" : "+Str1.startsWith("bike"));
        System.out.println("Str2 starts with the string \"Bike\" at index 3 : "+Str2.startsWith("Bike", 3));
        System.out.println("Str1 ends with the string \"fast!!\" : "+Str1.endsWith("fast!!"));
        System.out.println("Str1 ends with the string \"Fast!!\" : "+Str1.endsWith("Fast!!"));
        System.out.printf("\n");

        char[] s1 = new char[7];
        char s2[] = new char[5];

        Str1.getChars(0, 7, s1, 0);
        Str2.getChars(3, 6, s2, 2);

        System.out.print("Contents of the character array s1 = {");
        for(byte i=0; i<s1.length; i++) {
            System.out.print(" "+s1[i]);
        }
        System.out.printf(" }\n");
        System.out.print("Contents of the character array s2 = {");
        for(byte i=0; i<s2.length; i++) {
            System.out.print(" "+s2[i]);
        }
        System.out.printf(" }\n\n");

        byte array[] = new byte[Str1.length()];
        System.out.print("ASCII values of all the characters present in Str1 = [");
        array = Str1.getBytes();
        for(byte i=0; i<Str1.length(); i++) {
            System.out.print(" "+array[i]);
        }
        System.out.printf(" ]\n\n");

        System.out.println("Str1 in lowercase = "+Str1.toLowerCase());
        System.out.println("Str2 in uppercase = "+Str2.toUpperCase());

        String[] brk = Str2.split(" ");
        System.out.printf("\nStr2 splitted, at the places where there is space between characters, is as follows:\n");
        for(byte i=0; i<brk.length; i++) {
            System.out.println(brk[i]);
        }

        String Str3 = Str1.concat(" on the road");
        String Str4 = Str2.replace("Bike", "Car");
        String Str5 = "         This sentence has a lot of white space          ";
        String Str6 = Str5.trim();
        System.out.printf("\nStr3 = Str1 concatenated with the string \" on the road\" = %s\n", Str3);
        System.out.println("Str4 = Str2 after replacing \"Bike\" with \"Car\" = "+Str4);
        System.out.println("Str5 = "+Str5);
        System.out.print("Str6 = Str5 after removing the extra leading and trailing spaces = "+Str6);
        System.out.printf("\n\n");

        String Str7 = "you are not who you think you are";
        String Str8 = new String("you are not who you think you are");
        System.out.println("Str7 = "+Str7);
        System.out.printf("Str8 = %s\n\n",Str8);
        if(Str7==Str8)
            System.out.println("Str7 and Str8 contain the same references");
        else
            System.out.println("Str7 and Str8 contain different references");
        if(Str7.equals(Str8))
            System.out.printf("But, Str7 and Str8 contain the same content.\n\n");
        else
            System.out.printf("Str7 and Str8 contain different contents too.\n\n");
        System.out.println("Str7 after replacing the first \"you\" with \"I\" = "+Str7.replaceFirst("you","I"));
        System.out.printf("Str8 after replacing all \"you are\" with \"I am\" = %s\n\n",Str8.replaceAll("you are","I am"));

        String Str9 = new String(Str8.substring(16));
        String Str10 = new String(Str8.substring(16,29).concat(" love Wasabi"));
        System.out.println("Str9 = "+Str9);
        System.out.print("Str10 = "+Str10);
    }
}