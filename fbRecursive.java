package Fibonacci;

public class fbRecursive {

    public static int fb(int num) {
        if (num <= 2) {
        return 1;
        } else {
        return fb(num-1) + fb(num-2);
        }
    }
}
