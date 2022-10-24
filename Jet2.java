/**
 * The Jet Class.
 *
 * @author Michael Clermont
 * @version 1.0
 * @since 10-24-2022
 */

public class Jet2 extends Airplane {

    /**
     * MULTIPLIER constant.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Constructor.
     */
    public Jet2() {
        // super();
        // commented out until constructor has values.
    }

    /**
     * SetSpeed() Function.
     *
     * @param speed - Speed
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Accelerate Function.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }

}

