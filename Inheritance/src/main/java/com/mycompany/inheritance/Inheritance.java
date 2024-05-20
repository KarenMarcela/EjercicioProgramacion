
package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Administrative;
import com.mycompany.inheritance.people.Person;
import com.mycompany.inheritance.people.Student;
import com.mycompany.inheritance.people.Teacher;


public class Inheritance {

    public static void main(String[] args) {
        Person person = new Person("12678126", "Karen", 17);
        System.out.println("Persona");
        person.fingerPrintRegistry(); //porque se tiene que registrar la huella dactilar
        
        System.out.println("Hola, tu nombre es "+person.getName());
        
        Administrative admin = new Administrative("1233","Pedro", 35,"Divisis");
        System.out.println("Administrativo");
        admin.fingerPrintRegistry(); //porque se tiene que registrar la huella dactilar
        
        System.out.println("Hola, lo hemos identificado como: "+admin.getName());
        
        Student student = new Student("123","Karol", 22,"Ingenieria de sistemas", 4,40);
        System.out.println("El estudiante es : "+student.getName());
        
//        Teacher teacher = new Teacher ("64GY","Julio",40,"");
    }
}

//SOBREESCRITURA ; metodo con acciones distintas