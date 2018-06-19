package acadview2;
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter the number : ");
        int num = scanner.nextInt();
        int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

	


