public class Main {

    public static void main(String[] args) {
        int result1 = add(3, 8);
        System.out.println(result1);

        int result2 = add(3, 8, 4, 9);
        System.out.println(result2);

        String morningGreetingResult1 = morningGreeting("Toby Fox");
        System.out.println(morningGreetingResult1);

        String afternoonGreetingResult1 = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingResult1);

        String oohbabyResult1 = triple("oohbaby");
        System.out.println(oohbabyResult1);

        double result3 = (double) half(8);
        System.out.println(result3);

        double result4 = (double) roundPositiveValueToNearestInteger(8.5);
        System.out.println(result4);

        double result5 = (double) roundNegativeValueToNearestInteger(-8.5);
        System.out.println(result5);
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a, b),add(c, d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String tobyFox) {
        return ("早上好, " + tobyFox) + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String macMiller) {
        return ("下午好, " + macMiller + "!");
    }

    // 5. triple
    public static String triple(String oohbaby) {
        return oohbaby + oohbaby + oohbaby;
    }

    // 6. half
    public static double half(double i) {
        return  i / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double v) {
        return (int)(v + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double v) {
        return (int)(v - 0.5);
    }
}

