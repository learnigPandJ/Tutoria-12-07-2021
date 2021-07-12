/*
Escribir un programa Java,  que
realice las siguientes operaciones:
• Crear dos matrices de tamaño 3x3.
• Rellenar la primera con los datos: 
3, 2, 1
1, 2, 3 
2, 3, 1
• Rellenar la segunda con los datos: 
1, 1, 2
2, 1, 1
1, 2, 1.
• Mostrar el contenido de ambas matrices.
• Multiplicar la primera por la segunda y mostrar el resultado.
• Sumar la primera por la segunda y mostrar el resultado.
• Calcular la traspuesta de la primera matriz y mostrar el resultado. 
*/
import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;
public class Ejercicio1{

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];

        //Llenando la matriz1 con datos uno a uno
        System.out.println("Recolección Datos Matriz1");
        for(int fila=0;fila<matriz1.length;fila++){

            for(int col=0;col<matriz1[fila].length;col++){
                System.out.println("Ingrese el dato de la poscion ["+fila+"]"+"["+col+"]");
                matriz1[fila][col] = Integer.parseInt(entrada.nextLine());
            }
        }

        //Llenando los datos de la matriz2 -> A modo reto1
        System.out.println("Recolección Datos Matriz2");
        String [] datosDividos;
        for(int fila =0;fila<matriz2.length;fila++){

            System.out.println("Ingrese los datos de la fila  #"+(fila+1));
            String datos = entrada.nextLine();
            datosDividos =  datos.split(" ");

            for(int col=0;col<matriz2[fila].length;col++){
                matriz2[fila][col] = Integer.parseInt(datosDividos[col]);
            }

        }

        //Mostrando los datos de la matriz1
        System.out.println("Datos matriz1");
        for(int fila=0;fila<matriz1.length;fila++){

            for(int col=0;col<matriz1[fila].length;col++){
                System.out.print(matriz1[fila][col]+" ");
            }
            System.out.println("");
        }

        System.out.println("Datos matriz2");
        for(int fila=0;fila<matriz2.length;fila++){

            for(int col=0;col<matriz2[fila].length;col++){
                System.out.print(matriz2[fila][col]+" ");
            }
            System.out.println("");
        }

        //Producto o multiplicación de matrices
        if(matriz1[0].length == matriz2.length){
            System.out.println("Procedemos a hacer el calculo del producto de matrices...");
            int [][] mtProducto = new int[matriz1.length][matriz2[0].length];

            for (int fila = 0;fila<mtProducto.length;fila++){
                for(int col = 0; col<mtProducto[fila].length;col++){
                    int sumatoria = 0;
                    for (int col2 =0;col2<matriz1.length;col2++){
                        sumatoria = sumatoria + (matriz1[fila][col2] * matriz2[col2][col]);
                    }
                    mtProducto[fila][col]=sumatoria;
                }
            }

            System.out.println("Datos resultado producto de matricez");
            for(int fila=0;fila<mtProducto.length;fila++){
    
                for(int col=0;col<mtProducto[fila].length;col++){
                    System.out.print(mtProducto[fila][col]+" ");
                }
                System.out.println("");
            }

        }else{
            System.out.println("No se puede multiplicar las matrices");
        }
        



    }

}