/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd2;
import javax.swing.*;
import java.awt.*;
import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;

/**Nombre yanira Galeas Rojas
 *Fecha 10 11 2017
 * Clase Prueba Java3
 * @author ceduc
 * Responsabilidad Aplicacion de Escritorio Java
 *
 */
public class conexionbd2 
{
    JPanel panel;
    JLabel label;
    JTextField text;
    JTextField text2;
    JButton boton;
    JButton boton2; 
    {
     panel = new JPanel();
    label = new JLabel();
    text = new JTextField(20);
    text = new JTextField ();
    boton = new JButton();
    boton2 = new JButton();
      
    public conexionbd2()
   
   {       
     
    panel.add(text);
    panel.add(label);
    panel.add(text);
    panel.add(boton);
    panel.add(boton2);
    
    
     label.setText()
     label.setText("Tercera Evaluacion Sumativa");
     label.setText("Base de Datos");
    boton.setText("Conectar");
    boton2.setText("Desconectar");
    panel.setBackground(Color.BLUE);
     //Paso 16 - agregamos Escuchadores al boton
     boton.addActionListener(new ActionListener()
     {
        private Object con;
         public void actionPerformed(ActionEvent evt)
         {
          con = new ConexionBD();
          Connection reg = con.conectar();
         }
     });
     
       boton2.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent evt)
         {
          con.desconectar();
         }
     });
 }
     
 }
   
   
   
   
   }
    
}
