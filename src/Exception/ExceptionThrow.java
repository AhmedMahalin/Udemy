package Exception;

import java.util.Scanner;

public class ExceptionThrow {
    public void divide(){
        Scanner scan = new Scanner(System. in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int number = scan.nextInt();
        if (number == 0){
            throw new ArithmeticException(("Nicht durch 0 teilen!!"));
        }
        System.out.println(10 / number);
    }
}
