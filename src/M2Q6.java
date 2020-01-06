import java.util.Scanner;

public class M2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i=2;i<n;i++){
            if (n%i==0)
                break;
        }
        if (n==i)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
