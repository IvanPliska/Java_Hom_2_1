public class MainQA38 {

    public static void main(String[] args) {

        int priseTicket = 3500; // стоимость билета
        int bonusPrice = 20; // стоимость одной мили
        int numberOfMiles = priseTicket / bonusPrice; // количество милей

        System.out.println("Стоимость билета: " + priseTicket + " рублей");
        System.out.println("Количество бонусных милей: " + numberOfMiles);
    }
}