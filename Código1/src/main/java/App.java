public class App {
    public static void main(String[] args) {
        int numOfItems=12;
        int capacityOfKnapsack=12;
/*
        int[] weigthOfItems=new int[numOfItems+1];
        weigthOfItems[1]=6;
        weigthOfItems[2]=1;
        weigthOfItems[3]=2;
        weigthOfItems[4]=6;
        weigthOfItems[5]=2;
        weigthOfItems[6]=1;
        weigthOfItems[7]=3;
        weigthOfItems[8]=2;
        weigthOfItems[9]=2;
        weigthOfItems[10]=8;
        weigthOfItems[11]=1;
        weigthOfItems[12]=2;
        weigthOfItems[13]=1;
        weigthOfItems[14]=1;
        weigthOfItems[15]=6;
        weigthOfItems[16]=2;
        weigthOfItems[17]=3;
        weigthOfItems[18]=2;
        weigthOfItems[19]=3;
        weigthOfItems[20]=1;

        int[] profitOfItems=new int[numOfItems+1];
        profitOfItems[1]=45;
        profitOfItems[2]=20;
        profitOfItems[3]=8;
        profitOfItems[4]=43;
        profitOfItems[5]=10;
        profitOfItems[6]=10;
        profitOfItems[7]=24;
        profitOfItems[8]=18;
        profitOfItems[9]=15;
        profitOfItems[10]=30;
        profitOfItems[11]=50;
        profitOfItems[12]=32;
        profitOfItems[13]=11;
        profitOfItems[14]=11;
        profitOfItems[15]=49;
        profitOfItems[16]=12;
        profitOfItems[17]=28;
        profitOfItems[18]=16;
        profitOfItems[19]=25;
        profitOfItems[20]=19;
*/
 /*int[] weigthOfItems=new int[numOfItems+1];
        weigthOfItems[1]=1;
        weigthOfItems[2]=1;
        weigthOfItems[3]=3;
        weigthOfItems[4]=1;
        weigthOfItems[5]=4;
        weigthOfItems[6]=4;
        weigthOfItems[7]=1;
        weigthOfItems[8]=2;
        weigthOfItems[9]=1;
        weigthOfItems[10]=1;
        weigthOfItems[11]=2;
        weigthOfItems[12]=5;

        int[] profitOfItems=new int[numOfItems+1];
        profitOfItems[1]=15;
        profitOfItems[2]=45;
        profitOfItems[3]=10;
        profitOfItems[4]=8;
        profitOfItems[5]=10;
        profitOfItems[6]=30;
        profitOfItems[7]=25;
        profitOfItems[8]=12;
        profitOfItems[9]=35;
        profitOfItems[10]=50;
        profitOfItems[11]=40;
        profitOfItems[12]=29;
*/
 /*
 int[] weigthOfItems=new int[numOfItems+1];
        weigthOfItems[1]=6;
        weigthOfItems[2]=1;
        weigthOfItems[3]=2;
        weigthOfItems[4]=6;
        weigthOfItems[5]=2;
        weigthOfItems[6]=1;

        int[] profitOfItems=new int[numOfItems+1];
        profitOfItems[1]=45;
        profitOfItems[2]=20;
        profitOfItems[3]=8;
        profitOfItems[4]=43;
        profitOfItems[5]=10;
        profitOfItems[6]=10;
*/
 int[] profitOfItems=new int[numOfItems+1];
        profitOfItems[1]=45;
        profitOfItems[2]=20;
        profitOfItems[3]=8;
        profitOfItems[4]=43;
        profitOfItems[5]=10;
        profitOfItems[6]=10;
        profitOfItems[7]=24;
        profitOfItems[8]=18;
        profitOfItems[9]=15;
        profitOfItems[10]=30;
        profitOfItems[11]=50;
        profitOfItems[12]=32;
 int[] weigthOfItems=new int[numOfItems+1];
        weigthOfItems[1]=6;
        weigthOfItems[2]=1;
        weigthOfItems[3]=2;
        weigthOfItems[4]=6;
        weigthOfItems[5]=2;
        weigthOfItems[6]=1;
        weigthOfItems[7]=3;
        weigthOfItems[8]=2;
        weigthOfItems[9]=2;
        weigthOfItems[10]=8;
        weigthOfItems[11]=1;
        weigthOfItems[12]=2;
        Knapsack knapsack=new Knapsack(numOfItems,capacityOfKnapsack,weigthOfItems,profitOfItems);
        knapsack.solve();
        knapsack.showResult();
knapsack.showTable();
        System.out.println("Quantidade de iterações: " + knapsack.getCount());
    }

}
