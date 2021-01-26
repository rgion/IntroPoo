/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.cifpfbmoll.intropoo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> listaPersonas = new ArrayList();
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas personas quieres crearte?");
        int numPersonas = lector.nextInt();
        for (int i = 0; i < numPersonas; i++) {
            listaPersonas.add(Persona.solicitarDatosPersona());
        }

        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i).toString());
        }

    }

}
