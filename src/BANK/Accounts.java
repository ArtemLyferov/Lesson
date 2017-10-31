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
    public abstract void transferTo(Accounts A, double amount, String currency);

    //перевести со
    public abstract void transferOut(Accounts A, double amount, String currency);

    //снять
    public abstract void withdraw(double amount, String currency);

    //пополнить
    public abstract void add(double amount, String currency);
}
