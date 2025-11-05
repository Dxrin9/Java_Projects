import model.RegisterWork;

public class Main {
    public static void main(String[] args) {
        RegisterWork person1 = new RegisterWork();

        person1.setLoginPerson("hndorinb");
        person1.setStarkWork(9);
        person1.setEndWork(18);
        person1.setTimeWork(7D);
        person1.setSalary(730.50);

        person1.loginWork();
        person1.setTimeStartEndToWork();
        person1.hoursWork();
        person1.salaryGet();



    }

}
