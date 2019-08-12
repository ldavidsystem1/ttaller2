package salario;

import main.Main;

import javax.swing.*;
import static constantes.Textos.*;

public class SalarioLogica extends Salario{

    public void salarios(){

        int pregunta=JOptionPane.showConfirmDialog(null,OP33.getAa(),OP34.getAa(),JOptionPane.YES_NO_CANCEL_OPTION);

        int cann=1;
        int can=0;
        double promedio=0.0;
        double mayor=0.0;

        while (pregunta==0){

            double salario=Double.parseDouble(JOptionPane.showInputDialog(null,OP32.getAa()));
            this.setSal(salario);

             can= cann+can;


            promedio=promedio+this.getSal();

            if(this.getSal()>mayor){
                mayor=this.getSal();
            }
            pregunta=JOptionPane.showConfirmDialog(null,OP33.getAa(),OP34.getAa(),JOptionPane.YES_NO_CANCEL_OPTION);
        }


        promedio = (promedio/can);

        JOptionPane.showMessageDialog(null,OP35.getAa()+mayor+"\n"+OP36.getAa()+promedio+"\n"+OP37.getAa()+can);


    }

}
