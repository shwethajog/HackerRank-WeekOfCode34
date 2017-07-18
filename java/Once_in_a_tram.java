import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankSolution1 {

    static String onceInATram(int x) {
        boolean flag=false;
        while(!flag){
            int sum1=0; int sum2=0;
            int num=x+1;
            sum1=sum1+(num%10);
            num=num/10;
            sum1=sum1+(num%10);
            num=num/10;
            sum1=sum1+(num%10);
            num=num/10;
            sum2=sum2+(num%10);
            num=num/10;
            sum2=sum2+(num%10);
            num=num/10;
            sum2=sum2+(num%10);
            num=num/10;
            if(sum1==sum2){
                flag=true;
            }else x=x+1;
        }return Integer.toString(x+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
