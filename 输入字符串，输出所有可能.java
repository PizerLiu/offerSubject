
import java.util.Scanner;

public class class3 {

    public static void permutation(char[] s,int from,int to) {
        if(to <= 1)
            return;
        if(from == to) {
            System.out.println(s);
        } else {
            for(int i=from; i<=to; i++) {
                swap(s,i,from); //交换前缀，使其产生下一个前缀
                permutation(s, from+1, to);
                swap(s,from,i); //将前缀换回，继续做上一个前缀的排列
            }
        }
    }

    public static void swap(char[] s,int i,int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.next();
        char[] inChar = inStr.toCharArray();
        permutation(inChar, 0, inChar.length-1);
    }
}
