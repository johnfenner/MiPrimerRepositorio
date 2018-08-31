/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioestructura;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class EjercicioEstructura {


   
    public static void main(String[] args) {
          // MATRICES
    
    String paisCapital[][] = new String[2][3];
paisCapital[0][0] = "Colombia";
paisCapital[0][1] = "Brasil";
paisCapital[0][2] = "Argentina";

paisCapital[1][0] = "Bogota";
paisCapital[1][1] = "Brasilia";
paisCapital[1][2] = "Buenos Aires";
//JOptionPane.showMessageDialog(null, "Mi pais es: " + paisCapital[0][0] + "\n" + "y mi capital es: " + paisCapital[1][0]);

 for (int i=0;i<= paisCapital.length;i++){
            JOptionPane.showMessageDialog(null, "Mi pais es: " + paisCapital[0][i] + "\n" + "y mi capital es: " 
                    + paisCapital[1][i]);
        }

    
}
}
