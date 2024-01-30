import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*
        System.out.println("hallo welt");
        List<shapes> allShapes = new ArrayList<>();
        allShapes.add(new circle("red", true, 2));
        System.out.println(allShapes.get(0).getPerimeter());
        */


        shapes circle1 = new circle("blue", true, 4);
        System.out.println("Fläche: "+circle1.getArea()+" Umfang: "+circle1.getPerimeter() );

        shapes rectangle1 = new rectangle("black", false, 5,4);
        System.out.println("Fläche: "+rectangle1.getArea()+" Umfang: "+rectangle1.getPerimeter() );

        shapes square1 = new square("white", true, 7);
        System.out.println("Fläche: "+square1.getArea()+" Umfang: "+square1.getPerimeter() );
    }
}
