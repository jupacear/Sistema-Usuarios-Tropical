
package Tropical;

import java.util.ArrayList;
import java.util.List;


public class Usuarios {
    
    public static List<Usuarios> ListaUsuarios = new ArrayList<>();
    
    int id;
    String nombre;
    String apellido;
    
    public Usuarios(int id,String nombre,String apellido){
    
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    
    }
    
    
    
    
}
