public class Worker extends Person {
    public Worker(String name, String surname, String patronymic, int birthYear, double salary) {
        super(name, surname, patronymic, birthYear, salary);
    }

    @Override
    protected String getPosition() {
        return "Worker";
    }
}