import java.util.*;

public class InputCode
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum  += scanner.nextInt();
        }
        System.out.println("Sum:" + sum);
    }
}