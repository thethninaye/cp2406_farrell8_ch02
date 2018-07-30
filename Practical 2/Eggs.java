import javax.swing.JOptionPane;
public class Eggs
{
    public static void main(String[] args) {
        final double costDozenEggs = 3.25;
        final double costSingleEgg = 0.45;
        int numEggs;
        String numEggsString;
        numEggsString = JOptionPane.showInputDialog(null, "How many eggs did you order?");
        numEggs = Integer.parseInt(numEggsString);
        int numDozenEggs = numEggs / 12;
        int numSingleEggs = numEggs % 12;
        double  finalCost = (numDozenEggs * 3.25) + (numSingleEggs * 0.45);
        System.out.println("You ordered " + numEggs + " eggs. That's " + numDozenEggs
                + " dozen eggs at $" + costDozenEggs + " per dozen and " + numSingleEggs + " loose eggs at $" + costSingleEgg +
                " each for a total of $" + finalCost + ".");
    }
}
