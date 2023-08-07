import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Welcomes to Bhavya's Calculator");
        int sum = 1;
        boolean calculatorON = true;
        while (calculatorON)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for division");
            System.out.println("press 5 for modulo");
            sum = sc.nextInt();
            switch (sum)
            {
                case 1:
                    System.out.println("1 for addition");
                    Scanner scan = new Scanner(System.in);
                    float a, b,c;
                    System.out.println("Enter value of a");
                    a = scan.nextFloat();
                    System.out.println("Enter value of b");
                    b = scan.nextFloat();
                    System.out.println("sum of a and b:" + String.format("%.2f", (a + b)));
                    break;
                case 2:
                    System.out.println("2 for subtraction");
                    scan = new Scanner(System.in);
                    System.out.println("Enter value of a");
                    a = scan.nextFloat();
                    System.out.println("Enter value of b");
                    b = scan.nextFloat();
                    System.out.println("sub of a and b:" + String.format("%.2f", (a - b)));
                    break;
                case 3:
                    System.out.println("3 for multiplication");
                    scan = new Scanner(System.in);
                    System.out.println("Enter value of a");
                    a = scan.nextFloat();
                    System.out.println("Enter value of b");
                    b = scan.nextFloat();
                    System.out.println("mul of a and b:" + String.format("%.2f", (a * b)));
                    break;
                case 4:
                    System.out.println("4 for division");
                    scan = new Scanner(System.in);
                    System.out.println("Enter value of a");
                    a = scan.nextFloat();
                    System.out.println("Enter value of b");
                    b = scan.nextFloat();
                    System.out.println("div of a and b:" + String.format("%.2f", (a / b)));
                    break;
                case 5:
                    System.out.println("5 for modulo");
                    scan = new Scanner(System.in);
                    System.out.println("Enter value of a");
                    a = scan.nextFloat();
                    System.out.println("Enter value of b");
                    b = scan.nextFloat();
                    System.out.println("modulo of a and b:" + String.format("%.2f", (a % b)));
                    break;
                default:
                    System.out.println(("something went wrong plzz try again"));
                    calculatorON = false;
                 break;
            }
        }
    }
}
