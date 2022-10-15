package opciones;

import cuenta.Cuenta;

import java.util.Scanner;

public class Opciones {
    //objetos
    Scanner sc = new Scanner(System.in);
    Cuenta cx = new Cuenta();
    //variables
    int opcion = 0;
    int cedula = 0;
    long numero_de_cuenta;

    //metodo de menu de opciones
    public void Menu(){
        do{
            System.out.println("Elije una Opcion");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Actualizar Datos de Cuenta");
            System.out.println("3. Eliminar Cuenta Cliente");
            System.out.println("4. Imprimir estado de Cuenta");
            System.out.println("5. Deposito de Dinero");
            System.out.println("6. Retiro de Dinero");
            System.out.println("7. Salir de la App");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> cx.c_Agregar();
                case 2 -> {
                    System.out.println("Actualizar Datos de Cuenta");
                    System.out.println("Ingrese el numero de Cedula");
                    cedula = sc.nextInt();
                    cx.u_Actualizar(cedula);
                }
                case 3 -> {
                    System.out.println("Eliminar Cuenta Cliente Permanentemente");
                    System.out.println("Ingrese el numero de Cedula");
                    cedula = sc.nextInt();
                    cx.d_Eliminar(cedula);
                }
                case 4 -> {
                    System.out.println("Imprimir Estado de Cuenta");
                    System.out.println("Ingrese el numero de Cedula");
                    cedula = sc.nextInt();
                    cx.r_Leer(cedula);
                }
                case 5 -> {
                    System.out.println("Deposito de Dinero");
                    System.out.println("Ingrese el numero de cuenta a Acreditar");
                    numero_de_cuenta = sc.nextLong();
                    cx.Depositar(numero_de_cuenta);
                }
                case 6 -> {
                    System.out.println("Retiro de Dinero");
                    System.out.println("Ingrese el numero de cuentar");
                    numero_de_cuenta = sc.nextLong();
                    cx.Retirar(numero_de_cuenta);
                }
                case 7 -> System.exit(0);
                default -> System.out.println("!!! Alerta Opcion Incorrepta...");
            }
        }while (opcion != 7);
    }
}
