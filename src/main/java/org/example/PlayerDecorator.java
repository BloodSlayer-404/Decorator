package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayerDecorator implements Player{
    private Player wrapper;

    /**
     *
     * @return The wrapper phrase for movement
     */
    @Override
    public String movement() {
        return wrapper.movement();
    }

    /**
     *
     * @return The velocity of the wrapper
     */
    @Override
    public double speed() {
        return wrapper.speed();
    }
}
