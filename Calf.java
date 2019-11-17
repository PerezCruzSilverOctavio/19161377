/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calf;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Calf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null,"UNIDAD 1");
        double num1=Double.parseDouble(JOptionPane.showInputDialog("1 numero:"));
        double num2=Double.parseDouble(JOptionPane.showInputDialog("2 numero:"));
        double num3=Double.parseDouble(JOptionPane.showInputDialog("3 numero:"));
        double num4=Double.parseDouble(JOptionPane.showInputDialog("4 numero:"));
        
        JOptionPane.showMessageDialog(null,"UNIDAD 2");
        double num5=Double.parseDouble(JOptionPane.showInputDialog("5 numero:"));
        double num6=Double.parseDouble(JOptionPane.showInputDialog("6 numero:"));
        double num7=Double.parseDouble(JOptionPane.showInputDialog("7 numero:"));
        double num8=Double.parseDouble(JOptionPane.showInputDialog("8 numero:"));
        
        JOptionPane.showMessageDialog(null,"UNIDAD 3");
        double num9=Double.parseDouble(JOptionPane.showInputDialog("9 numero:"));
        double num10=Double.parseDouble(JOptionPane.showInputDialog("10 numero:"));
        double num11=Double.parseDouble(JOptionPane.showInputDialog("11 numero:"));
        double num12=Double.parseDouble(JOptionPane.showInputDialog("12 numero:"));
        
        JOptionPane.showMessageDialog(null,"UNIDAD 4");
        double num13=Double.parseDouble(JOptionPane.showInputDialog("13 numero:"));
        double num14=Double.parseDouble(JOptionPane.showInputDialog("14 numero:"));
        double num15=Double.parseDouble(JOptionPane.showInputDialog("15 numero:"));
        double num16=Double.parseDouble(JOptionPane.showInputDialog("16 numero:"));
        
        JOptionPane.showMessageDialog(null,"UNIDAD 5");
        double num17=Double.parseDouble(JOptionPane.showInputDialog("17 numero:"));

        double u1=0.5*num1+0.3*num2+0.1*num3+0.1*num4;
        double u2=0.4*num5+0.2*num6+0.2*num7+0.2*num8;
        double u3=0.25*num9+0.25*num10+0.25*num11+0.25*num12;
        double u4=0.3*num13+0.3*num14+0.2*num15+0.2*num16;
        double total=0.15*u1+0.15*u2+0.2*u3+0.2*u4+0.3*num17;
        
        JOptionPane.showMessageDialog(null,"Su promedio total es: "+String.format("%.2f", total));
        


    }
    
}
