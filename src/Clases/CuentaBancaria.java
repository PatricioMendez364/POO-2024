//Patricio Arturo Mendez Gonzalez
//14 de abril de 2024
package Clases;


public class CuentaBancaria {
    
    private String titular;
    private int numeros;
    private String banco;
    private double saldo;
    private String historial;
    
    public CuentaBancaria(){}

    public CuentaBancaria(String titular, int numeros, String banco, double saldo, String historial) {
        this.titular = titular;
        this.numeros = numeros;
        this.banco = banco;
        this.saldo = saldo;
        this.historial = historial;
    }

    
    public String depositar(double deposito){
        return "Deposito: " + deposito + " pesos";
    }
    
    public String retirar(double retiro){
        return "retiro: " + retiro + " pesos";
    }
    
    public String transferir(double transferencia){
        return "Transfirio: " + transferencia + " pesos";
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
    
    

    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + ", numeros=" + numeros + ", banco=" + banco + ", saldo=" + saldo + ", historial=" + historial + '}';
    }
    
    
}
