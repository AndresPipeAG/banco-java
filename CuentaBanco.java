package Cuenta_banco;

public class CuentaBanco {

        String numero;
        double saldo=0.0;
        String tipo;

        public CuentaBanco(String tipo, String numero, double saldo){//Constructor
            this.numero = numero;
            this.saldo = saldo;
            this.tipo = tipo;
        }

        public CuentaBanco(String tipo, String numero){//Constructor
            this.numero = numero;
            this.tipo = tipo;
        }

        public CuentaBanco(){//Constructor
            this("Ahorros", "",0);
        }
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
