import model.RegisterWork;

public class Main {
    public static void main(String[] args) {
        RegisterWork person1 = new RegisterWork();
        RegisterWork person2 = new RegisterWork("chidorinb", 9,23,14d,873.72);

        person1.setLoginPerson("hndorinb");
        person1.setStarkWork(9);
        person1.setEndWork(18);
        person1.setTimeWork(7D);
        person1.setSalary(730.50);

        person1.loginWork();
        person1.setTimeStartEndToWork();
        person1.hoursWork();
        person1.salaryGet();

        System.out.println();
        person2.loginWork();
        person2.setTimeStartEndToWork();
        person2.hoursWork();
        person2.salaryGet();





    }

}
