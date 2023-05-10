public class Wall {
    /*
    18. Wall Area
Write a class with the name Wall. The class needs two fields(instance variables) with name width
and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters width and height of type double and it needs to
initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods(instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width
field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the
height field. If the parameter is   0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall
     */

    double height;
    double width;
    double area;
    public Wall(){

    }
    public Wall(double height,double width){

        this.height=height;
        this.width=width;

    }
    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
        }else {
            this.height=height;
        }

    }
    public double getArea(){
        return area=(height*width);
    }

    public static void main(String[] args) {
        Wall w1=new Wall();
        Wall w2=new Wall(5,4);
        System.out.println("Area= "+w2.getArea());
        w2.setHeight(-1.5);
        System.out.println("width= "+w2.getWidth());
        System.out.println("Height= "+w2.getHeight());
        System.out.println("Area= "+w2.getArea());
    }
}
