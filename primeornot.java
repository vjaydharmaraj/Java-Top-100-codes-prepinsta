import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        if(n<2)
        {
            count++;
        }

        for(int i=2;i<=n/2;i++)
        {
           if (n%i==0)
           {
               count++;
           }
        }

        if (count>0)
        {
            System.out.println("Not prime number");
        }
        else
        {
            System.out.println("prime number");
        }

    }
}
