public class Casting {
    
    public static void main(String [] args){

        /*
        Parsing: Conversión de entre tipo de datos de diferente naturaleza
        byte, short, int, long, float, double  a String
                         o de
        String a byte, short, int, long, float, double

        Casting: Conversión de datos entre tipos de la misma naturaleza
         byte, short, int, long, float, double

         String, clases
        */

        //Aplicando Parsing
        String dato= "45";
        String dato2 = "36.8";
        int numero = Integer.parseInt(dato);
        byte numerobyte = Byte.parseByte(dato);
        short numeroshort = Short.parseShort(dato);
        long numerolong = Long.parseLong(dato);
        float numero2 = Float.parseFloat(dato2);
        double numero3 = Double.parseDouble(dato2);
        String numerostring = String.valueOf(numero);

        //Aplicando el Casting
        int num1 = 23;
        short  num2 = 100;
        float num3 = 12.5f;

        float num4 = num1;

        int num5 = (int)num3;

        int n1 = 2;
        int n2 = 5;
        float resultado = (float)n1 / (float)n2;
        System.out.println(resultado);
    }
}
