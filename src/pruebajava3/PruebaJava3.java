/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import PruebaJava3.clasebd;
import javax.swing.JFrame;
/**Nombre yanira Galeas Rojas
 * Fecha 10 11 2017
 * Clase Prueba Java3
 * @author ceduc
 * Responsabilidad Aplicacion de Escritorio Java
 */
public class PruebaJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       PruebaJava3 w = new clasebd();
      w.setVisible(true);
     
      w.setBounds(0 ,0, 400, 400);
      w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO code application logic here
      
    }
    
}
