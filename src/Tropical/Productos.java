package Tropical;

import static Tropical.Empleados.BuscarEmpleado;
import static Tropical.Usuarios.ListaUsuarios;
import static Tropical.Usuarios.sc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Productos {

    public static Scanner sc = new Scanner(System.in);

    public static List<Productos> ListaProductos = new ArrayList<>();

    int id;
    String nombre;
    int cantidad;
    double precio;
    String Descripcion;

    public Productos(int id, String nombre,int cantidad, double precio, String Descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.Descripcion = Descripcion;

    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Productos.sc = sc;
    }

    public static List<Productos> getListaProductos() {
        return ListaProductos;
    }

    public static void setListaProductos(List<Productos> ListaProductos) {
        Productos.ListaProductos = ListaProductos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public static Productos BuscarProductos() {

        System.out.println("Ingrese el nombre del producto");
        String buscado = sc.next();

        for (Productos ListaProducto : ListaProductos) {

            if (buscado.equalsIgnoreCase(ListaProducto.nombre)) {

                return ListaProducto;

            } else {

                System.out.println("no se encontro");
            }

            return null;

        }

        return null;

    }

    public static void ImprimirUnProducto() {

        System.out.println("Ingrese el nombre a buscar");
        String buscado = sc.next();

        for (Productos ListaProducto : ListaProductos) {

            if (buscado.equalsIgnoreCase(ListaProducto.nombre)) {

                System.out.println("------------------------------------------------------------------------");
                System.out.println("id: " + ListaProducto.id + "\n" + "nombre: " + ListaProducto.nombre +"\n" + "cantidad: " + ListaProducto.cantidad + "\n" + "Precio: " + ListaProducto.precio + "\n" + "Descripcion: " + ListaProducto.Descripcion);
                System.out.println("------------------------------------------------------------------------");

            } else {

                System.out.println("no se encontro");
            }

        }

    }

    public static void CrearProducto() {

        int id1 = (ListaProductos.size() + 1);

        System.out.println("Bienvenido a crear un producto");

        System.out.println("Ingrese el nombre");
        String nombre1 = sc.next();
        
        System.out.println("Ingrese la cantidad");
        int cantidad1 = sc.nextInt();

        System.out.println("Ingrese el precio");
        double precio1 = sc.nextDouble();

        System.out.println("Ingrese la descricion");
        String descripcion1 = sc.next();

        Productos producto = new Productos(id1, nombre1,cantidad1, precio1, descripcion1);

        ListaProductos.add(producto);
    }
    
    public static void editarProducto() {

        Productos producto = BuscarProductos();

        int numero = 0;

        while (numero == 0) {

            System.out.println("Ingrese la opcion que desee \n 1. Editar nombre \n 2.Editar cantidad \n 3.Editar precio  \n 4.Editar descripcion \n Salir");
            numero = sc.nextInt();

            if (numero == 1) {
                System.out.println("ingrese el nombre a editar");
                String nombre1 = sc.next();

                producto.nombre = nombre1;

            }
            if (numero == 2) {
                System.out.println("ingrese la cantidad a editar");
                int cantidad1 = sc.nextInt();

                producto.cantidad = cantidad1;

            }

            if (numero == 3) {
                System.out.println("ingrese el precio a editar");
                double precio1 = sc.nextDouble();

                producto.precio = precio1;

            }

            if (numero == 4) {
                System.out.println("ingrese la descripcion a editar");
                String descripcion1 = sc.next();

                producto.Descripcion = descripcion1;

            }

        }

    }

}
