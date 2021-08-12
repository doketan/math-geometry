package io.doketan.mathgeometry;

public interface ShapeArea {

    /**
     * Return area of square, provide length
     * @param length
     * @return
     */
    Double getSquareArea(Double length);

    /**
     * Returns area of rectangle, provide length and width
     * @param length
     * @param width
     * @return
     */
    Double getRectangleArea(Double length,Double width);

    /**
     * Returns area of triangle, provide length of 3 sides
     * @param a
     * @param b
     * @param c
     * @return
     */
    Double getTriangleArea(Double a,Double b,Double c);

    /**
     * Return area of circle, provide radius
     * @param radius
     * @return
     */
    Double getCircleArea(Double radius);

}
