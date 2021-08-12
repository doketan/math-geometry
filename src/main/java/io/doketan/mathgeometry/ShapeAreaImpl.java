package io.doketan.mathgeometry;

public class ShapeAreaImpl implements ShapeArea{
    @Override
    public Double getSquareArea(Double length) {
        return length*length;
    }

    @Override
    public Double getRectangleArea(Double length, Double height) {
        return length*height;
    }

    @Override
    public Double getTriangleArea(Double a, Double b, Double c) {
        Double semiPerimeter = (a+b+c)/2;
        Double sa = semiPerimeter-a;
        Double sb = semiPerimeter-b;
        Double sc = semiPerimeter-c;
        return Math.sqrt(semiPerimeter*sa*sb*sc);
    }

    @Override
    public Double getCircleArea(Double radius) {
        return Math.PI*radius*radius;
    }
}
