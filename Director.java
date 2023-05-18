public class Director extends Person {
        public Director(String name, String surname, String patronymic, int birthYear, double salary) {
            super(name, surname, patronymic, birthYear, salary);
        }
    
        @Override
        protected String getPosition() {
            return "Director";
        }
    }
