public class InchesToFeet
{
    public static void main(String[] args)
    {
        final double INCHES_IN_ONE_FEET = 0.08;
        int inches = 86;
        double obtainFeet = inches / INCHES_IN_ONE_FEET;
        double remainInches = inches % INCHES_IN_ONE_FEET;
        System.out.println(inches + " inches can be converted to " +
                obtainFeet + " feet and " + remainInches + " inches.");
    }
}
