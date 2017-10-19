package BANK;

public class Clients {
    private final String name;
    private final String surname;
    private final String passport;

    public Clients(String name,String surname,String passport){
        this.name=name;
        this.surname=surname;
        this.passport=passport;
    }
    @Override
    public String toString(){
       return String.format("Клиент:\n\tИмя: %s\n\tФамилия: %s\n\tНомер паспорта: %s\n",name, surname, passport);
    }

}
