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
     * @param speeds - speeds
     */
    public void setSpeed(final int speeds) {
        this.speed = speeds;
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
