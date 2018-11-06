/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author T10
 */
public class Main {
    
    public static void main(String[] args) {
        String nombre,escuela,especialidad,semestre;
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos:\n\n");
        System.out.println("Ingrese su nombre: ");
        nombre=kb.nextLine();
        System.out.println("Ingrese su escuela: ");
        escuela=kb.nextLine();
        System.out.println("Ingrese su especialidad: ");
        especialidad=kb.nextLine();
        System.out.println("Ingrese el semestre que cursa: ");
        semestre=kb.nextLine();
        JOptionPane.showMessageDialog(null, "Los datos ingresados fueron: Nombre: "+nombre+" ");
        
        
    }
}
