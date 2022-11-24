public class Main {
    public static void main(String[] args) {
        System.out.println("Итоговый счет");
        int AvailableAmount = 1000;
        int addingAmount = 1100;
        int balanceOfUser = AvailableAmount + addingAmount;
        int NumberOfBonus;

        NumberOfBonus = (addingAmount / 100);

        System.out.println(balanceOfUser);
        System.out.println("Итоговый бонус");
        System.out.println(NumberOfBonus);


    }


}
