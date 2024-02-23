package dev.cisnux.standards.app;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        // too large
//        final long overloadLong = 1000_000_000_0;
//        System.out.println(overloadLong);
        final BigInteger x = new BigInteger("10000000000");
        final BigInteger y = new BigInteger("10000000000");
        final BigInteger result = x.add(y);
        System.out.println(x);
        System.out.println(result);

// too large
        final double overloadDouble = Double.MAX_VALUE + Double.MAX_VALUE;
        System.out.println(overloadDouble);

        final BigDecimal w = new BigDecimal(String.valueOf(Double.MAX_VALUE));
        final BigDecimal z = new BigDecimal(String.valueOf(Double.MAX_VALUE));
        System.out.println(w);
        System.out.println(w.add(z));
    }
}
