public class Rectangle extends Shape {
  private double a;
  private double b;
  
  public Rectangle(){
    this.a=1;
    this.b=1;
  }
  
  private Rectangle(double a, double b){
    this.a=a;
    this.b=b;
  }
  
  public static boolean checkRectangle(double a, double b){
    if(a>0 && b>0){
          return true;
    }
    else{
          return false;
    }
  } 
      
  public static Rectangle createRectangle(double a, double b){
        if(checkRectangle(a,b)){
          return new Rectangle(a, b);
        }
        else{
          return new Rectangle(0, 0);
        }
  }
    
  public boolean ok(){
    return checkRectangle(this.a,this.b);
  }
  
  public double getA(){
    return this.a;
  }
  public double getB(){
    return this.b;
  }
   
  public double getPerimeter(){
    return (this.a+this.b)*2;
  }
  
  public double getArea(){
    double p=getPerimeter()/2;
    return this.a*this.b;
  }
    
  public boolean equals(Rectangle t){
    if(t.getA()==this.a && t.getB()==this.b){return true;}
    if(t.getA()==this.b && t.getB()==this.a){return true;}
  return false;
  }
  
  public String toString(){
    return "Rectangle has a= "+this.a+" b= "+this.b;
  }

  ///////////////////////// MAIN ////////////////////////////
  public static void main(String[] args) {
  double a=1,
         b=2;
    
    Rectangle t0 =new Rectangle();
    Rectangle t1 =createRectangle(a,b);
    Rectangle t2 =createRectangle(b,a);
    Rectangle t3 =createRectangle(1,0);
    
    //if(checkRectangle(1,2,3)){System.out.println ("Ok");}
    //else{System.out.println ("Fail");}
    //if(t1.ok()){System.out.println ("Ok");} else{System.out.println ("Fail");}
    //if(t2.ok()){System.out.println ("Ok");} else{System.out.println ("Fail");}
    //if(t3.ok()){System.out.println ("Ok");} else{System.out.println ("Fail");}
    
    System.out.println ("t0: "+t0+" "+t0.ok());
    System.out.println ("t1: "+t1+" "+t1.ok());
    System.out.println ("t2: "+t2+" "+t2.ok());
    System.out.println ("t3: "+t3+" "+t3.ok());
    
    System.out.println ("sh0 Perimeter: "+t0.getPerimeter());
    System.out.println ("sh1 Perimeter: "+t1.getPerimeter());
    System.out.println ("sh2 Perimeter: "+t2.getPerimeter());
    System.out.println ("sh0 Area: "+t0.getArea());
    System.out.println ("sh1 Area: "+t1.getArea());
    System.out.println ("sh2 Area: "+t2.getArea());
    
    if(t1.equals(t2)){System.out.println ("Rectangles t1 and t2 are match");}
    else{System.out.println ("Rectangles t1 and t2 aren't match");}
    
    if(t1.equals(t3)){System.out.println ("Rectangles t1 and t3 are match");}
    else{System.out.println ("Rectangles t1 and t3 aren't match");}
    
  }
}