package objectandclass;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {

  private double radius;

  public CircleFromSimpleGeometricObject() {
  }

  public CircleFromSimpleGeometricObject(double radius) {
    this.radius = radius;
  }

  public CircleFromSimpleGeometricObject(double radius,
      String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  /**
   * Return radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Set a new radius
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Return area
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * Return diameter
   */
  public double getDiameter() {
    return 2 * radius;
  }

  /**
   * Return perimeter
   */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */

  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    super.getDateCreated();//这里可以不加super关键字
    System.out.println(getDateCreated());
    System.out.println(getColor());
  }

  @Override  //方法重写
  public String toString() {
    super.toString();//通过Super关键字调用父类toString方法
    return "CircleFromSimpleGeometricObject{" +
        "radius=" + radius +
        '}';

  }
}


