import java.util.Scanner;

public class Greatestof3numbers {
    public static void main(String[] args) {
        System.out.println("Enter num 1 : ");
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter num 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Enter num 3 : ");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+" is the greatest number");
        }
        else if (n2>n3)
        {
            System.out.println(n2+" is the greatest number");
        }
        else
        {
            System.out.println(n3+" is the greatest number");
        }


    }
}
