/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2grupal.javawithant;

/**
 *
 * @author Ranma
 */
public class TP2GrupalJavawithant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj reloj = new Reloj("123","rolex");
        Persona p1 = new Persona("Lourdes","Escudero",22,1,reloj);
        RelojFit r= new RelojFit("123","a"); 
        
        System.out.print("El dia es: ");
        p1.getUnreloj().getDia();
        p1.getUnreloj().incrementarDia(1);
        p1.getUnreloj().getDia();
         p1.getUnreloj().incrementarDia(1);
        p1.getUnreloj().getDia();
        
        p1.getUnreloj().incrementarHora(3);
        System.out.println(p1.getUnreloj().getHora());
        
        System.out.println("Has hecho : "+r.cuentapasos(2, 2)+ " pasos. Comentario de prueba");
        System.out.println("Has hecho : "+r.cuentapasos(3, 3)+ " pasos.");
        System.out.println("Has hecho : "+r.cuentapasos(33, 30)+ " pasos.");
    }
    
}