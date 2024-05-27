package com.mycompany.game;

import com.mycompany.game.spaceship.MillenniumFalcon;
import com.mycompany.game.spaceship.StellarDestroyer;

public class Game {

    public static void main(String[] args) {
       StellarDestroyer stellarDestroyer = new StellarDestroyer(true, true, "Navy1", true, 4, 20, 100, 200);
       stellarDestroyer.shoot();
       
       MillenniumFalcon millenniumFalcon = new MillenniumFalcon(true, 2, false, "Navy2", true, 2, 40, 100, 250);
       millenniumFalcon.shoot();
    }
}
