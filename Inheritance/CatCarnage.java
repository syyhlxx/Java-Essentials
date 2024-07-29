public class CatCarnage {

    public static class Cat {

        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
        /*
        If both cats have exactly same values.
        2) If cat1 has 2 better values and 1 worse than cat2.
        3) If cat1 has 1 better value and 2 worse than cat2.
         */

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }

    public static void main(String[] args) {

        Cat fluffy = new Cat("fluffnStuff", 12, 100, 10);
        Cat muffy = new Cat("muffnStuff", 20, 10, 101);
        Cat scruffy = new Cat("scruffnStuff", 100, 110, 1000);
        System.out.println(
                muffy.fight(fluffy) ? "muffy wins": "fluffy wins");
        System.out.println(
                scruffy.fight(fluffy) ? "scruffy wins": "fluffy wins");
    }



}

/*

The Cat class must have a fight method.
•	In the fight method, implement the mechanism for feline combat based on their weight, age, and strength in accordance with the task conditions.
•	The method should return the same value whenever the same cats fight.
•	If a certain cat1 wins over cat2, then cat2 must lose to cat1.
•	If there is a tie, then the fight method should return false.
 */