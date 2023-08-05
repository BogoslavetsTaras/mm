package lessons11collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main ( String[] args ) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String[] stringArr = {"A", "B", "C"};

        for(int i = 0; i < stringArr.length; i++) {
            stringArrayList.add(stringArr[i]);
        }

        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<String>> userData = new HashMap<>();


        while(true) {
            System.out.print("Введіть ПІБ: ");
            String PIB = scanner.nextLine();
            System.out.print("Введіть місто: ");
            String city = scanner.nextLine();
            if(PIB.equalsIgnoreCase("stop") || PIB.isEmpty()) break;
            if(city.equalsIgnoreCase("stop") || city.isEmpty()) break;

            else if (userData.containsKey(city)) {
                userData.get(city).add(PIB);
            }else {
                ArrayList<String> PIBs = new ArrayList<>();
                PIBs.add(PIB);
                userData.put(city, PIBs);
            }
        }
    }
}
