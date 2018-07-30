import javax.swing.JOptionPane;
public class Dollars
{
    public static void main(String[] args)
    {
        String dollarString;
        dollarString = JOptionPane.showInputDialog(null, "Enter amount of money in dollars:");

        int dollar = Integer.parseInt(dollarString);
        int dollarToOneCents = dollar * 100;
        int dollarToFiveCents = (dollar * 100) / 5;
        int dollarToTenCents = (dollar * 100) / 10;
        int dollarToTwentyCents = (dollar * 100) / 20;

        System.out.println("If you have $" + dollar + ", you will have either " +
                dollarToOneCents + " one cents OR " + dollarToFiveCents + " five cents OR " + dollarToTenCents + " ten cents OR "
                + dollarToTwentyCents + " twenty cents.");

    }
}
