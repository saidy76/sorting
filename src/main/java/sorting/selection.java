//selection
package sorting;
import java.util.Scanner;

public class selection {
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
        for(int i=0;i<n;i++){
            int smallest =i;
            for(int j=i+1;j<n;j++){
                if(array[smallest]>array[j]){
                    smallest=j;
                }
                int temp=array[i];
                array[i]=array[smallest];
                array[smallest]=temp;
            }
        }
        System.out.print("array after sorting :");
        
        for (int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
    }

}   

