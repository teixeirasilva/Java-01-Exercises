// Temperature Converter Fahrenheit to Celsius - May 2018

import java.util.Scanner; 

public class TemperatureConverter {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degrees in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        input.close();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
