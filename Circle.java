public class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
        color = "red";
        radius = 1.0;
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
