package org.example.triangle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleWithSideLengths3And4And5ShouldBeScalene() {
        Triangle triangle = new Triangle(3, 4, 5);

        boolean result = triangle.isScalene();

        assertTrue(result, "Triangle with side lengths 3, 4 and 5 is scalene");
    }


    @Test
    void triangleWithSideLengths3And3And5ShouldNotBeScalene() {
        //Arrange
        Triangle triangle = new Triangle(new double[]{3, 3, 5});

        // Act
        boolean result = triangle.isScalene();

        //Assert
        assertFalse(result, "Triangle with side lengths 3, 3 and 5 is not scalene");
    }

    @Test
    @DisplayName("Triangle with corners at (0,0) (0,1) and (1,0) should be isosceles")
    void triangleWithSides1And1AndSqrt2ShouldBeIsosceles() {
        Triangle triangle = new Triangle(new Point(0,0), new Point(0,1), new Point(1,0));

        boolean result = triangle.isIsosceles();

        assertTrue(result, "Triangle with side lengths 1, 1 and sqrt(2) is isosceles");
    }

    @Test
    @DisplayName("Triangle with corners at (0,0), (4,0) and (2,8) is isosceles")
    void triangleWithSideLengths6ForEachSideShouldBeIsosceles(){
        Triangle triangle = new Triangle(new Point[]{new Point(1,1),new Point(5,1), new Point(3,9)});

        boolean result = triangle.isIsosceles();

        assertTrue(result,"Triangle with side lengths 4, 2*sqrt(15) and 2*sqrt(15) is isosceles");
    }

    @Test
    @DisplayName("Triangle with corners at (0,0), (2,2) and (2, 0) is isosceles")
    void triangleWithSideLengths2ForEachSideShouldBeIsosceles(){
        Triangle triangle = new Triangle(new Point[]{new Point(-10,-1),new Point(2,0), new Point(2,1)});

        boolean result = triangle.isScalene();

        assertTrue(result,"Triangle with side lengths 4, 2*sqrt(15) and 2*sqrt(15) is isosceles");
    }


    @Test
    void aTriangleWithThreeEqualSidesIsAnEquilateral() {
        Triangle triangle = new Triangle(2.0, 2.0, 2.0);

        boolean isEquilateral = triangle.isEquilateral();

        assertTrue(isEquilateral, "A triangle with equal sides is an equilateral triangle.");
    }

    @Test
    void aTriangleWithThreeEqualSidesIsNotAnIsosceles() {
        Triangle triangle = new Triangle(2.0, 2.0, 2.0);

        boolean isIsosceles = triangle.isIsosceles();

        assertFalse(isIsosceles, "A triangle with equal sides is NOT an isosceles triangle.");
    }

    @Test
    void triangleWithSideLengths3And3And5ShouldNotBeEquilateral() {
        Triangle triangle = new Triangle(new double[]{3, 3, 5});

        boolean result = triangle.isEquilateral();

        assertFalse(result, "Triangle with side lengths 3, 3 and 5 is not equilateral");
    }

}