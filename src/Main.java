import com.sun.source.tree.WhileLoopTree;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       while (true)
        {
            try
            {
                Scanner scan = new Scanner(System.in);
                float a,b;
                System.out.println("Enter value of a");
                a = scan.nextFloat();
                System.out.println("Enter value of b");
                b = scan.nextFloat();
                System.out.println("div of a and b:" + (a/b));
            }
            catch (Exception e)
            {
                System.out.println("something went wrong");
            }
        }

    }
}
