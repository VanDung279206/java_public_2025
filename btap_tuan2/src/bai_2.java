import java.util.Scanner;

import static java.lang.Math.abs;

public class bai_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(i%2==1){
              int cantrai = (i-1>=0) ? a[i-1] : 0;
              int canphai = (i+1<n) ? a[i+1] : 0;
              a[i] += abs(canphai - cantrai );
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
