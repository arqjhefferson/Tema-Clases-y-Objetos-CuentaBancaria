package cuenta;


import metodos.Metodos;


import java.util.ArrayList;

import java.util.Scanner;

public class Cuenta implements Metodos {
    //objetos

    Scanner sc = new Scanner(System.in);
    ArrayList<Cuenta> list = new ArrayList<>();
    //variables
    private String nombres = " ";
    private String apellidos = " ";
    private int cedula = 0;
    private long n_cuenta = 0;
    private double saldo_cuenta = 0.0;
    private final double interes = 0.12;
    private double retiro = 0.0;
    private double acreditar = 0.0;

    //constructor vacio
    public Cuenta() {

    }

    //constructor con parametros
    public Cuenta(String nombres, String apellidos, int cedula, long n_cuenta, double saldo_cuenta, double retiro, double acreditar) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.n_cuenta = n_cuenta;
        this.saldo_cuenta = saldo_cuenta;
        this.retiro = retiro;
        this.acreditar = acreditar;
    }

    public Cuenta(String nombres, String apellidos, int cedula, long n_cuenta, double saldo_cuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.n_cuenta = n_cuenta;
        this.saldo_cuenta = saldo_cuenta;
    }


    //metodos get y set
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo_cuenta() {
        return saldo_cuenta;
    }

    public void setSaldo_cuenta(double saldo_cuenta) {
        this.saldo_cuenta = saldo_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getAcreditar() {
        return acreditar;
    }

    public void setAcreditar(double acreditar) {
        this.acreditar = acreditar;
    }
    //metodo toString()

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula=" + cedula +
                ", n_cuenta=" + n_cuenta +
                ", saldo_cuenta=" + saldo_cuenta +
                ", interes=" + interes +
                ", retiro=" + retiro +
                ", acreditar=" + acreditar +
                '}';
    }

    //implementacion de metodos de la clase Metodos
    //Metodo agregar cuentas
    @Override
    public void c_Agregar() {
        //variable de char resp
        char resp;
        //bucle do{}while();
        do {
            System.out.println("-------------------------------------------");
            System.out.println("Bienvenido a su banca Virtual");
            System.out.println("Por favor ingrese los siguientes datos");
            System.out.println("-------------------------------------------");
            System.out.println("Ingrese sus Nombres");
            nombres = sc.nextLine();
            System.out.println("Ingrese sus Apellidos");
            apellidos = sc.nextLine();
            System.out.println("Ingrese su numero de Cedula");
            cedula = sc.nextInt();
            System.out.println("El numero de su cuenta es");
            n_cuenta = sc.nextLong();
            System.out.println("Ingrese el monto de apertura de cuenta (saldo inicial)");
            saldo_cuenta = sc.nextDouble();
            //instanciamos Cuenta c
            Cuenta c = new Cuenta(nombres, apellidos, cedula, n_cuenta, saldo_cuenta);
            //Agregamos a la lista list.add(objeto de Cuenta c)
            list.add(c);
            System.out.println("Desea Generar una nueva Cuenta (s/N)");
            resp = sc.next().charAt(0);
            //cierre del bucle do{}while();
        } while (resp == 's' || resp == 'S');
        //recorremos ArrayList foreach(Cuenta cc:list);
        for (Cuenta cc : list) {
            //imprimimos el resultado println(list metodo toString);
            System.out.println(list.toString());
            System.out.println("-------------------------------------------");
        }
    }

    //metodo Leer
    @Override
    public void r_Leer(int n_cedula) {
        //recorremos ArrayList foreach(Cuenta cc:list);
        for (Cuenta cc : list) {
            //preguntamos si la cuenta existe imprime
            if (cc.getCedula() == n_cedula) {
                System.out.println("Imprimiendo detalle de la cuenta numero " + cc.getN_cuenta() + " pertenece a:");
                System.out.println("Nombres / Apellidos\t" + cc.getNombres() + " " + cc.getApellidos());
                System.out.println("Con numero de Cedu8la:\t" + cc.getCedula());
                System.out.println("Usted ha realizado un retiro de:\t" + cc.getRetiro() + "$" + " dolares Americanos");
                System.out.println("Usted ha realizado un deposito de:\t" + cc.getAcreditar() + "$" + " dolares Americanos");
                System.out.println("Su saldo actual es de:\t" + cc.saldo_cuenta + "$" + " dolares Americanos");
                //si no existe imprime cartel no existe
            } else {
                System.out.println("El numero de Cedula no Existe");
            }
        }
    }

    //metdod actualizar datos de la cuenta
    @Override
    public void u_Actualizar(int n_cedula) {
        //recorremos ArrayList foreach(Cuenta cc:list);
        for (Cuenta cc : list) {
            //preguntamos si la cuenta existe imprime
            if (cc.getCedula() == n_cedula) {
                System.out.println("Cuenta Actual, numero de Cuenta: " + cc.getN_cuenta() + " pertenece a:");
                System.out.println("Nombres / Apellidos\t" + cc.getNombres() + " " + cc.getApellidos());
                System.out.println("Con numero de Cedula:\t" + cc.getCedula());
                System.out.println("Se actualizara la cuenta: " + cc.getN_cuenta());
                System.out.println("Por favor ingrese Los nuevos Datos a Actualizar");
                sc.nextLine();
                System.out.println("Ingrese sus Nombres");
                nombres = sc.nextLine();
                cc.setNombres(nombres);
                System.out.println("Ingrese sus Apellidos");
                apellidos = sc.nextLine();
                cc.setApellidos(apellidos);
                System.out.println("Ingrese su numero de Cedula");
                cedula = sc.nextInt();
                cc.setCedula(cedula);
                System.out.println("Datos actualizados con Exito");
                System.out.println("Ahora puede ver sus cambios en la opcion 4. Imprimir estado de Cuenta");
                //si no existe imprime cartel no existe
            } else {
                System.out.println("El numero de Cedula no Existe");
            }
        }
    }
    //Metodo eliminar Cuenta Permanentemente
    @Override
    public void d_Eliminar(int n_cedula) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getCedula() == n_cedula){
                System.out.println("La cuenta del cliente numero: " + list.get(i).getN_cuenta() + " pertenece a:");
                System.out.println("Nombres / Apellidos\t" + list.get(i).getNombres() + " " + list.get(i).getApellidos());
                System.out.println("Con numero de Cedula:\t" + list.get(i).getCedula());
                System.out.println("Se ha eliminado con exito");
                list.remove(i);
            }else{
                System.out.println("El numero de Cedula no Existe");
            }
        }
    }

    @Override
    public void Depositar(long numero_de_cuenta) {
        for(Cuenta cc: list){
            if(cc.getN_cuenta() == numero_de_cuenta){
                System.out.println("La cuenta del cliente numero: " + cc.getN_cuenta() + " pertenece a:");
                System.out.println("Nombres / Apellidos\t" + cc.getNombres() + " " + cc.getApellidos());
                System.out.println("Con numero de Cedula:\t" + cc.getCedula());
                System.out.println("Su saldo Actual es de:\t" + cc.getSaldo_cuenta());
                System.out.println("Por favor ingrese el monto que desea Depositar");
                acreditar = sc.nextDouble();
                cc.setAcreditar(acreditar);
                cc.saldo_cuenta = cc.saldo_cuenta + acreditar;
                System.out.println("Su saldo Actual es:\t" + cc.getSaldo_cuenta());
                cc.saldo_cuenta = cc.saldo_cuenta + (cc.saldo_cuenta * cc.interes)/365;
                System.out.println("Su saldo Actual + Interes Diario 12% es:\t" + cc.getSaldo_cuenta());
            }else{
                System.out.println("El numero de Cuenta no Existe");
            }
        }
    }

    @Override
    public void Retirar(long numero_de_cuenta) {
        for(Cuenta cc: list){
            if(cc.getN_cuenta() == numero_de_cuenta){
                System.out.println("La cuenta del cliente numero: " + cc.getN_cuenta() + " pertenece a:");
                System.out.println("Nombres / Apellidos\t" + cc.getNombres() + " " + cc.getApellidos());
                System.out.println("Con numero de Cedula:\t" + cc.getCedula());
                System.out.println("Su saldo Actual es de:\t" + cc.getSaldo_cuenta());
                System.out.println("Por favor ingrese el monto que desea Retirar");
                retiro = sc.nextDouble();
                cc.setRetiro(retiro);
                cc.saldo_cuenta = cc.saldo_cuenta - retiro;
                System.out.println("Su saldo Actual es:\t" + cc.getSaldo_cuenta());
                cc.saldo_cuenta = cc.saldo_cuenta + (cc.saldo_cuenta * cc.interes)/365;
                System.out.println("Su saldo Actual + Interes Diario 12% es:\t" + cc.getSaldo_cuenta());
            }else{
                System.out.println("El numero de Cuenta no Existe");
            }
        }
    }
}

