import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Object[] options = {"Convertor de divisas","Convertir temperatura","Salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Qué querés hacer?", "Conversor de divisas",JOptionPane.DEFAULT_OPTION,
         JOptionPane.PLAIN_MESSAGE, null, options,options[0]);

         if(elige == 2){
            JOptionPane.showMessageDialog(null, "programa cerrado");
            System.exit(0);
         }
         if(elige == 0){
            
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String [] opciones = {"Soles a euros","Soles a dolares","Soles a libras", "Soles a Yen","Soles a Won"};
                String cambio = (String)JOptionPane.showInputDialog(null, "Elige una opcion:","Conversor de moneda", JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);

                String input = JOptionPane.showInputDialog(null, "ingrese cantidad de soles");
               
                double soles = 0.00;
                try {
                    soles = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Valor no valido");
                }
                if(cambio.equals("Soles a euros")){
                    double euros = soles / 3.89;
                  
                    JOptionPane.showMessageDialog(null, soles + "soles peruanos son: " + formatearDivisa.format(euros) + " euros.");
                }else if(cambio.equals("Soles a dolares")){
                    double dolares = soles / 3.79;
                    JOptionPane.showMessageDialog(null, soles + "soles peruanos son: " + formatearDivisa.format(dolares) + " dolares.");
                }else if(cambio.equals("Soles a libras")){
                    double libras = soles / 4.89;
                    JOptionPane.showMessageDialog(null, soles + "soles peruanos son: " + formatearDivisa.format(libras) + " libras."); 
                }else if(cambio.equals("Soles a Yen")){
                    double yen = soles / 0.27;
                    JOptionPane.showMessageDialog(null, soles + "soles peruanos son: " + formatearDivisa.format(yen) + " Yen.");
                }else if(cambio.equals("Soles a Won")){
                    double won = soles / 0.03;
                    JOptionPane.showMessageDialog(null, soles + "soles peruanos son: " + formatearDivisa.format(won) + " won.");
                }
                
                int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar con el programa?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null,"programa finalizado");
                }
            }
        }
        
        if(elige == 1){
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String [] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion:","Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                 double valor = 0.0;
                 try {
                    valor = Double.parseDouble(valorNominal);
                 } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Valor inválido");
                    System.exit(0);
                 }

                 double resultado = 0;
                 if(opcion == 0){
                    resultado = (valor  * 9/5)+32;
                    JOptionPane.showMessageDialog(null,valor + "grados celsius son: " + resultado + " grados fahrenheit");
                 }else if(opcion == 1){
                    resultado = (valor - 32)*5/9;
                    JOptionPane.showMessageDialog(null,valor + "grados fahrenheit son: " + resultado + " grados celsius");

                 }
                 int continuar = JOptionPane.showConfirmDialog(null,"¿desea seguir", "", JOptionPane.YES_NO_OPTION);
                 if(continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null,"programa finalizado");
                 }
            }
        }
    }
}
