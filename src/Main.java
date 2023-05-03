
public class Main {
    public static int bossHealth = 700;

    public static int bossDamage = 50;
    public static int[] heroesHealth = {100, 270, 260, 250};
    public static int[] heroesDamage = {30, 25, 20, 15,};
    public static String[] heroesAttackType = {"tirpila", "Physical", "Magical", "Telepathic"};
    public static String bossDefenceType;

    public static void main(String[] args) {
        printStatistics();
    }

    public static void printStatistics() {
        System.out.println("----------------");
        System.out.println("Boss health: " + bossHealth +
                "{" + bossDamage + "}");
        for (int i = 0; i < heroesAttackType.length; i++) {
            if (i == 0) {
                continue;
            } else {
                System.out.println("Hero: " + heroesAttackType[i] + " " + heroesHealth[0] +
                        "{" + heroesDamage[i] + "}");
            }
        }
    }
}
