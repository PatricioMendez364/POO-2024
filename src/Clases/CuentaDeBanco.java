//19 de abril de 2024
//Patricio Arturo Mendez Gonzalez
package Clases;

import javax.swing.JOptionPane;

public class CuentaDeBanco {
    
    private String propietario;
    private String banco;
    private double saldo;
    private int numcuenta;
    private int nip;
    
    public CuentaDeBanco(String propietario, String banco, double saldo, int numcuenta, int nip) {
        this.propietario = propietario;
        this.banco = banco;
        this.saldo = saldo;
        this.numcuenta = numcuenta;
        this.nip = nip;
    }
    
    public boolean pedirNip(int nip){
        nip = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el NIP", "Acceso", JOptionPane.DEFAULT_OPTION));
        return nip == this.nip;
    }
    
    public void consultarSaldo(){
         JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es " + saldo );
    }
    
    public void ingresarSaldo(){
        double monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a ingresar"));
        double nuevoSaldo = saldo + monto;
        JOptionPane.showMessageDialog(null, "El nuevo saldo es: " + nuevoSaldo);
        
    }
       
    public void depositar(double monto) {
    saldo = saldo + monto;
    }
    
    public void transferir(CuentaDeBanco destino) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir"));
        if (monto <= saldo) {
        int numCuentaDestino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta de destino"));
            if (numCuentaDestino == destino.getNumcuenta()) {
            saldo = saldo - monto; 
            destino.saldo = saldo + monto; 
            JOptionPane.showMessageDialog(null, "Se ha transferido " + monto + " pesos a la cuenta de " + destino.getPropietario() + " exitosamente.");
            } else {
            JOptionPane.showMessageDialog(null, "No se puede realizar la transferencia");
            }
        } else {
        JOptionPane.showMessageDialog(null, "Error al realizar la tranferencia", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void pagarCuenta(){
        String motivo = JOptionPane.showInputDialog("¿Que servicio quiere pagar?");
        double pago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto"));
        if(pago <= saldo ){
        saldo = saldo - pago;
        JOptionPane.showMessageDialog(null, "Se han pagado " + pago + " pesos a " + motivo + " exitosamente" );
    } else {
        JOptionPane.showMessageDialog(null, "No se puede realizar el pago, fondos insuficientes", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
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

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "CuentaDeBanco " + "propietario = " + propietario + ", banco = " + banco + ", saldo = " + saldo + ", numcuenta = " + numcuenta + ", nip = " + nip ;
    }
    
     
    public static void main(String[] args) {
        
        CuentaDeBanco cuenta1 = new CuentaDeBanco("Patricio", "BBVA", 200, 123456789, 8934);
        CuentaDeBanco cuenta2 = new CuentaDeBanco("Brandy", "Santander", 250, 987654321, 7298);
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opcion. \n 1. Cuenta 1 \n 2. Cuenta 2 \n 3-Salir", "Menu de acceso", JOptionPane.INFORMATION_MESSAGE));
        
                
        if(opcion == 3){
            JOptionPane.showMessageDialog(null, "¡Hasta la proxima!");
        }
        
        if(opcion == 1){
            
            if(cuenta1.pedirNip(8934)== true){  
                int movimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido. ¿Que desea hacer? \n 1.Consultar Saldo \n 2.Ingresar dinero \n 3.Transferir saldo \n 4.Pagar cuenta \n 5.Salir"));
                
                if(movimiento == 1){
                    cuenta1.consultarSaldo();
                }
                
                if(movimiento == 2){
                    cuenta1.ingresarSaldo();
                }
                
                if(movimiento == 3){
                    cuenta1.transferir(cuenta2);
                }
                
                if(movimiento == 4){
                    cuenta1.pagarCuenta();
                }
                
                if(movimiento == 5){
                    JOptionPane.showMessageDialog(null, "¡Hasta la proxima!");
                }
                
            } else {
                
                JOptionPane.showMessageDialog(null, "NIP incorrecto", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
            
            if (opcion == 2){
            
                if(cuenta2.pedirNip(7298)== true){
                int movimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido. ¿Que desea hacer? \n 1.Consultar Saldo \n 2.Ingresar dinero \n 3.Transferir saldo \n 4.Pagar cuenta \n 5.Salir"));
                
                if(movimiento == 1){
                    cuenta2.consultarSaldo();
                }
                
                if(movimiento == 2){
                    cuenta2.ingresarSaldo();
                }
                
                if(movimiento == 3){
                    cuenta2.transferir(cuenta1);
                }
                
                if(movimiento == 4){
                    cuenta2.pagarCuenta();
                }
                
                if(movimiento == 5){
                    JOptionPane.showMessageDialog(null, "¡Hasta la proxima!");
                }
                
            } else {
                    JOptionPane.showMessageDialog(null, "NIP incorrecto");
                }
                
     
        }
        
    }

}

            
                
            

