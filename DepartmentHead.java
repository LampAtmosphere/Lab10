public class DepartmentHead extends Person {
    public DepartmentHead(String name, String surname, String patronymic, int birthYear, double salary) {
        super(name, surname, patronymic, birthYear, salary);
    }

    @Override
    protected String getPosition() {
        return "DepartmentHead";
    }
}