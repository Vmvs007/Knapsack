public class Knapsack {

    private int numOfItems;
    private int capacityOfKnapsack;
    private int[][] knapsackTable;
    private int totalBenefit;
    private int[] weights;
    private int[] values;
    private int count=0;

    public Knapsack(int numOfItems, int capacityOfKnapsack, int[] weights, int[] values) {
        this.numOfItems = numOfItems;
        this.capacityOfKnapsack = capacityOfKnapsack;
        this.weights = weights;
        this.values = values;
        this.knapsackTable=new int[numOfItems+1][capacityOfKnapsack+1];
    }

    public void solve(){
        for(int i=1;i<numOfItems+1;i++){
            count++;
            for(int w=1;w<capacityOfKnapsack+1;w++){
                count++;
                int notTakingItem=knapsackTable[i-1][w];
                int takingItem=0;

                if(weights[i]<=w){

                    takingItem=values[i]+knapsackTable[i-1][w-weights[i]];

                }
                count++;

                knapsackTable[i][w]=Math.max(notTakingItem,takingItem);
            }
            count++;
        }
        count++;
        totalBenefit=knapsackTable[numOfItems][capacityOfKnapsack];

    }

    public void showResult(){
        System.out.println("Total benefit: " + totalBenefit);

        for(int n=numOfItems,w=capacityOfKnapsack;n>0;n--){
            //count++;
            if(knapsackTable[n][w]!=0 && knapsackTable[n][w]!=knapsackTable[n-1][w]){
               // count+=2;
                System.out.println("We take item: #"+n);
                w=w-weights[n];
            }else if(knapsackTable[n][w]==0){
                //count++;
            } else if (knapsackTable[n][w]!=0 && knapsackTable[n][w]==knapsackTable[n-1][w]) {
                //count+=2;
            }
        }
    }
    public void showTable(){
        for(int n=0;n<numOfItems+1;n++){
            for(int j=0;j<capacityOfKnapsack+1;j++){
                System.out.print("|"+knapsackTable[n][j]+"|");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public int getCount(){
        return this.count;
    }

}
