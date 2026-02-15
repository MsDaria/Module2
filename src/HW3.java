import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}

public class HW3 {
    public static void section1(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Введите число: ");
                int number = scanner.nextInt();
                if(number < 0){
                    throw new NegativeNumberException("Ошибка: введено отрицательное число!");
                }
                System.out.println("Результат: " + (100 / number));
                break;
            }catch (ArithmeticException e){
                System.out.println("Ошибка: дление на ноль не возможно! Попробуйте снова.");
            }catch (InputMismatchException e){
                System.out.println("Ошибка: введено нечисловое значение! Попробуйте снова.");
                scanner.next();
            }catch (NegativeNumberException e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
