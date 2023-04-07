public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int replenishment = 100;
        int bonus = replenishment > 1000 ? replenishment / 100 : replenishment * 0;
        int finalscore = balance + replenishment + bonus;
        System.out.println("Счет: " + finalscore);
        System.out.println("Бонусные рубли: " + bonus);
    }
}