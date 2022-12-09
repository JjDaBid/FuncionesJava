package funciones.funciones;


public class Funciones {

    public static void main(String[] args) {
    
        
    //Crear un objeto miCoche en el main y añadirle una puerta.
    //Mostrar el número de puertas que tiene el objeto.

    Coche miCoche = new Coche();
    miCoche.aumentarPuertas();
    miCoche.aumentarPuertas();
    miCoche.aumentarPuertas();
    System.out.println("el numero de puertas de mic oche es: " + miCoche.puertas);
        
        
    //Crear una función con tres parámetros que sean números que se suman entre sí.
    //Llamar a la función en el main y darle valores.

    int resultado = suma(5, 4, 20);        
        System.out.println(resultado); 
    }
        
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
   
}

    //Crear una clase coche.
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    //Una función que incremente el número de puertas que tiene el coche.
    
class Coche{
    public int puertas = 2;
    
    public void aumentarPuertas(){
        puertas = puertas + 1;
    }
}