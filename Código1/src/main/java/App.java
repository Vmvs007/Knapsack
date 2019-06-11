public class App {
    public static void main(String[] args) {
        int numOfItems=3;
        int capacityOfKnapsack=5;

        int[] weigthOfItems=new int[numOfItems+1];
        weigthOfItems[1]=4;
        weigthOfItems[2]=2;
        weigthOfItems[3]=3;

        int[] profitOfItems=new int[numOfItems+1];
        profitOfItems[1]=10;
        profitOfItems[2]=4;
        profitOfItems[3]=7;

        Knapsack knapsack=new Knapsack(numOfItems,capacityOfKnapsack,weigthOfItems,profitOfItems);
        knapsack.solve();
        knapsack.showResult();
    }

}
