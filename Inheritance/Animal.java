public class Animal {

    String brain;
    String heart;

    public Animal(String brain, String heart) {
        this.brain = brain;
        this.heart = heart;
    }
    public Animal() {
        System.out.println("Animal constructor executed");
    }
}

 class Cat extends Animal {
     String tail;
     public Cat(String brain, String heart, String tail) {
         super(brain, heart);
         this.tail = tail;
     }
     /*public Cat(String brain, String heart, String tail) {
         this.brain = brain;
         this.heart = heart;
         this.tail = tail;
     }*/
    public Cat() {
        System.out.println("Cat constructor executed!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}
