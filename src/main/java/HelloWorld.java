import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class HelloWorld {
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something");
        String userInput = scanner.nextLine();

        System.out.println(isNumeric(userInput));
        System.out.println(upperCase(userInput));
        System.out.println(reverse(userInput));

    }

}