package zodiaco;

import javax.swing.*;

import static zodiaco.Signos.*;

public class ZodiacoLogica extends Zodiaco {

    public void zodiacos(){


        switch (this.getMes()){
            case 1:
                if (this.getDia()>=21){
                    JOptionPane.showMessageDialog(null, SI1.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S12.getCc());
                }
                break;
            case 2:
                if (this.getDia()>=20){
                    JOptionPane.showMessageDialog(null, S2.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, SI1.getCc());
                }
                break;
            case 3:
                if (this.getDia()>=21){
                    JOptionPane.showMessageDialog(null, S3.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S2.getCc());
                }
                break;
            case 4:
                if (this.getDia()>=21){
                    JOptionPane.showMessageDialog(null, S4.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S3.getCc());
                }
                break;
            case 5:
                if (this.getDia()>=21){
                    JOptionPane.showMessageDialog(null, S5.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S4.getCc());
                }
                break;
            case 6:
                if (this.getDia()>=22){
                    JOptionPane.showMessageDialog(null, S6.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S5.getCc());
                }
                break;
            case 7:
                if (this.getDia()>=23){
                    JOptionPane.showMessageDialog(null, S7.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S6.getCc());
                }
                break;
            case 8:
                if (this.getDia()>=24){
                    JOptionPane.showMessageDialog(null, S8.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S7.getCc());
                }
                break;
            case 9:
                if (this.getDia()>=23){
                    JOptionPane.showMessageDialog(null, S9.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S8.getCc());
                }
                break;
            case 10:
                if (this.getDia()>=23){
                    JOptionPane.showMessageDialog(null, S10.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S9.getCc());
                }
                break;
            case 11:
                if (this.getDia()>=23){
                    JOptionPane.showMessageDialog(null, S11.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, S10.getCc());
                }
                break;
            case 12:
                if (this.getDia()>=22){
                    JOptionPane.showMessageDialog(null, S12.getCc());
                }
                else{
                    JOptionPane.showMessageDialog(null, SI1.getCc());
                }
                break;
            default:
    }
}
}