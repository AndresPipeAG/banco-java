package Cuenta_banco;

import java.util.ArrayList;

public class CuentaBanco {

        String numero;
        double saldo=0.0;
        String tipo;
        Cliente titular;
        
        
        public CuentaBanco(String tipo, String numero, double saldo, Cliente titular){//Constructor
            this.numero = numero;
            this.saldo = saldo;
            this.tipo = tipo;
            this.titular = titular;
        }

        public CuentaBanco(String tipo, String numero){//Constructor
            this.numero = numero;
            this.tipo = tipo;
        }

        // public CuentaBanco(){//Constructor
        //     this("Ahorros", "",0);
        // }
        //Getters y Setters
        public String getNumero() {
            return numero;
        }
 
        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Cliente getTitular() {
            return titular;
        }

        public void setTitular(Cliente titular) {
            this.titular = titular;
        }
        //Métodos

        public double consultarSaldo(){
            return this.saldo;
        }

        void consignar(double cantidadConsignar){
            this.saldo += cantidadConsignar;
        }

        public boolean retirar(double cantidadRetirar){
            if (this.consultarSaldo() >= cantidadRetirar) {
                this.saldo -= cantidadRetirar;
                return true;
            } else {
                return false;
            }
        }

        
    
}
