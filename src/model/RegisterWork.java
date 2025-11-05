package model;

public class RegisterWork {

    String loginPerson;
    int starkWork;
    int endWork;
    Double timeWork;
    Double salary;

    public RegisterWork()
    {
    }

    public RegisterWork(String loginPerson, int starkWork, int endWork,  Double timeWork, Double salary)
    {
        this.loginPerson = loginPerson;
        this.starkWork = starkWork;
        this.endWork = endWork;
        this.timeWork = timeWork;
        this.salary = salary;
    }
    public String getLoginPerson()
    {
        return loginPerson;
    }

    public void setLoginPerson(String loginPerson)
    {
        this.loginPerson = loginPerson;
    }

    public int getStarkWork()
    {
        return starkWork;
    }

    public void setStarkWork(int starkWork)
    {
        this.starkWork = starkWork;
    }

    public int getEndWork()
    {
        return endWork;
    }

    public void setEndWork(int endWork)
    {
        this.endWork = endWork;
    }

    public Double getTimeWork()
    {
        return timeWork;
    }

    public void setTimeWork(Double timeWork)
    {
        this.timeWork = timeWork;
    }

    public Double getSalary()
    {
        return salary;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public void loginWork(){
        System.out.println("Persoana cu logarea " + loginPerson + " este conectat");
    }

    public void setTimeStartEndToWork(){
        System.out.println("S-a conectat la ora " + starkWork);
        System.out.println("A terminat lucrul la ora " +  endWork);
    }

    public void hoursWork(){
        System.out.println("Ore lucreate azi: " + timeWork);
    }

    public void salaryGet(){
        System.out.println("Salariu pe zi: " + salary + " lei.");
    }

}
