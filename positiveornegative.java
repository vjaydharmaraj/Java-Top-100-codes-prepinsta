import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>0)
        {
            System.out.println("positive number");

        }
        else if (n<0)
        {
            System.out.println("Negative number");
        }

        else {
            System.out.println("0 is not accepted Enter valid number!!!");
        }
    }
}
