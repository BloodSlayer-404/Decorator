package org.example;

public interface Player {

    /**
     * Returns the way of movement that the player is using
     * @return The way of movement that the player actually have
     */
    String movement();

    /**
     * Return the speed of the player depending on which movement way is using
     * @return The speed that have the player
     */
    double speed();
}
