class Circle {

    double radius;

    public double getLength(){
        double circumference =  2*(Math.PI * radius);
        return circumference;
    }

    public double getArea(){
        double Area = Math.PI * (radius * radius);
        return Area;
    }

}