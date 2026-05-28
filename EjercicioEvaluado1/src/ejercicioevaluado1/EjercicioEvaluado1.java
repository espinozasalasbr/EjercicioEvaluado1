/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioevaluado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class EjercicioEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom="", ape="";
        double sal=0, salfinal=0, dedugob=0, sem=0, ivm=0, dedugenerales=0, aso=0;
        nom=JOptionPane.showInputDialog("Ingrese su nombre: ");
        ape=JOptionPane.showInputDialog("Ingrese su apellido: ");
        sal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        salfinal=+sal;

        if(sal>=2373000){
            salfinal=sal*0.80;
            dedugob=sal*0.20;
        }
        if (sal<2373000 && sal>=1352000){
            salfinal=sal*0.85;
            dedugob=sal*0.15;
        }
        if (sal<1352000 && sal>=922000){
            salfinal=sal*0.90;
            dedugob=sal*0.10;
        }
        sem=sal*0.0925;
        ivm=sal*0.0508;
        dedugenerales=sem+ivm;
        salfinal=salfinal-dedugenerales;
        aso=sal*0.025;
        salfinal=salfinal-aso;
        
        JOptionPane.showMessageDialog(null, "Hola "+nom+" "+ape+". Su salario es "+sal+" despues de deducciones el salario final es de "+salfinal+"\n Las deducciones fueron IVM y SEM: "+dedugenerales+ ", Impuestos: "+dedugob+ ", Asociacion: "+aso);
        }
    }
