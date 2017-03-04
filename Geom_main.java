public class Geom_main{
  
public static void main(String[] args) {

  double a=1,
         b=2,
         c=2;
  int fig =3;
  
Shape sh0, sh1, sh2;
      sh0 = new Triangle();
      sh1 = new Rectangle();
      sh2 = new Circle();

switch(fig) {
    case 1: 
      sh0 = new Triangle();
      sh1 = Triangle.createTriangle(a,b,c);
      sh2 = Triangle.createTriangle(b,a,c);
      //sh2 = Triangle.createTriangle(1,2,1);
      break;
    case 2: 
      sh0 = new Rectangle();
      sh1 = Rectangle.createRectangle(a,b);
      sh2 = Rectangle.createRectangle(b,a);
      //sh2 = Rectangle.createRectangle(-1,2);
      break;
    case 3: 
      sh0 = new Circle();
      sh1 = Circle.createCircle(a);
      sh2 = Circle.createCircle(b);
      //sh2 = Circle.createCircle(-1);
      break;
}
      
System.out.println ("sh0: "+sh0);
System.out.println ("sh1: "+sh1);
System.out.println ("sh2: "+sh2);
System.out.println ("sh0 Perimeter: "+sh0.getPerimeter());
System.out.println ("sh1 Perimeter: "+sh1.getPerimeter());
System.out.println ("sh2 Perimeter: "+sh2.getPerimeter());
System.out.println ("sh0 Area: "+sh0.getArea());
System.out.println ("sh1 Area: "+sh1.getArea());
System.out.println ("sh2 Area: "+sh2.getArea());
//System.out.println ("sh getA: "+((Triangle)sh1).getA());

//if(((Triangle)sh1).equals((Triangle)sh2)){System.out.println ("sh1 and sh2 are match");}
// else{System.out.println ("sh1 and sh2 not match");}



}
}
