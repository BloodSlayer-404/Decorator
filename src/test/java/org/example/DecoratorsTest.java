package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorsTest {

    Player player = new Human("Link");
    Player mount = new HorseDecorator(player);
    Player jesus = new WaterBootsDecorator(player);
    Player kelpie = new WaterBootsDecorator(mount);
    Player donkey = new HorseDecorator(jesus);


    /**
     * Checks the correct functionality of the Human class methods
     */
    @Test
    void palyerTest(){
        assertEquals(5.2, player.speed());
        assertEquals("Link moves in the plains", player.movement());
    }

    /**
     * Checks the correct functionality of the Horse wrapper
     */
    @Test
    void horseTest(){
        assertEquals(5.2*14, mount.speed());
        assertEquals("Link moves in the plains riding a horse", mount.movement());
    }

    /**
     * Checks the correct functionality of the Water Boots wrapper
     */
    @Test
    void waterBootsTest(){
        assertEquals(5.2/1.5, jesus.speed());
        assertEquals("Link moves in the plains over the water", jesus.movement());
    }

    /**
     * Checks the correct functionality when you wrap a Human in a Horse, and that Horse in the Water Boots
     */
    @Test
    void kelpieTest(){
        assertEquals(5.2*14/1.5, kelpie.speed());
        assertEquals("Link moves in the plains riding a horse over the water", kelpie.movement());
    }

    /**
     * Checks the correct functionality when you wrap a Human in Water Boots, and that Water Boots in a Horse
     */
    @Test
    void donkeyTest(){
        assertEquals(5.2/1.5*14, donkey.speed());
        assertEquals("Link moves in the plains over the water riding a horse", donkey.movement());
    }
}