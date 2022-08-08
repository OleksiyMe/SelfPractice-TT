package mentorSession_BigFight;

public class MortalCombat {
    public static void main(String[] args) {

        Fighter tom = new Fighter();
        Fighter harry = new Fighter();

        tom.setInfo("Tom", 100, 20);
        harry.setInfo("Harry", 98, 17);

        declareWinner(tom, harry, "Harry");
    }

    public static void declareWinner(Fighter f1, Fighter f2, String firstPunch) {

        while (true) {

            if (f1.name.equals(firstPunch)) {

                System.out.print(f1.name + " attacks " + f2.name + "; " + f2.name + " now has "
                        + (f2.health -= f1.damagePerAttack) + " health");
                if (f2.health <= 0) break;
                else System.out.println();
                System.out.print(f2.name + " attacks " + f1.name + "; " + f1.name + " now has "
                        + (f1.health -= f2.damagePerAttack) + " health");
                if (f1.health <= 0) break;
                else System.out.println();

            } else {

                System.out.print(f2.name + " attacks " + f1.name + "; " + f1.name + " now has "
                        + (f1.health -= f2.damagePerAttack) + " health");
                if (f1.health <= 0) break;
                else System.out.println();
                System.out.print(f1.name + " attacks " + f2.name + "; " + f2.name + " now has "
                        + (f2.health -= f1.damagePerAttack) + " health");
                if (f2.health <= 0) break;
                else System.out.println();

            }
        }

        if (f1.health > f2.health)
            System.out.print(" and is dead. " + f1.name +
                    " wins.");
        else System.out.print(" and is dead. " + f2.name +
                " wins.");

    }
}

