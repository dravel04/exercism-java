public class Secrets {
    public static int shiftBack(int value, int amount) {
        // Secrets.shiftBack(0b1001, 2);
        // # => 0b0010
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        // A bit from value should be set to 1 where the bit in the mask is also 1. All other bits should be kept unchanged.
        // Secrets.setBits(0b0110, 0b0101);
        // # => 0b0111
        // 1 - 1 -> 1
        // 1 - 0 -> 1
        // 0 - 1 -> 1
        // 0 - 0 -> 0
        return value | mask;
    }
    
    public static int flipBits(int value, int mask) {
        // If the bit is 1 in mask, the bit is flipped in the value. All other bits are kept unchanged.
        // Secrets.flipBits(0b1100, 0b0101);
        // # => 0b1001
        // 1 - 1 -> 0
        // 1 - 0 -> 1
        // 0 - 1 -> 1
        // 0 - 0 -> 0
        return value ^ mask;
    }
    
    public static int clearBits(int value, int mask) {
        // The bits in the value should be set to 0 where the bit in the mask is 1. All other bits should be kept unchanged.
        // Secrets.clearBits(0b0110, 0b0101);
        // # => 0b0010
        // 1 - 1 -> 0
        // 1 - 0 -> 1 ==> Z = A * /B
        // 0 - 1 -> 0
        // 0 - 0 -> 0
        return value & (~mask);
    }
}