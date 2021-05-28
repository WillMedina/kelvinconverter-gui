/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Will
 */
public class convertidor {

    DecimalFormat f = new DecimalFormat("##.##");
    //NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
    NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
    Number numero;

    public double convertirKtoC(double k) {

        try {
            double c = k - 273.15;
            numero = format.parse(f.format(c));
            double retorno = numero.doubleValue();
            System.out.println("====================================================");
            System.out.println("Valor ingresado: " + k + " grados Kelvin");
            System.out.println("Valor convertido: " + c + " grados Centigrados");
            System.out.println("====================================================");

            return retorno;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public double convertirCtoK(double c) {
        try {
            double k = c + 273.15;
            numero = format.parse(f.format(k));
            double retorno = numero.doubleValue();
            System.out.println("====================================================");
            System.out.println("Valor ingresado: " + c + " grados Centigrados");
            System.out.println("Valor convertido: " + k + " grados Kelvin");
            System.out.println("====================================================");
            return retorno;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
