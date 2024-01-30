public class rectangle extends shapes {

    //attribute
    private int width;
    private int length;
    //attribute

    //constructor
    public rectangle(String color, boolean isFilled, int width, int length) throws IllegalArgumentException{
        super(color, isFilled);
        if(length>0 && width>0){

            this.width = width;
            this.length = length;
        }else{
            throw new IllegalArgumentException("length or width is negative");
        }

    }
    //constructor

    @Override
    public double getArea(){
        return this.length*this.width;
    }
    @Override
    public double getPerimeter(){
        return 2*this.length + 2*this.width;
    }
}
