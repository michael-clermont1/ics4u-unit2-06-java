/**
 * The Airplane Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2022-10-21
 */

public class Airplane {
    /**
     * Speed Field.
     */
    private int speed;

    /**
     * Constructor.
     */
    public Airplane() {
    }

    /**
     * SetSpeed() Function.
     *
     * @param speed - speed
     */
    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    /**
     * The getSpeed() getter.
     *
     * @return - current speed
     */
    public int getSpeed() {
        return speed;
    }
}
