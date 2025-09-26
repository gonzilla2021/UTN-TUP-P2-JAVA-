
public class CuentaBancaria {

    String cbu;
    double saldo;
    ClaveSeguridad clave; // composición
    Titular titular;      // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.cuenta = this; // mantener la bidireccionalidad
    }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
               ", clave=" + clave + ", titular=" + titular + "}";
    }
}


