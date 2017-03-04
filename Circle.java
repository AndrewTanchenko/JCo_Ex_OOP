public class Circle extends Shape {
  private double r;
  
  public Circle(){
    this.r=1;
  }
  
  private Circle(double r){
    this.r=r;
  }
  
  public static boolean checkCircle(double r){
    if(r>0){
          return true;
    }
    else{
          return false;
    }
  } 
      
  public static Circle createCircle(double r){
        if(checkCircle(r)){
          return new Circle(r);
        }
        else{
          return new Circle(0);
        }
  }
    
  public boolean ok(){
    return checkCircle(this.r);
  }
  
  public double getR(){
    return this.r;
  }
   
  public double getPerimeter(){
    return this.r*2*Math.acos(-1);
  }
  
  public double getArea(){
    return r*r*Math.acos(-1);
  }
    
  public boolean equals(Circle t){
    if(t.getR()==this.r){return true;}
  return false;
  }
  
  public String toString(){
    return "Circle has r= "+this.r;
  }

  ///////////////////////// MAIN ////////////////////////////
  public static void main(String[] args) {
  double r1=2,
         r2=3;
    
    Circle t0 =new Circle();
    Circle t1 =createCircle(r1);
    Circle t2 =createCircle(r2);
    Circle t3 =createCircle(-1);
    
    //if(checkCircle(1,2,3)){System.out.println ("Ok");}
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
    
    if(t1.equals(t2)){System.out.println ("Circles t1 and t2 are match");}
    else{System.out.println ("Circles t1 and t2 aren't match");}
    
    if(t1.equals(t3)){System.out.println ("Circles t1 and t3 are match");}
    else{System.out.println ("Circles t1 and t3 aren't match");}
    
  }
}