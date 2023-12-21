package Tropical;

import java.util.Scanner;


public class Ejecutable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1;

        while (numero != 0) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Ingrese la opcion que desee \n 1.Menu de Usuarios \n 2.Menu de Empleados");
            numero = sc.nextInt();

            if (numero == 1) {
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu de Usuarios");

                int numero2 = 1;

                while (numero2 != 0) {

                    System.out.println("Ingrese la opcion que desee \n 1. Crear Usuario \n 2.Editar Usuario \n 3.imprimir usuario \n 0.Salir");
                    System.out.println("------------------------------------------------------------------------");
                    numero2 = sc.nextInt();

                    if (numero2 == 1) {
                        Usuarios.crearUsuario();
                    }

                    if (numero2 == 2) {
                        Usuarios.editarUsuario();

                    }
                    if (numero2 == 3) {
                        Usuarios.ImprimirUnUsuario();

                    }

                }

            }

            if (numero == 2) {

                System.out.println("------------------------------------------------------------------------");
                System.out.println("Bienvenido al menu de Empleados");

                int numero2 = 1;

                while (numero != 0) {

                    System.out.println("Ingrese la opcion que desee \n 1. Crear Empleado \n 2.Editar Empleado \n 3.imprimir Empleado \n 0.Salir");
                    System.out.println("------------------------------------------------------------------------");
                    numero = sc.nextInt();

                    if (numero2 == 1) {
                        Empleados.crearEmpleado();
                    }

                    if (numero2 == 2) {
                        Empleados.editarUsuario();

                    }
                    if (numero2 == 3) {
                        Empleados.ImprimirUnEmpleado();

                    }

                }

            }

        }

    }

}
