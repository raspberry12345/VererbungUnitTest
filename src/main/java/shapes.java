public abstract class shapes {
    private String color;
    private boolean isFilled;


    public shapes(String color, boolean isFilled) {

        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public  abstract double getPerimeter();
}
