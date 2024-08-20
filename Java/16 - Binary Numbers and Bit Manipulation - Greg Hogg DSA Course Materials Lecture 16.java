// Binary Numbers and Bit Manipulation - Greg Hogg DSA Course Materials Lecture 16


public class Main {
    public static void main(String[] args) {
        // Decimal to Binary
        System.out.println(Integer.toBinaryString(5));

        // Convert Binary to Decimal
        String binary_5 = "101";
        System.out.println(Integer.parseInt(binary_5, 2));

        // Bitwise AND
        System.out.println(5 & 7);

        // Bitwise OR
        System.out.println(5 | 7);

        // Bitwise XOR
        System.out.println(5 ^ 7);

        // Bitwise NOT
        System.out.println(~5);

        // Left Shift
        System.out.println(5 << 2);

        // Arithmetic (Signed) Right Shift
        System.out.println(5 >> 1);

        // Hexadecimal (Base 16)
        System.out.println(Integer.toHexString(890));
    }
}
