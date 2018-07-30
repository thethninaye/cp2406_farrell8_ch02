import javax.swing.JOptionPane;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        int adultMeal = 7;
        int kidMeal = 4;
        int numAdultMeal, numKidMeal;

        String adultMealString, kidMealString;
        adultMealString = JOptionPane.showInputDialog(null, "How many adult meals do you want to order?");
        kidMealString = JOptionPane.showInputDialog(null, "How many kid meals do you want to order?");

        numAdultMeal = Integer.parseInt(adultMealString);
        numKidMeal = Integer.parseInt(kidMealString);

        int total = (numAdultMeal * adultMeal) + (numKidMeal * kidMeal);

        JOptionPane.showMessageDialog(null, "You ordered " + numAdultMeal + " adult meals and " +
                numKidMeal + " kid meals. The total for adult meals will be $" + (numAdultMeal * adultMeal) +
                " and " + "total for kids meals will be $" + (numKidMeal * kidMeal) + ". The final total will be $" +
                total + ".");
    }
}
