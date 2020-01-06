import java.util.Scanner;

public class M2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++)
                System.out.print("　");
            for (int t=1;t<=2*i-1;t++)
                System.out.println('*');
            System.out.println();
        }
    }
}
