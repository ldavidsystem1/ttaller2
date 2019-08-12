package vector;

import javax.swing.*;

import static constantes.Textos.*;

public class VectorLogica extends Vector {

    public void vectores() {

        int pregunta = Integer.parseInt(JOptionPane.showInputDialog(null, OP41.getAa()));
        this.setNumero(pregunta);

        int canma = 0;
        int canme = 0;
        double promma = 0.0;
        double promme = 0.0;
        double[ ] vma = new double[pregunta];
        double[ ] vme= new double[pregunta];

        while (pregunta > 0) {
            pregunta--;

            double num = Double.parseDouble(JOptionPane.showInputDialog(null, OP42.getAa()));
            this.setNumero(num);

            if (num == 0) {

                canma++;

            } else if (num > 0) {
                canma++;
                promma=promma+num;

                vma[canma] = num;

            }
            else if (num<0){
                canme++;
                promme=promme+num;
                vme[canma] = num;
            }


        }
        promma = (promma/canma);
        promme = (promme/canme);

        JOptionPane.showMessageDialog(null,OP43.getAa()+promma+"\n"+OP44.getAa()+promme+"\n");


    }

}
