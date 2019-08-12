package masa;


import javax.swing.*;

import static constantes.Pesos.*;
import static constantes.Textos.*;
import static constantes.Textos.OP13;

public class MasaCorporalLogica extends Masa {


    public void masas(){

        MasaCorporalLogica masaCorporalLogica = new MasaCorporalLogica();

        double peso =Double.parseDouble( JOptionPane.showInputDialog(null,OP11.getAa()));
        double estatura =Double.parseDouble( JOptionPane.showInputDialog(null,OP12.getAa()));

        masaCorporalLogica.setAltura(estatura);
        masaCorporalLogica.setPeso(peso);

        if (masaCorporalLogica.calcularMasaCorporal()<18.5){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO1.getBb());
        }
        else if (masaCorporalLogica.calcularMasaCorporal()>=18.5 && masaCorporalLogica.calcularMasaCorporal()<25){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO2.getBb());
        }
        else if (masaCorporalLogica.calcularMasaCorporal()>=25 && masaCorporalLogica.calcularMasaCorporal()<30){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO3.getBb());
        }
        else if (masaCorporalLogica.calcularMasaCorporal()>=30 && masaCorporalLogica.calcularMasaCorporal()<35){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO4.getBb());
        }
        else if (masaCorporalLogica.calcularMasaCorporal()>=35 && masaCorporalLogica.calcularMasaCorporal()<40){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO5.getBb());
        }
        else if (masaCorporalLogica.calcularMasaCorporal()>=40 && masaCorporalLogica.calcularMasaCorporal()<50){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO6.getBb());
        }
        else if (masaCorporalLogica.calcularMasaCorporal()>=50){
            JOptionPane.showMessageDialog(null, OP13.getAa()+masaCorporalLogica.calcularMasaCorporal()+"\n"+PESO7.getBb());
        }

    }


    public  double calcularMasaCorporal(){

        return (this.getPeso() / (getAltura() * getAltura()));

    }
}
