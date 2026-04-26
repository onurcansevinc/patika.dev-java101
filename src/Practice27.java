/*
Boxing Match Simulation

Write a Java program that simulates a boxing match by using classes.
The fighter who starts the match is chosen with a 50% probability.
*/
public class Practice27 {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);

        Ring ring = new Ring(marc, alex, 90, 100);
        ring.run();
    }
}

class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " hit " + foe.name + " for " + this.damage + " damage.");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodged the incoming damage.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}

class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (!checkWeight()) {
            System.out.println("The fighters' weights do not match the category.");
            return;
        }

        boolean isF1Starting = Math.random() < 0.5;
        System.out.println("First fighter to start: " + (isF1Starting ? f1.name : f2.name));

        while (f1.health > 0 && f2.health > 0) {
            System.out.println("======== NEW ROUND ========");

            if (isF1Starting) {
                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }

                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
            } else {
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }

                f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
            }

            printScore();
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight)
                && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Winner: " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaining Health: " + f1.health);
        System.out.println(f2.name + " Remaining Health: " + f2.health);
    }
}
