import java.util.*;
public class Array {
    public static void main(String[] args){
        int array[]=new int[5];
        System.out.println("enter the number");
        for(int i=0;i<4;i++){
            Scanner sc=new Scanner(System.in);
            array[i]=sc.nextInt();
        }
        System.out.println("the reverce number is");
        for(int i=3;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
