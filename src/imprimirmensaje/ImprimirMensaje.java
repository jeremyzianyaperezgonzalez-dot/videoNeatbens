/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimirmensaje;

/**
 *
 * @author Usuario
 */
public class ImprimirMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo");
        System.out.println("comida china!!!!!!");
        System.out.println("imprimir menu: ");
        System.out.println("3 tiempos: ");
        System.out.println(" sopa o crema, enchiladas o carne de pollo, gelatina o arroz con leche");
        mensaje agradecimiento = new mensaje();
        
        // Llamar al método de la clase Saludo
        agradecimiento.mostrarMensaje();

    }
    
}
