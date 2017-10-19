package BANK;

public class Debit extends Accounts{
    public Debit(long number,double amount,String currency){
        super(number, amount, currency);
    }
    //перевести на
    public void transferTo(long number,double amount,String currency){

    }
    //перевести на
    public void transferTo(long number,double amount,String currency){

    }
    //перевести со
    public void transferFrom(){

    }
    //снять
    public void withdraw(double amount,String currency){
        if(getCurrency()==currency){
            if(getAmount()>=amount) {
                setAmount(getAmount() - amount);
                System.out.println("Операция успешно проведена");
            }else{
                System.err.println("Недостаточно средств на счете");
            }
        }else {
            System.err.println("Наименование валют не совпадает");
        }

    }
    //пополнить
    public void replenish(double amount,String currency){
        if(getCurrency()==currency){
            setAmount(getAmount()+amount);
            System.out.println("Операция успешно проведена");
        }else{
            System.err.println("Наименование валют не совпадает");
        }
    }



}
