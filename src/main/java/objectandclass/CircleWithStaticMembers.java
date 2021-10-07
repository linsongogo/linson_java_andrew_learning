package objectandclass;

public class CircleWithStaticMembers {
    /**
     * The radius of the circle
     */
    double radius;

    /**
     * The number of the objects created
     */
    static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    CircleWithStaticMembers() {
        radius = 1.0;
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     */
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Return numberOfObjects
     */
    //static int getNumberOfObjects() {
        //getArea(); 静态方法不能引用实例方法
        //System.out.println(radius); 静态变量不能引用实例变量
    //    return numberOfObjects;
    //}


    public static int getNumberOfObjects() {
        return numberOfObjects;
    }



    /**
     * Return the area of this circle
     */
    double getArea() {
       // System.out.println(numberOfObjects);√
        return radius * radius * Math.PI;
    }
}

