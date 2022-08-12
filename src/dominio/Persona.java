
package dominio;

public class Persona {
    //Se crean los atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Creando constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //Definir metodos get y set 
    public String getNombre(){ //Metodo para recuperar el valor
        return this.nombre; //regresa 
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo; 
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){ //En boolean se utiliza is en lugar de get
        return this.eliminado; 
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    //metodo toString facilita imprimir el estado del objeto en cualquier momento, imprimir los valores de cada uno de los atributos que se agregen
    
    public String toString(){  //Regresa una cadena, convierte a una cadena cada uno de los atributos que tenemos en la clase
        return "Persona [ nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
}
