
package Tropical;

import static Tropical.Productos.ListaProductos;
import static Tropical.Productos.sc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ventas {
    
     public static Scanner sc = new Scanner(System.in);

    public static List<Ventas> ListaVentas = new ArrayList<>();

    int idVenta;
    int idUsuario;
    int idProducto;
    String nombreUsuario;
    String nombreProducto;
    double PrecioProductos;

    public Ventas(int idVenta, int idUsuario, int idProducto, String nombreUsuario, String nombreProducto, double PrecioProductos) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.nombreUsuario = nombreUsuario;
        this.nombreProducto = nombreProducto;
        this.PrecioProductos = PrecioProductos;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Ventas.sc = sc;
    }

    public static List<Ventas> getListaVentas() {
        return ListaVentas;
    }

    public static void setListaVentas(List<Ventas> ListaVentas) {
        Ventas.ListaVentas = ListaVentas;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProductos() {
        return PrecioProductos;
    }

    public void setPrecioProductos(double PrecioProductos) {
        this.PrecioProductos = PrecioProductos;
    }
    
    
    

   public static Ventas BuscarVenta() {

        System.out.println("Ingrese el nombre de Usuario asocido a la venta");
        String buscado = sc.next();

        for (Ventas ListaVenta : ListaVentas) {

            if (buscado.equalsIgnoreCase(ListaVenta.nombreUsuario)) {

                return ListaVenta;

            } else {

                System.out.println("no se encontro la venta");
            }

            return null;

        }

        return null;

    }

    public static void ImprimirUnaventa() {

        System.out.println("Ingrese el nombre de Usuario asociado a la venta");
        String buscado = sc.next();

        for (Ventas ListaVenta : ListaVentas) {

            if (buscado.equalsIgnoreCase(ListaVenta.nombreUsuario)) {

                System.out.println("------------------------------------------------------------------------");
                System.out.println("id de Venta: " + ListaVenta.idVenta + "\n" + "id de Usuario: " + ListaVenta.idUsuario +"\n" + "id Producto: " + ListaVenta.idProducto + "\n" + "Nombre de Usuario: " + ListaVenta.nombreUsuario + "\n" + "Nombre de Producto: " + ListaVenta.nombreProducto + "\n" + "Precio Productos: " + ListaVenta.PrecioProductos );
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
