package Cuenta_banco;

public class CuentaBanco {

        String numero;
        Double saldo=0.0;
        String tipo;

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
