//package zapisujemy jako odwrocona nazwa domentowa (np. com.microsoft - taka jest konwencja i dzieki temu mamy
//pewnosc ze nie bedzie konfliktow w kodzie, zwlaszcza jesli sklada sie z wkladow roznych ossob/firm

package pl.sztamborski;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        Event dzienWydzialu = new Event();
        while(shouldContinue) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyświetl listę Partnerów");
            System.out.println("2. Dodaj Partnera");
            System.out.println("3. Wyświetl preferowane lunche");
            System.out.println("4. Wyszukaj po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> dzienWydzialu.displayPartners();
                case 2 -> dzienWydzialu.addPartner();
                case 3 -> dzienWydzialu.displayMeals();
                case 4 -> dzienWydzialu.displayPartnerByPhoneNumber();
                case 5 -> {
                    System.out.println("Zamykanie...");
                    shouldContinue = false;
                }
            }
        }
    }
}