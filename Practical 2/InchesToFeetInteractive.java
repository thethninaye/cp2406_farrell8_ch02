import javax.swing.*;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        final double INCHES_IN_ONE_FEET = 0.08;
        int inches;
        String inchesString;
        inchesString = JOptionPane.showInputDialog(null,"How many inches do you want to convert to feet and inches?");
        inches = Integer.parseInt(inchesString);
        double obtainFeet = inches / INCHES_IN_ONE_FEET;
        double remainInches = inches % INCHES_IN_ONE_FEET;
        System.out.println(inches + " inches can be converted to " +
                obtainFeet + " feet and " + remainInches + " inches.");
    }
}
