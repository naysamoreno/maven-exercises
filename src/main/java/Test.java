import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        StringUtils.isNumeric(userInput);

        if(!StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is not a number");
        } else System.out.println(userInput);

        // flips case of the string
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        // reverses
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }




}
