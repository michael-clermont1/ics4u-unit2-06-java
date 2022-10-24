/**
 * This is the standard Main() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2022-10-21
 */

final class Main {

    /**
     * Constant Variable MagicNumber4.
     *
     */
    private static final int MAGIC4 = 4;

    /**
     * Constant Variable MagicNumber212.
     *
     */
    private static final int MAGIC212 = 212;

    /**
     * Constant Variable MagicNumber422.
     *
     */
    private static final int MAGIC422 = 422;

    /**
     * Constant Variable MagicNumber5000.
     *
     */
    private static final int MAGIC5000 = 5000;

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // use Stack class
        final Airplane biplane = new Airplane();
        biplane.setSpeed(MAGIC212);
        System.out.println(biplane.getSpeed());
        final Jet2 boeing = new Jet2();
        boeing.setSpeed(MAGIC422);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < MAGIC4) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > MAGIC5000) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
    }
}
