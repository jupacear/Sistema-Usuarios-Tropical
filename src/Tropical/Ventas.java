
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

    public static void CrearVenta() {

        int idVenta1 = (ListaVentas.size() + 1); //id de venta

        System.out.println("Bienvenido a crear una venta");
        
        Usuarios usuario = Usuarios.BuscarUsuario(); //
        
        Productos producto = Productos.BuscarProductos(); //
        
        double precio1 = producto.precio; // precio de producto
        
        int idproducto = producto.id; // id del producto
        
        String nombreProducto = producto.nombre;
        
        int idUsuario = usuario.id; //id de usuario
        
        String nombreUsuario = usuario.nombre;

        Ventas venta = new Ventas(idVenta1, idUsuario, idproducto, nombreUsuario, nombreProducto, precio1);
        
       ListaVentas.add(venta);
    }
    
   
    
    
    
    
}
