import java.util.Scanner;

public class M2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char str = 0;
        int count;
        int c = sc.nextInt();
        int L,R,S;
        for (int i = 1;i<=n;i++){
            count=0;
            L = sc.nextInt();
            R = sc.nextInt();
            S = sc.nextInt();
            if (L>=60&&R>=60&&S>=60)
                str='P';
            else{
                if (L>60) count++;
                if (R>60) count++;
                if (S>60) count++;
                if (count==1){
                if (L+R+S>=220)
                    str='P';
                else
                    str='F';
                }
                else if (count==2){
                if (Math.max(L,Math.max(R,S))>=80)
                    str='M';
                else
                    str='F';
                }
                System.out.println(str);
            }
        }
    }
}
