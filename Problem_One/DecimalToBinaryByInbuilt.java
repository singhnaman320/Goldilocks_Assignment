import java.util.Scanner;

public class DecimalToBinaryByInbuilt {

    public void convert(String inputString){

        try {

            // Converting input string to integer
            int decimalValue = Integer.parseInt(inputString);

            // Converting decimal value to binary string value
            String binaryString = Integer.toBinaryString(decimalValue);

            System.out.println("Binary conversion of this input string is : " + binaryString);

        }catch (NumberFormatException exception){

            System.out.println("Please check the format of your input string");
        }

    }

    public static void main(String[] args) {

        DecimalToBinaryByInbuilt decimalToBinaryByInbuilt = new DecimalToBinaryByInbuilt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your decimal number string");
        String str = scanner.next();
        decimalToBinaryByInbuilt.convert(str);
    }
}
