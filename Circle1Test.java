
/***
* Example JUnit testing class for Circle1 (and Circle)
***/

// Import all assertions and all annotations
// - see docs for lists and descriptions
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;

// 
// Stuff you want to do before each test case
//
@BeforeEach
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
}

//
// Stuff you want to do after each test case
//
@AfterEach
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   assertTrue(p.x == 0 && p.y == 1);
}

//
// Test a simple scale increase
//
@Test
public void simpleScaleIncrease()
{
   double oldRadius = circle1.radius;
   System.out.println("Running test simpleScaleIncrease.");
   double newRadius = circle1.scale(2.0);
   assertTrue(oldRadius * 2.0 == newRadius);
}

//
// Test a simple scale decrease
//
@Test
public void simpleScaleDecrease()
{
   double oldRadius = circle1.radius;
   System.out.println("Running test simpleScaleDecrease.");
   double newRadius = circle1.scale(-2.0);
   // According to requirements if the factor is negative it shouldn't scale
   assertTrue(oldRadius == newRadius);
}

//
// Test intersection of two circles with changing x values
//
@Test
public void doesIntersectDifferentX()
{
   Circle circle2 = new Circle1(0,0,5);
   Circle circle3 = new Circle1(1,0,5);
   System.out.println("Running test doesIntersectDifferentX.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(intersects);
}

//
// Test intersection of two circles with changing x values
//
@Test
public void doesntIntersectDifferentX()
{
   Circle circle2 = new Circle1(10,0,5);
   Circle circle3 = new Circle1(0,0,5);
   System.out.println("Running test doesntIntersectDifferentX.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(!intersects);
}

//
// Test intersection of two circles with changing y values
//
@Test
public void doesIntersectDifferentY()
{
   Circle circle2 = new Circle1(0,1,5);
   Circle circle3 = new Circle1(0,0,5);
   System.out.println("Running test doesIntersectDifferentY.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(intersects);
}

//
// Test intersection of two circles with changing Y values
//
@Test
public void doesntIntersectDifferentY()
{
   Circle circle2 = new Circle1(0,10,5);
   Circle circle3 = new Circle1(0,0,5);
   System.out.println("Running test doesntIntersectDifferentY.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(!intersects);
}

//
// Test intersection of two circles with changing x and y values
//
@Test
public void doesIntersectDifferentXY()
{
   Circle circle2 = new Circle1(1,1,5);
   Circle circle3 = new Circle1(3,3,5);
   System.out.println("Running test doesIntersectDifferentXY.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(intersects);
}

//
// Test intersection of two circles with changing X and Y values
//
@Test
public void doesntIntersectDifferentXY()
{
   Circle circle2 = new Circle1(0,0,5);
   Circle circle3 = new Circle1(10,10,5);
   System.out.println("Running test doesntIntersectDifferentXY.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(!intersects);
}

//
// Test intersection of two circles with no intersections
//
@Test
public void noIntersection()
{
   Circle circle2 = new Circle1(0,3,2);
   Circle circle3 = new Circle1(20,30,12);
   System.out.println("Running test noIntersection.");
   boolean intersects = circle2.intersects(circle3);
   assertTrue(!intersects);
}

//
// Test initialization of a circle with positive values
//
@Test
public void initCirclePos()
{
   int x = 1;
   int y = 2;
   double radius = 3;
   Circle circle2 = new Circle1(x,y,radius);
   System.out.println("Running test initCirclePos.");
   assertTrue(x == circle2.center.x);
   assertTrue(y == circle2.center.y);
   assertTrue(radius == circle2.radius);
}

//
// Test initialization of a circle with negative values
//
@Test
public void initCircleNeg()
{
   int x = -1;
   int y = -2;
   double radius = -3;
   Circle circle2 = new Circle1(x,y,radius);
   System.out.println("Running test initCircleNeg.");
   assertTrue(x == circle2.center.x);
   assertTrue(y == circle2.center.y);
   assertTrue(radius == circle2.radius);
}

//
// Test initialization of a circle with positive x values and negative y values
//
@Test
public void initCirclePosXNegY()
{
   int x = 1;
   int y = -2;
   double radius = 3;
   Circle circle2 = new Circle1(x,y,radius);
   System.out.println("Running test initCirclePosXNegY.");
   assertTrue(x == circle2.center.x);
   assertTrue(y == circle2.center.y);
   assertTrue(radius == circle2.radius);
}

//
// Test initialization of a circle with negative x values and positive y values
//
@Test
public void initCircleNegXPosY()
{
   int x = -1;
   int y = 2;
   double radius = 3;
   Circle circle2 = new Circle1(x,y,radius);
   System.out.println("Running test initCircleNegXPosY.");
   assertTrue(x == circle2.center.x);
   assertTrue(y == circle2.center.y);
   assertTrue(radius == circle2.radius);
}

}

