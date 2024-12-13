
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //  get an object of cirle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // call the draw method
        shape1.draw();

        //  get an object of rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        // call the draw method
        shape2.draw();

        //  get an object of square and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        // call the draw method
        shape3.draw();
    }

}
