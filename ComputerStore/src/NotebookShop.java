import java.util.Scanner;

public class NotebookShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataStore dataStore = new DataStore();

        dataStore.storageList.add(dataStore.addComputer("Intel",1));
        dataStore.storageList.add(dataStore.addComputer("Intel",1));
        dataStore.storageList.add(dataStore.addComputer("Komputronik",2));
        dataStore.storageList.add(dataStore.addComputer("Nvidia",3));
        dataStore.storageList.add(dataStore.addComputer("Xkom",4));

        Computer compToFind = new Computer("Intel", 1);

        dataStore.checkAvailability(compToFind);

        System.out.println("Wszystkie dostępne komputery: ");
        for (int i = 0; i<dataStore.storageList.size(); i++){
            System.out.println(dataStore.storageList.get(i));
        }
        input.nextLine(); //linijka stopująca program przed zamknięciem żeby rezultaty były widoczne
        input.close();
    }
}