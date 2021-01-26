/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.cifpfbmoll.intropoo2;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Persona {
    //1 atributos
    //2 constructores
    //3 getters/setters
    //4 metodos
    public static Scanner lectorPersona=new Scanner(System.in);
    private static int contadorPersonas;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Persona() {
        contadorPersonas++;
    }

    public Persona(String nombre, String apellido1, String apellido2, int edad) {
        contadorPersonas++;
        this.setNombre(nombre);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.setEdad(edad);      
    }


    public Persona(Persona p1) {
        contadorPersonas++;
        this.setNombre(p1.getNombre());
        this.setApellido1(p1.getApellido1());
        this.setApellido2(p1.getApellido2());
        this.setEdad(p1.getEdad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while (edad<18){
            System.out.println("La edad no es correcta");
            System.out.println("Vuelve a introducir la edad");
            edad= lectorPersona.nextInt();           
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + '}';
    }
    
    
    public static Persona solicitarDatosPersona(){
        Scanner lector=new Scanner(System.in);
        Persona p1=new Persona();
        System.out.println("Dame el nombre");
      //  p1.nombre=lector.nextLine();  NO POR FAVOR
        p1.setNombre(lector.nextLine());
        System.out.println("Dame el apellido 1");
        p1.setApellido1(lector.nextLine());
        System.out.println("Dame el apellido 2");
        p1.setApellido2(lector.nextLine());
        System.out.println("Dame la edad");
        p1.setEdad(lector.nextInt()); 
        return p1;
    }
    
    public void solicitarDatosPersona2(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Dame el nombre");
      //  p1.nombre=lector.nextLine();  NO POR FAVOR
        this.setNombre(lector.nextLine());
        System.out.println("Dame el apellido 1");
        this.setApellido1(lector.nextLine());
        System.out.println("Dame el apellido 2");
        this.setApellido2(lector.nextLine());
        System.out.println("Dame la edad");
        this.setEdad(lector.nextInt()); 
    }
    
    


    
    
}
