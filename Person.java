 public abstract class Person {
    private String name;
    private String surname;
    private String patronymic;
    private int birthYear;
    private double salary;

    public Person(String name, String surname, String patronymic, int birthYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    protected abstract String getPosition();

    public void displayInformation() {
        System.out.printf(
                "Name: %s %s %s\nBirth Year: %d\nSalary: %.2f\nPosition: %s\n\n",
                surname,
                name,
                patronymic,
                birthYear,
                salary,
                getPosition()
        );
    }
}
