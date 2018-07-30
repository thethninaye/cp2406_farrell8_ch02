public class NauticalMiles
{
    public static void main(String[] args)
    {
        final double KM_IN_NAUTICAL_MILE = 1.852;
        final double MILE_IN_NAUTICAL_MILE = 1.150779;
        double nauticalMile = 30;
        double nauticalMileInKm = nauticalMile * KM_IN_NAUTICAL_MILE;
        double nauticalMileInMile = nauticalMile * MILE_IN_NAUTICAL_MILE;
        System.out.println("There is" + nauticalMile + "nautical miles. It can be converted into " + nauticalMileInKm + "km or " + nauticalMileInMile + "miles.");
    }
}
