import java.util.Scanner;
public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];
        System.out.println("Enter the elements of array a");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the elements of array b");
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println("Sum of two array elements is");
        for (int i = 0; i < size; i++) {
            System.out.print(c[i] + " ");
        }
    }
}