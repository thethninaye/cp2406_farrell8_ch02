import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_ONE_GALLON = 4;
        int quarts;
        String quartsString;
        quartsString = JOptionPane.showInputDialog(null,"How many quarts of paint does this job require?");
        quarts = Integer.parseInt(quartsString);
        int neededGallon = quarts / QUARTS_IN_ONE_GALLON;
        int remainQuarts = quarts % QUARTS_IN_ONE_GALLON;
        System.out.println("A job that needs " + quarts + " quarts requires " + neededGallon + " gallons plus " + remainQuarts + " quarts.");
    }
}
