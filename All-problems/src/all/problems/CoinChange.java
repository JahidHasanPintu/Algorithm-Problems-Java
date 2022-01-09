
package all.problems;


public class CoinChange {
  
   public static int[] findMinCoins(int coins[], int size,  int value)
{
    int ans[]=new int[3];
    int i, count = 0;

    for(i = 0; i < size; i++)
    {
        //take as much from coins[i]
        while(value >= coins[i])
        {
            //after taking the coin, reduce the value.
            value -= coins[i];
           // ans[count] = coins[i];
            if(coins[i]==1000){
              //fivh++;
              ans[i]++;
            }else if(coins[i]==500){
             // oneh++;
             ans[i]++;
            }else{
             // thousand++;
             ans[i]++;
            }
            count++;
        }
        if(value == 0)
            break;

        }

        return ans;
    }
    public static void main(String[] args) {
        int coins[] = {1000,500,100};
        int value = 700, i;
        int size =3;
         int MinCount[] = findMinCoins(coins,size,value);
         for(i = 0; i < 3; i++){
             System.out.println(coins[i]+" Taka = " + MinCount[i]);
         }
        
    }
}
