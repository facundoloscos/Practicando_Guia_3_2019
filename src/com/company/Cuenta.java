package com.company;

public class Cuenta {
    //Atributos
    private int idCuenta;
    private int balance;
    private Cliente clientin;

    //Metodos

    public Cuenta(int idCuenta, int balance, Cliente clientin) {
        this.idCuenta = idCuenta;
        this.balance = balance;
        this.clientin = clientin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositar (int depo){
        balance += depo;
    }

    public void extraer (int extraccion){
        if ((balance - extraccion) < -2000){
            System.out.println("No le alcanza el dinero en su cuenta");
        }else{
            if (((balance - extraccion) < 0) && ((balance - extraccion) > -2000)){
                balance -= extraccion;
                System.out.println("Se le permitio extraer dinero, pero tiene un saldo deudor de: $"+balance);
            }else{
                balance -= extraccion;
            }
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "idCuenta=" + idCuenta +
                ", balance=" + balance +
                ", clientin=" + clientin +
                '}';
    }
}
