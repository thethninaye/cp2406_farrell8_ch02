import javax.swing.*;

public class TicketNumber {
    public static void main(String[] args)
    {
        String ticketNumberString;
        int ticketNumber, fiveDigitTicketNumber, droppedDigit, remainder;
        ticketNumberString = JOptionPane.showInputDialog(null, "Enter the 6 digit ticket number:");
        ticketNumber = Integer.parseInt(ticketNumberString);
        fiveDigitTicketNumber = ticketNumber / 10;
        droppedDigit = ticketNumber % 10;
        remainder = fiveDigitTicketNumber % 7;
        boolean status = droppedDigit == remainder;
        JOptionPane.showMessageDialog(null, "Your ticket is " + status + ".");
    }
}
