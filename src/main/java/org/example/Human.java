package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Human implements Player{
    private String name;

    /**
     * A default phrase of movement for Humans
     * @return Players name + "moves in the plains"
     */
    @Override
    public String movement() {
        return name + " moves in the plains";
    }

    /**
     * The default speed of a Human
     * @return 5.2
     */
    @Override
    public double speed() {
        return 5.2;
    }
}
