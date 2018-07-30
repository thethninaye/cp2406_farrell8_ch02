import javax.swing.JOptionPane;
public class MinutesConversion
{
    public static void main(String[] args)
    {
        String minutesString = JOptionPane.showInputDialog(null, "Enter number of minutes:");

        int minutes = Integer.parseInt(minutesString);
        int minutesToHour = minutes / 60;
        int minutesToDay = minutes / (60 * 24);

        JOptionPane.showMessageDialog(null, "If you have " + minutes + " minutes, that will be " +
                minutesToHour + " hours OR " + minutesToDay + " days.");

    }
}
