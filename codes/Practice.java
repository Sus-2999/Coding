import java.util.Scanner;
import java.util.ArrayList;

public class Practice {
    static void findScore(int n, int k, String[] s){
        ArrayList<Integer> score = new ArrayList<Integer>();
        for(int i=0; i<n; ++i){
            Integer total = 0;
            for(int j=1; j<=k; ++j){
                String temp = new String(s[i].substring(0, j));
                for(int t=0; t<n; ++t){
                    if(temp.equals(s[t].substring(0, j)))
                        total += Integer.valueOf(1);
                }
            }
            score.add(total);
        }
        for(int i=0; i<n; ++i){
            System.out.println(score.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for(int i=0; i<n; ++i){
            s[i] = sc.nextLine();
        }
        sc.close();
        findScore(n,k,s);
    }
}