package Cuenta_banco;

//tipos de datos nativos: int, double, float, char, boolean
//Tipos de datos refrerenciados: clases, interfaces, arreglos

public class Main {
    public static void main(String[] args) {
        int valor = 100000;
        CuentaBanco cuenta = new CuentaBanco(); //Primero va el tipo de dato(Clase). Luego el nombre del objeto y por último el constructor.
        System.out.println(cuenta.consultarSaldo());
        cuenta.consignar(valor);
        System.out.println(cuenta.consultarSaldo());

        boolean pudoRetirar = cuenta.retirar(50000.5);
        if (pudoRetirar) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("No se pudo retirar");
        }
        System.out.println(cuenta.consultarSaldo());
    }
}
