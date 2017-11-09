package BANK.accounts;

public class Percentage extends Accounts{
    public Percentage(long number,double amount,String currency){
        super(number, amount, currency);
    }
    //перевести на
    @Override
    public void transferTo(Accounts A,double amount,String currency){
        if(getCurrency()==currency){
            if(A.getAmount()<=amount){
                setAmount(getAmount()+amount);
                A.setAmount(A.getAmount()-amount);
                System.out.println("Операция успешно проведена");
            }else {
                System.out.println("Недостаточно средств на счете");
            }
        }else{
            System.err.println("Наименование валют не совпадает");
        }
    }
    //перевести со
    @Override
    public void transferOut(Accounts A,double amount,String currency){
        if(getCurrency()==currency){
            if(getAmount()>=amount){
                setAmount(getAmount()-amount);
                A.setAmount(A.getAmount()+amount);
                System.out.println("Операция успешно проведена");
            }else {
                System.out.println("Недостаточно средств на счете");
            }
        }else{
            System.err.println("Наименование валют не совпадает");
        }
    }
    //снять
    @Override
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
    @Override
    public void add(double amount,String currency){
        if(getCurrency()==currency){
            setAmount(getAmount()+amount);
            System.out.println("Операция успешно проведена");
        }else{
            System.err.println("Наименование валют не совпадает");
        }
    }
}
