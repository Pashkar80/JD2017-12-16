package by.it.kozlov.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;

        Parser parser = new Parser();
        while (!(line = sc.nextLine()).equals("end")) {
            if (line.toLowerCase().contains("printvar")) {
                System.out.println(VarsMap.printvar());
                continue;
            }

            try {
                System.out.println(parser.operations(line.trim()));
            } catch (CalcException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
