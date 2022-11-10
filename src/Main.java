public class Main {
    public static void main(String[] args) {

        int account = 50; // сумма на счете
        int replenishment = 1000; // сумма пополнения
        int bonus; // количество начисленных бонусов

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        }
        else {
            bonus = 0;
        }
        int balanceaccount = bonus + account + replenishment;
        System.out.println("Ваш баланс пополнен с учетом бонусов: Кол-во бонусов :" + bonus + "р. Сумма пополнения:"  + replenishment + "р. Общая сумма пополнения с учетом бонусов:"  + balanceaccount + "р.");
    }
}

