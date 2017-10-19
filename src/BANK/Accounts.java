package BANK;

public abstract class Accounts {
    private final long  number;//номер
    private double amount;//сумма
    private final String currency;//валюта

    public Accounts (long number,double amount,String currency){
        this.number=number;
        this.amount=amount;
        this.currency=currency;
    }
    public long getNumber(){
        return number;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
    public String getCurrency(){
        return currency;
    }
    //перевести на
    public abstract void transferTo();
    //перевести со
    public abstract void transferFrom();
    //снять
    public abstract void withdraw();
    //пополнить
    public abstract void replenish();



}
