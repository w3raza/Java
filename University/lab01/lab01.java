
/**
 * generuje klucz publiczny (e, n) i prywatny (d, n) RSA, wychodząc od dwóch liczb pierwszych: p=397, q=103,
 *koduje wyraz podany jako parametr z wykorzystaniem algorytmu RSA,
 *odszyfrowuje zakodowany wcześniej wyraz (dla testu).
 */

import java.math.BigInteger;

public class lab01 {

    public static int extendedEuclid(int a, int b) {
        int x_0 = 1;
        int x = 0;
        int b_0 = b;
        while (b != 0) {
            int q = a / b;
            int temp = x;
            x = x_0 - q * x;
            x_0 = temp;
            temp = a % b;
            a = b;
            b = temp;
        }
        if (x_0 < 0)
            x_0 = x_0 + b_0;
        return x_0;

    }

    // public static int powMod(byte t, int e, int n) {
    // int y = 1;
    // for (int k = (n - 1); k < 0; k--) {
    // y = y * (y % n);
    // if()
    // }
    // return y;
    // }

    public static void main(String[] args) {
        byte[] word = args[0].getBytes();

        // generating keys
        int p = 397;
        int q = 103;
        int n = p * q;

        BigInteger e = new BigInteger("" + 3);
        BigInteger fi = new BigInteger("" + ((p - 1) * (q - 1)));

        while (e.gcd(fi).intValue() != 1) {
            e = e.add(new BigInteger("" + 2));
        }
        System.out.println("e = " + e);
        int d = extendedEuclid(e.intValue(), fi.intValue());
        System.out.println("d= " + d);

        // coding
        System.out.print("Your word: " + args[0] + '\n' + "After converting: ");
        for (var i : word) {
            System.out.print(i + " ");
        }

        BigInteger array[] = new BigInteger[args[0].length()];

        System.out.print("Coded: ");
        for (int i = 0; i < args[0].length(); i++) {
            array[i] = BigInteger.valueOf(word[i]).modPow(e, new BigInteger("" + n));
            System.out.print(array[i] + " ");
        }
        // decoding
        String wordAfterDecoding = "";
        System.out.print('\n' + "Decoded: ");
        for (int i = 0; i < args[0].length(); i++) {
            array[i] = array[i].modPow(new BigInteger("" + d), new BigInteger("" + n));
            System.out.print(array[i] + " ");

            wordAfterDecoding += (char) array[i].intValue();
        }
        System.out.println('\n' + "Word after decoding: " + wordAfterDecoding);
    }
}