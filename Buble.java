package sample;

public class Buble {
    public static void main(String[] args) {

        int[] a = {34, 56, 73, 76, 54, 5, 37, 83, 24, 15, 3, 68, 59};
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                   int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted=false;

                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}