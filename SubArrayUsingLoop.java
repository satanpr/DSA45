import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int count = scn.nextInt();
    int arr[] = new int[count];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    
    for(int i=0; i<arr.length; i++){
        int incr = 1;
        for(int j=i; j<arr.length; j++){
            for(int k=i; k<i+incr; k++){
                System.out.print(arr[k]+"\t");
            }
            
            incr++;
            System.out.println("");
        }
    }
 }

}