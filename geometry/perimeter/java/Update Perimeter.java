import java.util.Scanner;

public class my {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println(" for square  parameter press 1 ");
        System.out.println(" for rectangle  parameter press 2 ");
        System.out.println(" for circle circumference / parameter press 3 ");
        System.out.println(" for triangle parameter press 4 ");
        System.out.println(" for e trapezium press 5 ");
        System.out.println("please input 1,2 or3  ");

        Float parameter = sc.nextFloat();

        if (parameter== 1){


            System.out.println(" please enter length value ");

            Float parameterLength = sc.nextFloat();

            Float squareparameter = (4 *parameterLength);


            System.out.println(  squareparameter );


        }

        if (parameter== 2){

            System.out.println(" please enter length value ");

            Float rectangleLength = sc.nextFloat();

            System.out.println(" please enter Breath value ");

            Float rectangleBreath = sc.nextFloat();

            Float rectangleParameter = (2*( rectangleLength + rectangleBreath));

            System.out.println(rectangleParameter);

        }

        if (parameter== 3){

            //System.out.println(" for if condition 3 ");

            System.out.println(" please enter radius value ");

            Float circufrence = sc.nextFloat();

            Float circumfrence35 = (float) (circufrence *2 * 3.14);


            System.out.println(circumfrence35);

        }

        if (parameter==4 ){

            System.out.println(" please enter length value ");

            Float rectangleLength = sc.nextFloat();

            System.out.println(" please enter length value ");

            Float rectanglelength2 = sc.nextFloat();

            System.out.println(" please enter length value ");

            Float rectangleLength3 = sc.nextFloat();

            Float triangleparamete = rectangleLength + rectanglelength2 + rectangleLength3;

            System.out.println(triangleparamete);

        }

        if (parameter== 5){

            System.out.println(" please enter length value ");

            Float trapeziumLength = sc.nextFloat();

            System.out.println(" please enter breath value ");

            Float trapeziumbreath = sc.nextFloat();

            System.out.println(" please enter height value ");

            Float trapeziumheight = sc.nextFloat();

            Float trapeziumparamete =  (trapeziumLength + trapeziumbreath)/2 * trapeziumheight ;

            System.out.println(trapeziumparamete);

        }




    }
}
