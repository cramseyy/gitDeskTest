import java.util.Scanner;

public class test {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = scan.nextLine();
        System.out.println(text);

        System.out.print("Enter a number: ");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        System.out.print("Enter another number: ");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        System.out.println("Sum " + add(number1,number2));
        
        scan.close();
        num1.close();
        num2.close();
    }

    public static int add(int a, int b){
        return a + b;
    }
}