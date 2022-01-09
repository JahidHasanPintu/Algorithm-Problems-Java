
package all.problems;

import java.util.Arrays;

import java.util.Scanner;


public class TryCoinC {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size,value,i;
        System.out.println("How many coins?");
        size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter all coins:");
        for(i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter amount to be changed: ");
        value=scan.nextInt();
        Arrays.sort(arr);
        
        
        int count=0;
        int ans[]=new int[size];
        for(i=size-1;i>=0;i--){
            while(value>=arr[i]){
                value=value-arr[i];
                count++;
                ans[i]++;
                if(value==0)
                    break;
                
                
            }
        }
        System.out.println("Total coins nedded: "+count);
        for(i=size-1;i>=0;i--){
            System.out.println(arr[i]+" coins nedded "+ans[i]);
        }
        
        
    }
}
