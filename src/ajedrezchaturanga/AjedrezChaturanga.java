/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrezchaturanga;
import java.util.Scanner;

public class AjedrezChaturanga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String op;
        int opcion;
        do{
        Scanner sc=new Scanner (System.in);
        System.out.println("AJEDREZ CHATURANGA");
        System.out.println("1_Jugar chaturanga");
        System.out.println("2_Estadisticas de Juego");
        System.out.println("3_Salir");
        System.out.print("Seleccione una Opción (1-3) :");
        op=sc.next();
        try{
           opcion=Integer.parseInt(op);
        }catch(NumberFormatException e){
            opcion=0;
        }
        
            System.out.println(""+opcion);
        }while(opcion<1||opcion>3); 
    }
}
