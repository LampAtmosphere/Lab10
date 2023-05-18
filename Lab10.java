public class Lab10 {
        public static void main(String[] args) {
            Director director = new Director("John", "Smith", "William", 1975, 5000);
            director.displayInformation();
    
            DepartmentHead head = new DepartmentHead("Mary", "Johnson", "Ann", 1985, 3000);
            head.displayInformation();
    
            Worker worker = new Worker("Tom", "Davis", "Alexander", 1995, 1500);
            worker.displayInformation();
    }
    
}
