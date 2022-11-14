import java.util.Scanner;

public class Hospital {
    private Patient[] patients = new Patient[10];
    Scanner input = new Scanner(System.in);
    int i = 0;
    private Patient newPatient(){
        input.nextLine();
        System.out.println("First name:");
        String firstName = input.nextLine();
        System.out.println("Last name:");
        String lastName= input.nextLine();
        System.out.println("Patient ID:");
        String pesel = input.nextLine();
        return patients[i] = new Patient(firstName, lastName, pesel);
    }

    void showMenu(){
        System.out.println("_______________________________________________");
        System.out.println("Registered patients: " + i);
        System.out.println("Press 0 to exit the program.");
        System.out.println("Press 1 to register new patient.");
        System.out.println("Press 2 to print patients list.");
        System.out.println("_______________________________________________");
    }

    void choice(){
        int choice = input.nextInt();
            if ((choice != 1) && (choice != 0) && (choice != 2)) {
                System.out.println("There is no such choice");
            } else if (choice == 0) {
                System.exit(0);
            } else if(choice == 1) {
                newPatient();
                i++;
            }
            else {
                printPatientInfo();
            }
    }

    private void printPatientInfo(){
        for (int a = 0; a < i; a++) {
            System.out.println("First name: " + patients[a].getFirstName() + " Last name: " + patients[a].getLastName() + " ID: " + patients[a].getPesel());
        }
    }
}
