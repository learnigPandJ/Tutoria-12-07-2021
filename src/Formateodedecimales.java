import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Formateodedecimales {
    public static void main(String [] args){
        DecimalFormatSymbols separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');//6.77777 --> 6.77

        DecimalFormat formato1 = new DecimalFormat("#.000",separador);
        DecimalFormat formato2 = new DecimalFormat("#.###",separador);

        float numero1 = 1.456789f;
        float numero2 = 5.6f;
        System.out.println("Aplicando formato al número1: "+numero1);
        System.out.println(formato1.format(numero1));
        System.out.println(formato2.format(numero1));

        System.out.println("Aplicando formato al número2: "+numero2);
        System.out.println(formato1.format(numero2));
        System.out.println(formato2.format(numero2));


    }
}
