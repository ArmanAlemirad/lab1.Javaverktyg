package org.example.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TriangleTest {

@Test
void isAllPointsEqualToEachOther(){
    Triangle triangle = new Triangle(2,2,2);

    assertTrue(triangle.isEquilateral());

}

}