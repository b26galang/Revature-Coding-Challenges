//  Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

public class FunctionMultiples {
    public static void main(String[] args) {
        arrayOfMultiples(7,5);
        arrayOfMultiples(12,10);
        arrayOfMultiples(17,6);
    }
    public static int[] arrayOfMultiples(int num, int length) {
        int [] multiples = new int[length];
        for(int i = 0; i < length; i++) {
            multiples[i] = num * (i + 1);
        }
        return multiples;
    }
}
