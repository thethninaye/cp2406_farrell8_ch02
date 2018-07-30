public class QuartsToGallons
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_ONE_GALLON = 4;
        int quarts = 18;
        int neededGallon = quarts / QUARTS_IN_ONE_GALLON;
        int remainQuarts = quarts % QUARTS_IN_ONE_GALLON;
        System.out.println("A job that needs " + quarts + " quarts requires " + neededGallon + " gallons plus " + remainQuarts + " quarts.");
    }
}
