package objectandclass;

public class TestCircleWithPrivateDataFields {


  /**
   * Main method
   */
  public static void main(String[] args) {
    // Create a Circle with radius 5.0
    CircleWithPrivateDataFields myCircle =  new CircleWithPrivateDataFields(6.0);
    System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());

    // Increase myCircle's radius by 10%
    myCircle.setRadius(myCircle.getRadius() * 1.1);
    System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());

    CircleWithPrivateDataFields.setNumberOfObjects(7);

    System.out.println(CircleWithPrivateDataFields.getNumberOfObjects());

    myCircle.printnumberOfObjects();
  }
}
