import java.util.Arrays;
import java.util.Scanner;

public class FunctionMultiples {
    public static void main(String[] args) {

//      Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] multiples = new int[sc.nextInt()];

        for(int i = 0; i < multiples.length; i++) {
            multiples[i] = num * (i + 1);
        }

        System.out.println(Arrays.toString(multiples));

    }
}
