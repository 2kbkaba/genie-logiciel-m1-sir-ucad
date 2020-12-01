
public class Calculator {


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }


    public static int min(int a, int b) {
        int res = a < b ? a : b;
        return res;
    }


    public static int max(int a, int b) {
        int res = (a > b) ? a : b;
        return res;
    }


    public static int maxElement(int[] list) {
        int maxValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > maxValue) {
                maxValue = list[i];
            }
        }
        return maxValue;
    }


    public static int minElement(int[] list) {
        int minValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minValue) {
                minValue = list[i];
            }
        }
        return minValue;
    }
}
