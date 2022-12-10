public class Main {
    public static void main(String[] args) {
        System.out.println("Итоговый счет");
        int availableAmount = 1000;
        int addingAmount = 2000;
        int balanceOfUser = availableAmount + addingAmount;
        int numberOfBonus = 0;


        if (addingAmount > 1000) {
            numberOfBonus = addingAmount / 100;
        }

        System.out.println(balanceOfUser);
        System.out.println("Итоговый бонус");
        System.out.println(numberOfBonus);
    }


}