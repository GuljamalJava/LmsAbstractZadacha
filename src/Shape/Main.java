package Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// todo public abstract double getPerimeter()  деген абстракт методун  Shape деген класска кошунуз.
//     Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.



        Shape rectangle = new Rectangle("red",3.4,4.3);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());

        Shape triangle = new Triangle("yellow",3,4,3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());

        Shape square = new Square("blue",7);
        System.out.println(square);
        System.out.println(square.getPerimeter());

        Shape circle = new Circle("pink",9);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());


    }
}