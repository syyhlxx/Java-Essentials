/*
"Actually, several classes can be declared in a file with the .java extension,
 but only one of them can have the word public before the class name.
 And this is the name that must match the file name.

 "A .java file must always have a class whose name is the same as the file name,
 and that class needs to have the public modifier.

 */

public class Cats {

    public static void main(String[] args) {
        Cat fluffy = new Cat("fluffnStuff", 10, 10, 10);
        Cat muffy = new Cat("muffnStuff", 10, 10, 10);
        Cat scruffy = new Cat("scruffnStuff", 10, 10, 10);

    }
        public static class Cat {
            private String name;
            private int age;
            private int weight;
            private int strength;
            private static int catCount;

            public static int getCatCount() {
                //write your code here
                return catCount;

            }

            public static void setCatCount(int catCount) {
                //write your code here
                catCount = catCount;

            }
            public Cat(String name, int age, int weight, int strength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }
        }
    }



/*

Cat cat = new Cat();

Reader reader = new BufferedReader(new InputStreamReader(System.in));

InputStream is = new FileInputStream(path);

class Cat {                                 Name is an instance variable. It has a public access modifier,
                                            making it visible anywhere in the project.
    public String name;

    public String getName() {               The getName method is a getter. It returns the value of the instance
       return name;                         variable name. The method's name was derived from the word 'get' plus the
                                            variable's name with an uppercase first letter.
    }

    public void setName(String name) {      The setName method is a setter. It is used to assign a new value to instance
       this.name = name;                    variable name. The method's name was derived from the word 'set' plus the
                                            variable's name with an uppercase first letter. In this method,
                                            the parameter has the same name as the instance variable, so we precede the
                                            name of the instance variable with this.

    }
}


new Cat();
Create a Cat object
2
Cat catOscar = new Cat();
Store a Cat object in the variable catOscar
3
catOscar.name = "Oscar";
catOscar.age = 6;
catOscar.weight = 4;
Fill the object with data: name, age, weight
4
catOscar.sleep();
Call a method on the object
5
catOscar.fight(catSmudge);
Make the objects interact.
 */

