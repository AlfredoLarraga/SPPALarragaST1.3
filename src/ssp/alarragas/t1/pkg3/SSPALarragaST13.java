/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.alarragas.t1.pkg3;
import java.util.Scanner;
/**
 *
 * @author
 */
public class SSPALarragaST13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alfredo Alejandro Lárraga Sosa A01410278 LMC
        // Problema 3 Desarrollar un programa para calcular la distancia d entre 2 puntos
        System.out.println("Calculadora de distancia");
        //Declarar Variables
        double x1, y1, x2, y2, dis;// x1 y1=Coordenadas del punto 1 x2 x2=Coordenadas del punto 2
        //Recepción de datos
        Scanner kb=new Scanner (System.in);
        //Asignar Valores
     
        System.out.println("Introduce x1 del punto 1");
        x1=kb.nextDouble();
        System.out.println("Introduce y1 del punto 1");
        y1=kb.nextDouble();
        System.out.println("Introduce x2 del punto 2");
        x2=kb.nextDouble();
        System.out.println("Inroduce y2 del punto 2");
        y2=kb.nextDouble();
        
        //Operación
        dis= Math.hypot(x2-x1, y2-y1);
        
        //Resultado
        System.out.println("La distancia entre tus dos puntos es"+dis);
        
    }
    
}
