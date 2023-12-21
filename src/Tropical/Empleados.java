package Tropical;

import java.util.ArrayList;
import java.util.List;

public class Empleados extends Usuarios {

    public static List<Empleados> ListaEmpleados = new ArrayList<>();

    String telefono;
    String direccion;

    public Empleados(String telefono, String direccion, int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static Empleados BuscarEmpleado() {

        System.out.println("Ingrese el nombre a buscar");
        String buscado = sc.next();

        for (Empleados ListaEmpleado : ListaEmpleados) {

            if (buscado.equalsIgnoreCase(ListaEmpleado.nombre)) {

                return ListaEmpleado;

            } else {

                System.out.println("no se encontro");
            }

            return null;

        }

        return null;

    }

    public static void ImprimirUnEmpleado() {

        System.out.println("Ingrese el nombre a buscar");
        String buscado = sc.next();

        for (Empleados ListaEmpleado : ListaEmpleados) {

            if (buscado.equalsIgnoreCase(ListaEmpleado.nombre)) {

                System.out.println("------------------------------------------------------------------------");
                System.out.println("id: " + ListaEmpleado.id + "\n" + "nombre: " + ListaEmpleado.nombre + "\n" + "Apellidos: " + ListaEmpleado.apellidos + "\n" + "Direccion : " + ListaEmpleado.direccion);
                System.out.println("------------------------------------------------------------------------");
            } else {

                System.out.println("no se encontro");
            }

        }

    }

    public static void crearEmpleado() {

        int id1 = (ListaEmpleados.size() + 1);
        int id2 = (ListaUsuarios.size() + 1);

        System.out.println("Bienvenido a crear un Usuario");

        System.out.println("Ingrese el nombre");
        String nombre1 = sc.next();

        System.out.println("Ingrese el apellido");
        String apellido1 = sc.next();

        System.out.println("Ingrese el Telefono");
        String telefono1 = sc.next();

        System.out.println("Ingrese la dirrecion");
        String direccion1 = sc.next();

        Empleados empleado = new Empleados(telefono1, direccion1, id1, nombre1, apellido1);

        Usuarios usuario = new Usuarios(id2, nombre1, apellido1);

        ListaUsuarios.add(usuario);
        ListaEmpleados.add(empleado);

    }

    public static void editarEmpleado() {

        Empleados persona = BuscarEmpleado();

        int numero = 0;

        while (numero == 0) {

            System.out.println("Ingrese la opcion que desee \n 1. Editar nombre \n 2.Editar Apellido \n 3.Editar telefono  \n 4.Editar Direccion \n Salir");
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

            if (numero == 3) {
                System.out.println("ingrese el telefono a editar");
                String telefono1 = sc.next();

                persona.telefono = telefono1;

            }

            if (numero == 4) {
                System.out.println("ingrese la direccion a editar");
                String direccion1 = sc.next();

                persona.direccion = direccion1;

            }

        }

    }
}
