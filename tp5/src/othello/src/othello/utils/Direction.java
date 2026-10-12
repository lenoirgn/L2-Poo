package othello.utils;
public enum Direction {
    N(-1, 0),
    NE(-1, 1),
    E(0, 1),
    SE(1, 1),
    S(1, 0),
    SW(1, -1),
    W(0, -1),
    NW(-1, -1);

    private final int deltaX;
    private final int deltaY;
    /**
     * Constructs a Direction enum constant with the specified deltaX and deltaY values.
     * @param deltaX the change in the x-coordinate for this direction
     * @param deltaY the change in the y-coordinate for this direction
     */
    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }
    
    /**
     * Returns the change in the x-coordinate for this direction.
     * @return the change in the x-coordinate
     */

    public int getDeltaX() {
        return this.deltaX;
    }
    /**
     * Returns the change in the y-coordinate for this direction.
     * @return the change in the y-coordinate
     */

    public int getDeltaY() {
        return this.deltaY;
    }
}