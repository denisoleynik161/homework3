public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;  // текущий баланс
        int payment = 1200;  // сумма пополнения

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);  // количество бонусных рублей
        System.out.println(payment + currentBalance);   // итоговый счет баланса клиента
    }
}