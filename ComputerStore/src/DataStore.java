import java.util.ArrayList;
import java.util.List;

public class DataStore {

public List<Computer> storageList = new ArrayList<>();

public Computer addComputer(String producer, int id){
    return new Computer(producer, id);
}

public int checkAvailability(Computer computer){
    int computerCount=0;
    if (computer == null)
        return 0;
else {
        for (int i = 0; i < storageList.size(); i++) {
            if (computer.equals(storageList.get(i)))
                computerCount++;
        }
        System.out.println("Ilość komputerów o parametrach: " + "\n" +
                computer + "\n" +
                "wynosi: " + computerCount);
        return computerCount;
    }
}

}