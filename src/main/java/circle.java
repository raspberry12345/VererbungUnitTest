public class circle extends shapes{


    private int radius;

    public circle(String color, boolean isFilled, int radius) throws IllegalArgumentException{
        super(color, isFilled);
        if (radius>0){
            this.radius = radius;
        }else{
            throw new IllegalArgumentException("radius is negative");
        }
    }

    @Override
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
}
