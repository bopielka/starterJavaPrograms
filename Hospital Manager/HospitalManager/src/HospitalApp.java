public class HospitalApp {
    public static void main(String[] args) {
        Hospital hosp = new Hospital();

        while (hosp.i<10) {
            hosp.showMenu();
            hosp.choice();
    }
    }
}
