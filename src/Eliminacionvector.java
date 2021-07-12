/* 
En este ejemplo vamos a eliminar un elemento de un vector
*/

import java.util.Scanner;
public class Eliminacionvector{
    public static void main(String [] args){
        //Creación del objeto de la clase Scanner, que nos permite crear ls inputs
        Scanner lector = new Scanner(System.in);
        //Definimos el tamaño maximo del vector
        int tamanio = 8;
        //Creando el vector con el tamño maximo definido
        int [] numeros = new int[tamanio];// 1 2 3 5 6 7 8 8

        //Lllenando el vector con datos enteeros leidos desde el teclado
        for(int ind=0;ind<tamanio;ind++){
            System.out.println("Ingrese el dato del indice "+ind);
            numeros[ind] = lector.nextInt();
        }
        //Mostramos los datos del vector
        for(int ind=0;ind<tamanio;ind++){
            System.out.println("El dato del indice "+ind+" es: "+numeros[ind]);
        }
        //Mostramos los datos del vector en una sola linea
        for(int ind=0;ind<tamanio;ind++){
            System.out.print(numeros[ind]+" ");
        }
        System.out.println("");

        System.out.println("Indique el elemento que desea eliminar:");
        int x = lector.nextInt();

        int posicionElementoaEliminar = -1;
        for(int ind=0;ind<tamanio;ind++){
            if(x == numeros[ind]){
                posicionElementoaEliminar = ind;
                break;
            }
        }

        if(posicionElementoaEliminar != -1){
            tamanio = tamanio - 1;
            for(int ind=posicionElementoaEliminar;ind<tamanio;ind++){
                numeros[ind]=numeros[ind+1];
            }

            //Mostramos los datos del vector
            for(int ind=0;ind<tamanio;ind++){
                System.out.println("El dato del indice "+ind+" es: "+numeros[ind]);
            }
            //Mostramos los datos del vector en una sola linea
            for(int ind=0;ind<tamanio;ind++){
                System.out.print(numeros[ind]+" ");
            }
        }else{
            System.out.println("El dato no fue encontrado en el vector");
        }

        



    }
}


