import java.util.Scanner;

public class DecimalToBinaryByWithoutInbuilt {

    public static String convert(String inputString){

        int decimalValue = Integer.parseInt(inputString);
        StringBuilder binaryValue = new StringBuilder();

        if (decimalValue <= 0){

            binaryValue.append("0");

        }else{

            while (decimalValue > 0){

                int outcome = decimalValue % 2;
                // Adding outcome as remainder in beginning
                binaryValue.insert(0, outcome);
                decimalValue = decimalValue / 2;
            }
        }

        return binaryValue.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String decimalString = scanner.next();

        System.out.println(convert(decimalString));
    }
}
