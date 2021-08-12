package io.doketan.mathgeometry;

/**
 * Creating instance for shapeArea
 */
public class ShapeAreaFactory {
    private ShapeAreaFactory(){
    }

    public static ShapeArea createShapeArea(){
        return new ShapeAreaImpl();
    }
}
