package main;

import masa.MasaCorporalLogica;
import salario.SalarioLogica;
import vector.VectorLogica;
import zodiaco.ZodiacoLogica;

import static constantes.Textos.*;
import static constantes.Pesos.*;
import static zodiaco.Signos.*;

import javax.swing.*;

public class Main {

    public static void
      main (String[] arg){


        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, TITULO.getAa()
                +"\n"+OP1.getAa()+"\n"+OP2.getAa()+"\n"+OP3.getAa()+"\n"+OP4.getAa()+"\n"+OP5.getAa()));

        if (opcion==1){
            MasaCorporalLogica masaCorporalLogica=new MasaCorporalLogica();
            masaCorporalLogica.masas();
           Main.main(arg);
        }



         if (opcion ==2){
             ZodiacoLogica zodiacoLogica= new ZodiacoLogica();
            int dia =Integer.parseInt( JOptionPane.showInputDialog(null,OP21.getAa()));
            int mes =Integer.parseInt( JOptionPane.showInputDialog(null,OP22.getAa()));
            int ano =Integer.parseInt( JOptionPane.showInputDialog(null,OP23.getAa()));
            zodiacoLogica.setAno(ano);
            zodiacoLogica.setMes(mes);
            zodiacoLogica.setDia(dia);

            zodiacoLogica.zodiacos();
            Main.main(arg);
            }

         if(opcion==3){

             SalarioLogica salarioLogica= new SalarioLogica();
             salarioLogica.salarios();
             Main.main(arg);

         }
         if(opcion==4){

             VectorLogica vectorLogica= new VectorLogica();
             vectorLogica.vectores();
             Main.main(arg);




         }





        }
    }


