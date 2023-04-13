package base;

/**
 * @author mizhuo
 */
public strictfp class Strictfp {
    private static double aDouble = 0.0555500333333212d;
    private static float aFloat = 0333000000222f;

    public static void main(String[] args) {
        double cDouble = aDouble / aFloat;
        System.out.println("aDouble:" + aDouble);
        System.out.println("aFloat:" + aFloat);
        System.out.println("cDouble:" + cDouble);
    }
}
