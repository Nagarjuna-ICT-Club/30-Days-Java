
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 60;   // Binary: 0011 1100
        int b = 13;   // Binary: 0000 1101
        
        System.out.println("a & b: " + (a & b));  // Binary result: 0000 1100, which is 12
        System.out.println("a | b: " + (a | b));  // Binary result: 0011 1101, which is 61
        System.out.println("a ^ b: " + (a ^ b));  // Binary result: 0011 0001, which is 49
        System.out.println("~a: " + (~a));        // Binary result: 1100 0011, which is -61
        System.out.println("a << 2: " + (a << 2)); // Binary result: 1111 0000, which is 240
        System.out.println("a >> 2: " + (a >> 2)); // Binary result: 0000 1111, which is 15
        System.out.println("a >>> 2: " + (a >>> 2)); // Binary result: 0000 1111, which is 15
    }
}
