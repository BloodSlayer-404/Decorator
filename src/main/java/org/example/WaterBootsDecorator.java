package org.example;

public class WaterBootsDecorator extends PlayerDecorator{

    public WaterBootsDecorator(Player wrapper) {
        super(wrapper);
    }

    @Override
    public String movement(){
        return waterWalking(super.movement());
    }

    @Override
    public double speed() {
        return decelerate(super.speed());
    }

    /**
     * Adds "rover the water" at the end of a text
     * @param movement: The movement phrase of the object that is wrapped
     * @return The original phrases with + "over the water" at the end
     */
    private String waterWalking(String movement){
        return movement.concat( " over the water");
    }

    /**
     * Divides a number by 1.5
     * @param speed: The speed value of the object that is wrapped
     * @return The speed of the wrapped object divided by 1.5
     */
    private double decelerate(double speed){
        return speed/1.5;
    }
}
