import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadCSVFileAndPrintSum {
    public static void main(String[] args) {

        String input = "C:\\Users\\singh\\OneDrive\\Desktop\\Test\\input.csv";
        String output = "C:\\Users\\singh\\OneDrive\\Desktop\\Test\\output.csv";

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
            FileWriter fileWriter = new FileWriter(output);

            double netOutput = 0;

            // Now reading data of each row
            while (bufferedReader.readLine() != null){

                String[] splittedString = bufferedReader.readLine().split(",");

                if (splittedString.length == 3){

                    double firstColumn = Double.parseDouble(splittedString[0]);
                    double secondColumn = Double.parseDouble(splittedString[1]);
                    double thirdColumn = Double.parseDouble(splittedString[2]);

                    // Calculating sun of all three columns
                    double parallelRowSum = firstColumn + secondColumn + thirdColumn;
                    netOutput = netOutput + parallelRowSum;

                    // Inserting(appending) sum to same line
                    fileWriter.write(bufferedReader.readLine() + "," + parallelRowSum);

                }
            }

            // Now write the net sum as well at last in output file
            fileWriter.write("Net Output sum: " + netOutput + "\n");

            bufferedReader.close();
            fileWriter.close();

            System.out.println("Modified CSV data is: "+ output);

        }catch (Exception exception){

            System.out.println("Your file caught with exception: " + exception);;
        }
    }
}
