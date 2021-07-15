//Nota: Importante, esta clase les sirve como plantilla base para su reto 2, solo se hace un modelo
//de como pueden leer los datos para su reto.
import java.util.Scanner;
class Lecturadedatos {
    //Atributos
    int numRegistros;
    float [][] matrizdedatos;


    //Leer los datos de la matriz en el formato indicado
    public void leerDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de datos");
        numRegistros = Integer.parseInt(entrada.nextLine());

        matrizdedatos = new float[numRegistros][3];

        String datos;
        
        String [] datosDividos;

        for (int i=0;i<numRegistros;i++){
            System.out.println("Ingrese el dato #"+(i+1)+":");
            datos = entrada.nextLine();//num1 num2 num3
            datosDividos = datos.split(" ");

            for (int j=0;j<datosDividos.length;j++){
                matrizdedatos[i][j]=Float.parseFloat(datosDividos[j]);
                //System.out.print(datosDividos[j]+" ");
            }

        }
    }

    public void mostrarDatos(){

        for(int fila=0;fila<matrizdedatos.length;fila++){
            for(int columna=0;columna<matrizdedatos[fila].length;columna++){
                System.out.print(matrizdedatos[fila][columna]+" ");
            }
            System.out.println("");
        }

    }
    
         

}
