

public class Main {
    public static void main(String[] args) {

        // DECLARATION DE VARIABLES
        int[] myNumbers = {4, 2, 3, 10, 9, 5, 13};

        int a = 10;
        int b = 5;


        // START PROG

        // Min ELEMENT
        System.out.println("le plus petit nombre : " + Calculator.minElement(myNumbers));

        // MAX ELEMENT
        System.out.println("le plus grand nombre : " + Calculator.maxElement(myNumbers));

        // SUM
        System.out.println(a + " + " + b + " = " + Calculator.sum(a, b));

        // MINUS
        System.out.println(a + " - " + b + " = " + Calculator.minus(a, b));

        // DIVIDE
        System.out.println(a + " / " + b + " = " + Calculator.divide(a, b));

        //MIN
        System.out.println("la plus petite valeur entre  " + a + " et " + b + " : " + Calculator.min(a, b));

        //MAX
        System.out.println("la plus grande valeur entre  " + a + " et " + b + " : " + Calculator.max(a, b));

        // END
    }
}
