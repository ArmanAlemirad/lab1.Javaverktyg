package org.example.triangle;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Triangle")
class TriangleTest {

    //given when then
    //should
    //unit under test_ state_should be

    @Nested
    @DisplayName("Isosceles triangle")
    class Isosceles{
        @Test
        @DisplayName("Triangle with corners at (0,0) (0,1) and (1,0) should be isosceles")
        void triangleWith2SidesOfEqualLengthShouldBeIsosceles() {
            Triangle triangle = new Triangle(new Point(0,0), new Point(0,1), new Point(1,0));

            boolean result = triangle.isIsosceles();

            assertTrue(result, "Triangle with side lengths 1, 1 and sqrt(2) is isosceles");
        }

        @Test
        void withThreeEqualSidesIsNotAnIsosceles() {
            Triangle triangle = new Triangle(2.0, 2.0, 2.0);

            boolean isIsosceles = triangle.isIsosceles();

            assertFalse(isIsosceles, "A triangle with equal sides is NOT an isosceles triangle.");
        }

        @Test
        @DisplayName("Isosceles triangle")
        void triangleWithTwoEqualSidesShouldBeIsosceles(){
            Triangle triangle = new Triangle(new Point[]{new Point(1,1),new Point(5,1), new Point(3,9)});

            boolean result = triangle.isIsosceles();

            assertTrue(result,"Isosceles triangle should have 2 sides with equal length");
        }

    }


    @Test
    void triangleWithSideLengths3And4And5ShouldBeScalene() {
        Triangle triangle = new Triangle(3, 4, 5);

        boolean result = triangle.isScalene();

        assertTrue(result, "Triangle with side lengths 3, 4 and 5 is scalene");
    }


    @Test
    void triangleWithSideLengths3And3And5ShouldNotBeScalene() {
        Triangle triangle = new Triangle(new double[]{3, 3, 5});

        boolean result = triangle.isScalene();

        assertFalse(result, "Triangle with side lengths 3, 3 and 5 is not scalene");
    }




    @Test
    @DisplayName("Triangle with corners at (0,0), (2,2) and (2, -2) is scalene")
    void triangleWith3DifferentSidesShouldBeScalene(){
        Triangle triangle = new Triangle(new Point[]{new Point(0,0),new Point(0,2), new Point(2,-2)});

        boolean result = triangle.isScalene();
        assertTrue(result,"Triangle should have 3 different sides as Scalene");
    }


    @Test
    void aTriangleWithThreeEqualSidesIsAnEquilateral() {
        Triangle triangle = new Triangle(2.0, 2.0, 2.0);

        boolean isEquilateral = triangle.isEquilateral();

        assertTrue(isEquilateral, "A triangle with equal sides is an equilateral triangle.");
    }


    @Test
    void triangleWithSideLengths3And3And5ShouldNotBeEquilateral() {
        Triangle triangle = new Triangle(new double[]{3, 3, 5});

        boolean result = triangle.isEquilateral();

        assertFalse(result, "Triangle with side lengths 3, 3 and 5 is not equilateral");
    }

}