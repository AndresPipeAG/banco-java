
package Cuenta_banco;

import java.util.ArrayList;

public class Banco {

    ArrayList<CuentaBanco> cuentas;
    
    public Banco(){
        this.cuentas = new ArrayList<>();
    }

    public CuentaBanco buscarCuenta(String numero){

        for(CuentaBanco cuenta : this.cuentas){
            if(numero.equals(cuenta.getNumero())){
                return cuenta;
            }
        }
        return null;
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo) {
        if(this.buscarCuenta(numero) != null){
            return false;
        }else {
            CuentaBanco cuenta = new CuentaBanco(tipo, numero, saldoInicial); //CuentaBanco -> Es el tipo de dato. cuenta -> Es el nombre del objeto. new CuentaBanco() -> Es el constructor.
            cuentas.add(cuenta);
            return true;
        }
    }

    public double consultarTotalDinero(){

        double total = 0;

        for (CuentaBanco cuenta : this.cuentas){
            total += cuenta.getSaldo();
        }
        return total;
    }


}
