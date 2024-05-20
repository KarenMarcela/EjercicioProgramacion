package com.mycompany.inheritance.people;

public class Administrative extends Person { //Extiende a otra clase
    private String dependency;

    public Administrative( String ID , String name, int age,String dependency) {
        super(ID,name, age); //Llamar al constructor de la clase padre ( person)
        this.dependency = dependency;
        
    }
    
    public void seeData(){
        System.out.println("Mostrar datos al administrativo");
    }
    
    @Override //BUENA PRACTICA Anotacion que significa sobreescribir
    public void fingerPrintRegistry(){ //Estamos sobreescribiendo el metodo ,
    //tiene el mismo metodo pero la accion a realicar es distinta a la de la clase Person
    
        System.out.println("Administrativo, registrando huella");
    }
}
