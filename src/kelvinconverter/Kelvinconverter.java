/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelvinconverter;

/**
 *
 * @author Will
 */
import clase.*;
import gui.*;
import java.text.*;
public class Kelvinconverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        convertidor c = new convertidor();
//        double cel = c.convertirKtoC(200);
//        DecimalFormat f = new DecimalFormat("##.00");
//        System.out.println("Convirtiendo 200 grados K a C : " + f.format(cel));
        gui g = new gui();
        g.setTitle("Convertidor Kelvin y Celsius");
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }

}
