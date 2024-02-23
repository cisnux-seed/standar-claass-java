package dev.cisnux.standards.app;

public class NumberClassApp {
    public static <doubleFromString> void main(String[] args) {
        final String integerString = "23";
        final int intFromString = Integer.parseInt(integerString);
        final Integer integerFromString = Integer.valueOf(integerString);
        System.out.println(intFromString);
        System.out.println(integerFromString);

        var maxByte = Byte.MAX_VALUE;
        final Byte maxByteFromPrimitive = maxByte;
        maxByte = maxByteFromPrimitive;

        System.out.println(maxByte);
        System.out.println(maxByteFromPrimitive);

        long longFromByte = maxByte;
        longFromByte++;
        longFromByte++;
        Long longNonPrimitive = Long.valueOf(maxByteFromPrimitive);
        longNonPrimitive++;
        longNonPrimitive++;
        longNonPrimitive++;
        System.out.println(longFromByte);
        System.out.println(longNonPrimitive);

        final String floatString = "10.233";
        try {
            final int failFloatFromString = Integer.parseInt(floatString);
            System.out.println(failFloatFromString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            final float floatFromString = Float.parseFloat(floatString);
            System.out.println("success: " + floatFromString);
        }
    }
}
