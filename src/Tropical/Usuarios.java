package Tropical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {

    public static Scanner sc = new Scanner(System.in);

    public static List<Usuarios> ListaUsuarios = new ArrayList<>();

    int id;
    String nombre;
    String apellidos;

    public Usuarios(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public static List<Usuarios> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(List<Usuarios> ListaUsuarios) {
        Usuarios.ListaUsuarios = ListaUsuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static Usuarios BuscarUsuario() {

        System.out.println("Ingrese el nombre a buscar");
        String buscado = sc.next();

        for (Usuarios ListaUsuario : ListaUsuarios) {

            if (buscado.equalsIgnoreCase(ListaUsuario.nombre)) {

                return ListaUsuario;

            } else {

                System.out.println("no se encontro");
            }

            return null;

        }

        return null;

    }

    public static void ImprimirUnUsuario() {

        System.out.println("Ingrese el nombre a buscar");
        String buscado = sc.next();

        for (Usuarios ListaUsuario : ListaUsuarios) {

            if (buscado.equalsIgnoreCase(ListaUsuario.nombre)) {

                System.out.println("------------------------------------------------------------------------");
                System.out.println("id: " + ListaUsuario.id + "\n" + "nombre: " + ListaUsuario.nombre + "\n" + "Apellidos: " + ListaUsuario.apellidos);
                System.out.println("------------------------------------------------------------------------");

            } else {

                System.out.println("no se encontro");
            }

        }

    }

    public static void crearUsuario() {

        int id1 = (ListaUsuarios.size() + 1);

        System.out.println("Bienvenido a crear un Usuario");

        System.out.println("Ingrese el nombre");
        String nombre1 = sc.next();

        System.out.println("Ingrese el apellido");
        String apellido1 = sc.next();

        Usuarios usuario = new Usuarios(id1, nombre1, apellido1);

        ListaUsuarios.add(usuario);

    }

    public static void editarUsuario() {

        Usuarios persona = BuscarUsuario();

        int numero = 0;

        while (numero == 0) {

            System.out.println("Ingrese laopcion que desee \n 1. Editar nombre \n 2.Editar Apellido \n Salir");
            numero = sc.nextInt();

            if (numero == 1) {

                System.out.println("ingrese el nombre a editar");
                String nombre1 = sc.next();

                persona.nombre = nombre1;

            }
            if (numero == 2) {
                System.out.println("ingrese el apellido a editar");
                String apellido1 = sc.next();

                persona.apellidos = apellido1;

            }

        }

    }

}
