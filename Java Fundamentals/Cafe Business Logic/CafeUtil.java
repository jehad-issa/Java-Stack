import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil{
    public int getStreakGoal(){
    int[] myArray = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
    int sum = 0;
    for(int i=0; i<myArray.length;i++){
        sum+= myArray[i];
    }
    return sum;
}
    public double getOrderTotal(double[] prices){
        double [] lineItems = {2,4.5,3,4};
        double sum = 0.0;
        for(double x=0.0; x<lineItems.length; x++){
            sum+= lineItems[(int) x];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        List<String> loadMenu = Arrays.asList("drip coffee", "cappucino", "latte", "mocha");
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        System.out.println(menu);
    }


}