package aao;

/**
 * <h3>
 * <strong>Classe com método main para testar e mostrar os resultados
 * obtidos</strong>
 * </h3>
 *
 * @author Grupo 2
 */
public class App {

    /**
     * Método main para mostrar os resultados
     *
     * @param args
     */
    public static void main(String[] args) {
        int numOfItems = 12;
        int capacityOfKnapsack = 12;
        int[] profitOfItems = new int[numOfItems + 1];
        profitOfItems[1] = 45;
        profitOfItems[2] = 20;
        profitOfItems[3] = 8;
        profitOfItems[4] = 43;
        profitOfItems[5] = 10;
        profitOfItems[6] = 10;
        profitOfItems[7] = 24;
        profitOfItems[8] = 18;
        profitOfItems[9] = 15;
        profitOfItems[10] = 30;
        profitOfItems[11] = 50;
        profitOfItems[12] = 32;
        int[] weigthOfItems = new int[numOfItems + 1];
        weigthOfItems[1] = 6;
        weigthOfItems[2] = 1;
        weigthOfItems[3] = 2;
        weigthOfItems[4] = 6;
        weigthOfItems[5] = 2;
        weigthOfItems[6] = 1;
        weigthOfItems[7] = 3;
        weigthOfItems[8] = 2;
        weigthOfItems[9] = 2;
        weigthOfItems[10] = 8;
        weigthOfItems[11] = 1;
        weigthOfItems[12] = 2;
        Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, weigthOfItems, profitOfItems);
        knapsack.solve();
        knapsack.showResult();
        knapsack.showTable();
        System.out.println("Quantidade de iterações: " + knapsack.getCount());
    }

}
