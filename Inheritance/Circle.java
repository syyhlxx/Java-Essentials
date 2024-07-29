/*

"Additionally, the Java language lets you write classes within classes.
This is another way to get around the above limitation.
If a public class (a class with the public modifier) is declared in a file
and has the same name as the file name, then you can declare
as many classes as you like inside this public class.
That said, these will no longer be ordinary classes.
Instead, they will be internal or nested classes.

public class Solution
{
   public class Apple
   {
   }

   public static class Pineapple
   {
   }
}

/*


public class Circle {
    public Color color;

    public Circle() {
        color = new Color();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}*/

public class Circle {

    public Color m_colorOBJ;

    public void Circle() {
        this.m_colorOBJ =  new Color();
    }

    public static void main(String[] args) {
        //Create a new instance of the circle class.
        Circle circle = new Circle();

        //OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        Circle.Color newColor = circle.new Color();
        circle.m_colorOBJ = newColor;
        circle.m_colorOBJ.setDescription("Inner class description");
        System.out.println(circle.m_colorOBJ.getDescription());
    }
    //Innerclass Color
    public class Color {
        private String description;
        public Color()
        {
            this.description ="";
        }
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
