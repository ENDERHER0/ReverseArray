import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int[] reverseArray = new int[array.length];
        for(int i = array.length - 1, o = 0; i >= 0 && o < array.length; i--, o++) {
            reverseArray[o] = array[i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }
}
