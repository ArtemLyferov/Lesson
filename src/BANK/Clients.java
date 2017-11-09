package BANK;

public class Clients {
    private String name;
    private String surname;
    private final String passport;

    public Clients(String name,String surname,String passport){
        setName(name);
        setSurname(surname);
        this.passport=passport;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("Имя не указано");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if(surname==null||surname.isEmpty()){
            throw new IllegalArgumentException("Фамилия не указана");
        }
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPassport() {
        return this.passport;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (obj.getClass()!=Clients.class){
            return false;
        }
        Clients other=(Clients)obj;
        return this.passport.equals(other.passport);
    }

    @Override
    public int hashCode() {
        return this.passport.hashCode();
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", passport='" + this.passport + '\'' +
                '}';
    }
}
