public class square extends shapes{

    //attribute
    private int length;
    //attribute

    //constructor
    public square(String color, boolean isFilled, int length) {
        super(color, isFilled);
        if (length>0){
            this.length = length;
        }else {
            throw new IllegalArgumentException("length is negative");
        }

    }
    //constructor

    @Override
    public double getArea(){
        return this.length*this.length;
    }
    @Override
    public double getPerimeter(){
        return 4*this.length;
    }
}
