
package com.mycompany.game.spaceship;


public class MillenniumFalcon extends NuclearShip {
    private boolean hyperSpeed;
    private int cannons;
    private boolean shield;

    public MillenniumFalcon(boolean hyperSpeed, int cannons, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed); //Llamar el constructor del padre
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shield = shield;
    }
    
    @Override //indicar que se hara una sobrecarga
    public void shoot(){
        System.out.println("Disparo a cañonazos!!!");
    }
    
    /*@Override
    public void fly(){
        
    }*/
    
    public void toggleShield(){ //Activar o desactivar el escudo
        this.shield = !this.shield;
        
    }
}
