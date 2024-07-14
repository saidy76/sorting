
//bubble sort
package sorting;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter arrays length :");
        int n=sc.nextInt();
        int array[]=new int[n];
         System.out.println("enter arrays input :");
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        
        System.out.print("array before sorting :");
        
        for (int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.print("array after sorting :");
        
        for (int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
    }
}
