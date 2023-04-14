public class SecondMaxNum {

    public static int secondMaxNumber;

    public static void main(String[] args) {

        System.out.println(getSecondMaxNumber(10, 15, 20));

        System.out.println(Math.max(30, Math.max(15, 20)));
    }

    private static int getSecondMaxNumber(int i1, int i2, int i) {
        return secondMaxNumber;
    }

    public static int getMaximumNumber(int num1, int num2, int num3) {
        int maximumNumber = num1;
//            int secondMaximumNumber = num;
        if (num2 < maximumNumber) {
            secondMaxNumber = num2;
        }
        if (num3 > secondMaxNumber) {
            secondMaxNumber = num3;
        }

        return secondMaxNumber;
    }

    public static int addition(int a, int b) {
        return a + b;

    }
}
