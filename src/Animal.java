public class Animal {
    //Atributos - caracteristicas-Estados
    String nombre;
    float tamanio;
    String especie;
    String color;
    short edad;
    char genero;
    String sonido;
    String movimiento;
    String alimento;

    //Constructores
    public Animal(){}

    public Animal(String nom,float tam,String esp,String col,short ed,char gen, String son,String mov,String alim){
        nombre=nom;
        tamanio = tam;
        especie = esp;
        color = col;
        edad = ed;
        genero = gen;
        sonido = son;
        movimiento = mov;
        alimento = alim;
    }
    //Metodos - comportamientos
    public void comunicarse(){
        System.out.println("El Animal de especie: "+especie + "se está comunicando con el sonido: "+sonido);
    }

    public void trasladarse(){
        System.out.println("El animal de especie: "+especie +" usa el movimiento: "+movimiento +" para trasladarse");
    }

    public void alimentarse(){
        System.out.println("El animal de especie: "+especie +" se alimenta con: "+alimento );
    }

    public String informacion(){
        String info = String.format("Nombre: %s\n Tamaño: %s\n Especie: %s\n Color: %s\n Edad: %s\n Genero:. %s\n Sonido: %s \n Movimeinto: %s \n Alimento: %s ", nombre, tamanio, especie, color, edad, genero, sonido,movimiento,alimento);
        return info;

       // String cadena = "Marca: " + marca + "Modelo: " + modelo
    }
}
