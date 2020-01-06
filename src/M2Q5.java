import java.util.Scanner;

public class M2Q5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextShort();
        String str = "";
        while(n >=1){
            str = Integer.toString(n % 2) +str;
            n /=2;
        }
        System.out.printf("%08d\n",Integer.parseInt(str));
    }
}