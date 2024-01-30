import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class shapesTest {

    @Test
    public void getArea() throws IllegalArgumentException{
        //fläche

        //kreis
        shapes circle1 = new circle("blue", true, 1);
        assertEquals(Math.PI, circle1.getArea(), 0.1);
        assertThrows(IllegalArgumentException.class,()-> new circle("red", false, -1));
        assertThrows(IllegalArgumentException.class,()-> new circle("red", false, 0));
        //kreis

        //rechteck
        shapes rectangle1 = new rectangle("purple", true, 4,5);
        assertEquals(20, rectangle1.getArea(),0.1);
        assertThrows(IllegalArgumentException.class,()-> new rectangle("red", false,-4,5));
        assertThrows(IllegalArgumentException.class,()-> new rectangle("red", false,0,5));
        //rechteck

        //quadrat
        shapes square1 = new square("brown", true, 5);
        assertEquals(25, square1.getArea(), 0.1);
        Exception e = assertThrows(IllegalArgumentException.class,()-> new square("white", true, -5));
        assertEquals("length is negative", e.getMessage());
        //quadrat
    }

    @Test
    public void getPerimeter() {
        //umfang

        //kreis
        shapes circle1 = new circle("blue", true, 1);
        assertEquals(6.3, circle1.getPerimeter(),0.1);
        shapes circle2 = new circle("blue", true, 5);
        assertEquals(31.4, circle2.getPerimeter(),0.1);
        //kreis

        //rechteck
        shapes rectangle1 = new rectangle("purple", true, 4,5);
        assertEquals(18, rectangle1.getPerimeter(),0.1);
        shapes rectangle2 = new rectangle("purple", true, 5,10);
        assertEquals(30, rectangle2.getPerimeter(),0.1);
        //rechteck

        //quadrat
        shapes square1 = new square("brown", true, 5);
        assertEquals(20, square1.getPerimeter(), 0.1);
        shapes square2 = new square("brown", true, 10);
        assertEquals(40, square2.getPerimeter(), 0.1);
        //quadrat
    }
}