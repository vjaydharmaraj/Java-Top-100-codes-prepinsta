import java.util.Scanner;

public class sumgivenrange {
    public static void main(String[] args) {
        System.out.println("Enter num 1 : ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        System.out.println("Enter num 2 : ");
        int n2 = sc.nextInt();

        int sum = 0;

        for(int i = n1;i<=n2;i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}
