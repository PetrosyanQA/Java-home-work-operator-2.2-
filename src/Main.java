public class Main {
    public static void main(String[] args) {
        System.out.println("Итоговый счет");
        int amount = 1000;
        int addingAmount = 1100;
        int balance = amount + addingAmount;
        int bonus;

        if (addingAmount >= -1000) {
            bonus = (addingAmount / 100);
        } else {
            bonus = (addingAmount * 1);
        }

        System.out.println(balance);
        System.out.println("Итоговый бонус");
        System.out.println(bonus);


    }


}
