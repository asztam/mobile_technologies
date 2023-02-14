package pl.sztamborski;

import java.util.*;

public class Event {
    private List<Partner> partners = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Partner> phoneNumbers = new HashMap<>();
    private int pizza = 0;
    private int pizzaVege = 0;
    private int pancakeSavory= 0;
    private int pancakeVege = 0;
    private int pancakeSweet = 0;
    Scanner scanner = new Scanner(System.in);
    public void addPartner() {
        String name = null;
        System.out.println("Dodawanie partnera: ");
        do {
            System.out.println("Wprowadź nazwę firmy");
            name = scanner.nextLine();
            if (name.isEmpty() || name.isBlank()){
                System.out.print("\nBłąd: Wprowadzono pustą linię. Spróbuj jeszcze raz:\n");
            } else if (!name.chars().allMatch(Character::isLetter)) {
                System.out.print("\nBłąd: Wprowadź imię w postaci ciągu liter. Spróbuj jeszcze raz:\n");
            } else if (name.length() < 2 || name.length() > 30){
                System.out.print("\nBłąd: Nie ma takiej firmy. Spróbuj jeszcze raz:\n");
            } else if(name.chars().allMatch(Character::isLetter) && name.length() >= 2 && name.length() < 30){
                System.out.println("Dodano firmę o nazwie: " + name);
                break;
            } else System.out.println("Invalid input");
        } while(true);

        String meal = null;
        System.out.println("Preferowany lunch: ");
        boolean shouldContinue = true;
        while(shouldContinue) {
            System.out.println("Wybierz preferowany lunch");
            System.out.println("1. Pizza");
            System.out.println("2. Pizza wege");
            System.out.println("3. Nalesnik wytrawny");
            System.out.println("4. Nalesnik wege");
            System.out.println("5. Naleśnik słodki");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1: meal = "PIZZA"; System.out.println("Wybrano pizze"); break;
                case 2: meal = "PIZZA VEGE"; System.out.println("Wybrano wege pizze");break;
                case 3: meal = "PANCAKE SAVORY"; System.out.println("Wybrano wytrawnego nalesnika");break;
                case 4: meal = "PANCAKE VEGE"; System.out.println("Wybrano wege nalesnika");break;
                case 5: meal = "PANCAKE SWEET"; System.out.println("Wybrano slodkiego nalesnika");break;
                }
                shouldContinue = false;
            }


        String pack = null;
        System.out.println("Pakiet: ");
        boolean shouldContinue1 = true;
        while(shouldContinue1) {
            System.out.println("1. Diament");
            System.out.println("2. Zloto");
            System.out.println("3. Srebro");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1: pack =  "diamond"; System.out.println("Wybrano pakiet diamentowy"); break;
                case 2: pack = "gold"; System.out.println("Wybrano pakiet złoty"); break;
                case 3: pack = "silver"; System.out.println("Wybrano pakiet srebrny"); break;
            }
            shouldContinue1 = false;
        }

        System.out.print("Wprowadź numer telefonu:\n +48 ");

        int phoneNumber = 0;
        do {
            String input = null;
            input = scanner.nextLine();
            input = scanner.nextLine();
            if (input.isEmpty() || input.isBlank()) {
                System.out.print("\nBłąd: Wprowadzono pustą linię. Spróbuj jeszcze raz: \n +48 ");
            } else if (input.matches("[0-9]+") && input.length() == 9) {
                    phoneNumber = Integer.valueOf(input);
                    break;
            } else if (!input.matches("[0-9]+")){
                System.out.print("\nBłąd: Wprowadź numer telefonu w postaci numerycznej. Spróbuj jeszcze raz: \n +48 ");
            } else {
                System.out.print("\nBłąd: Niewłaściwa długość numeru. Spróbuj jeszcze raz: \n +48 ");
            }
        } while (true);

        System.out.println("Partner strategiczny? (Y/N)");
        String strategic = scanner.nextLine();
        boolean isStrategic = false;
        do {
            if (strategic.equals("Y")) {
                isStrategic = true;
                break;
            } else if (strategic.equals("N")) {
                isStrategic = false;
                break;
            } else {
                System.out.println("Wprowadzenie niepoprawne, spróbuj ponownie:");
                strategic = scanner.nextLine();
            }
        }
        while (!strategic.equals("Y") || !strategic.equals("N"));

        Partner partner = new Partner(name, meal, phoneNumber, pack, isStrategic);

        partners.add(partner);
        meals.add(meal);
        phoneNumbers.put(phoneNumber, partner);
    }

    public void displayMeals(){
        if(!meals.isEmpty()) {
            System.out.println("3. Lista potraw: ");
            for (String meal : meals) {
                if (meal == "PIZZA"){
                    pizza++;
                }
                else if (meal == "PIZZA VEGE"){
                    pizzaVege++;
                }
                else if (meal == "PANCAKE SAVORY"){
                    pancakeSavory++;
                }
                else if (meal == "PANCAKE VEGE"){
                    pancakeVege++;
                }
                else if (meal == "PANCAKE SWEET"){
                    pancakeSweet++;
                }
            }
            System.out.println("PIZZA X " + pizza);
            System.out.println("PIZZA VEGE X " + pizzaVege);
            System.out.println("NALEŚNIK WYTRAWNY X " + pancakeSavory);
            System.out.println("NALEŚNIK WEGE X " + pancakeVege);
            System.out.println("NALEŚNIK SŁODKI X " + pancakeSweet);
            System.out.println();
        } else {
            System.out.println("Lista potraw jest pusta.");
        }
    }

    //metoda do znajdowania uzytkownikow po numerze
    public void displayPartnerByPhoneNumber() {
        System.out.print("Wyszukiwanie po numerze telefonu, wprowadź numer:\n +48 ");
        do {
            String input = null;
            if (partners.isEmpty()) {
                System.out.println("Błąd: Lista Partnerów jest pusta.");
                break;
            } else if (!partners.isEmpty()) {
                input = scanner.nextLine();}
            if (input.isEmpty() || input.isBlank()) {
                System.out.print("\nBłąd: Wprowadzono pustą linię. Spróbuj jeszcze raz: \n +48 ");
            } else if (input.matches("[0-9]+") && input.length() == 9) {
                if (phoneNumbers.containsKey(Integer.valueOf(input))) {
                    Partner partner = phoneNumbers.get(Integer.valueOf(input));
                    partner.displayPartnerInformation();
                    break;
                } else {
                    System.out.println("Nie znaleziono wprowadzonego numeru telefonu.");
                    System.out.println();
                    break;
                }
            } else if (!input.matches("[0-9]+")){
                System.out.print("\nBłąd: Wprowadź numer telefonu w postaci numerycznej. Spróbuj jeszcze raz: \n +48 ");
            } else {
                System.out.print("\nBłąd: Niewłaściwa długość numeru. Spróbuj jeszcze raz: \n +48 ");
        }
        } while (true);
    }

    public void displayPartners() { //metoda zwracajaca liste gosci
        System.out.println("1. Lista partnerów: ");
        if (partners.isEmpty()) {
            System.out.println("Błąd : Brak partnerów na liście.");
            System.out.println();
        } else {
            for (Partner partner : partners){
                partner.displayPartnerInformation();
                System.out.println();
            }
        }
    }
}

