import java.sql.Date;
import java.time.LocalDate;

//Crie os atributos privados name e surname do tipo String ,
//birthDate do tipo Date, anotherCompanyOwner, Pensioner, PublicServer do tipo boolean.


public class Person {

    private String name;
    private String surname;
    private int birthint;
    private boolean PublicServer;
    private boolean anotherCompanyOwner;
    private boolean Pensioner;
    private float salary;

    public Person(String name, String surname, int birthint, boolean publicServer, boolean anotherCompanyOwner,
                  boolean pensioner) {
        this.name = name;
        this.surname = surname;
        this.birthint = birthint;
        this.anotherCompanyOwner = anotherCompanyOwner;
        Pensioner = pensioner;
        PublicServer = publicServer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthint() {
        return birthint;
    }

    public void setBirthDate(int birthint) {
        this.birthint = birthint;
    }

    public boolean isPublicServer() {
        return PublicServer;
    }

    public void setPublicServer(boolean publicServer) {
        PublicServer = publicServer;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return Pensioner;
    }

    public void setPensioner(boolean pensioner) {
        Pensioner = pensioner;
    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String fullName() {
        return name+" "+surname;
    }
    public float calculateYearlySalary() {
        return salary * 12;
    }

    public boolean isMEI() {

        LocalDate data = LocalDate.now();

        return (calculateYearlySalary() < 130000) &&
                (data.getYear() - getBirthint() > 18) &&
                isAnotherCompanyOwner() == false &&
                isPensioner() == false &&
                isPublicServer() == false;
    }



    }



