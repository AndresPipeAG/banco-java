package Cuenta_banco;

import java.util.ArrayList;

//tipos de datos nativos: int, double, float, char, boolean
//Tipos de datos refrerenciados: clases, interfaces, arreglos

public class Main {
    public static void main(String[] args) {
        // int valor = 100000;
        // CuentaBanco cuenta = new CuentaBanco("Ahorros", "1234-5", 100000); //Primero va el tipo de dato(Clase). Luego el nombre del objeto y por último el constructor.
        // System.out.println(cuenta.consultarSaldo());
        // cuenta.consignar(valor);
        // System.out.println(cuenta.consultarSaldo());

        // boolean pudoRetirar = cuenta.retirar(50000.5);
        // if (pudoRetirar) {
        //     System.out.println("Retiro exitoso");
        // } else {
        //     System.out.println("No se pudo retirar");
        // }
        // System.out.println(cuenta.consultarSaldo());

        CuentaBanco cuenta1 = new CuentaBanco();
        CuentaBanco cuenta2 = new CuentaBanco();
        CuentaBanco cuenta3 = new CuentaBanco();

        cuenta1 = new CuentaBanco("Ahorros", "123456-7", 100000);
        cuenta2 = new CuentaBanco("Ahorros", "123456-8");
        cuenta3 = cuenta1;

        ArrayList<CuentaBanco> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);


        // for(int i=0; i < cuentas.size(); i++){
        //     System.out.printf("Tipo cuenta: %s, numero de cuenta: %s, saldo: %.2f %n",cuentas.get(i).getTipo(),cuentas.get(i).getNumero(), cuentas.get(i).getSaldo());
        // }
        // System.out.println("");
        // for(CuentaBanco cuenta : cuentas){
        //     System.out.printf("Tipo cuenta: %s, numero de cuenta: %s, saldo: %.2f %n",cuenta.getTipo(),cuenta.getNumero(), cuenta.getSaldo());
        // }
        // System.out.println("");

        // cuentas.forEach(cuenta -> {
        //     System.out.printf("Tipo cuenta: %s, numero de cuenta: %s, saldo: %.2f %n",cuenta.getTipo(),cuenta.getNumero(), cuenta.getSaldo());
        // }); 

        //int suma = 0;
        // for(int i = 0; i <cuentas.size(); i++){
        //     suma += cuentas.get(i).getSaldo();
        // }

        // for(CuentaBanco cuenta : cuentas){
        //     suma += cuenta.getSaldo();
        // }
    
        //System.out.println("La suma de los saldos es: " + suma);
    }
}
