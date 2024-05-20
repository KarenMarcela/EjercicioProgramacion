
package com.mycompany.inheritance.people;


public class Teacher extends Person {
    private String[] subjects;

    public Teacher(String ID, String name, int age,String[] subjects) {
        super(ID, name, age);
        this.subjects = subjects;
    }

   
    
    
    public void seeStudentData(){
        System.out.println("Profesor viendo los datos del estudiante");
    }
    
    public void setStudentGrades(){
        System.out.println("Profesor viendo las notas del estudiante");
    }
    
    
}
