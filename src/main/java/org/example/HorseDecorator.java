package org.example;

public class HorseDecorator extends PlayerDecorator{

    public HorseDecorator(Player wrapper) {
        super(wrapper);
    }

    @Override
    public String movement(){
        return ride(super.movement());
    }

    @Override
    public double speed() {
        return accelerate(super.speed());
    }

    /**
     * Adds "riding a horse" at the end of a text
     * @param movement: The movement phrase of the object that is wrapped
     * @return The original phrases with + "riding a horse" at the end
     */
    private String ride(String movement){
        return movement.concat( " riding a horse");
    }

    /**
     * Multiply a number by 14
     * @param speed: The speed value of the object that is wrapped
     * @return The speed of the wrapped object multiply by 14
     */
    private double accelerate(double speed){
        return speed*14;
    }
}
