package Cuenta_banco;

public class CuentaBanco {
    public class Cuenta {
        String numero;
        Double saldo;
        String tipo;

        public double consultarSaldo(){
            return this.saldo;
        }

        void consignar(double cantidadConsignar){
            this.saldo += cantidadConsignar;
        }

        public double retirar(double cantidadRetirar){
            double cantidadRetirada = 0;
            if (this.consultarSaldo() >= cantidadRetirada) {
                this.saldo -= cantidadRetirada;
                cantidadRetirada = cantidadRetirar;
            } else {
                cantidadRetirada = this.saldo;
                this.saldo = 0;
                return this.consultarSaldo();
            }
            return cantidadRetirar;
        }
    }
}
