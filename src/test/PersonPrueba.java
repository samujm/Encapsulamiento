
package test;

import dominio.Persona;
// import dominio.*; Importa todas las clases de ese paquete


public class PersonPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1 = " + persona1.getNombre()); //Manda llamar el metodo get para obtener el nombre
        persona1.setNombre("Juan Carlos");
        //persona1.nombre = "Juan Carlos"; Esto ya no se puede ya que el atributo es privado
        //System.out.println("nombre" + persona1.nombre); Esto ya no se puede ya que el atributo es privado
        System.out.println("Persona1 nombre con cambio: " + persona1.getNombre());
        System.out.println("Persona1 sueldo: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado: " + persona1.isEliminado());
    }
}
