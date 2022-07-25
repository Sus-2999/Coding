import java.io.*;

public class streamRead {
    public static void main(String args[]) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter Data from keyboard below");
        String data = br.readLine();
        br.close();
        System.out.printf("\nOutput is %s", data);
    }
}
