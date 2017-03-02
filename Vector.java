// Javacore / Tanchenko A.
// updated 02Mar17

import java.util.Arrays;

class Vector {
  
    private double x;
    private double y;
    private double[] v = {x,y};
  
  public Vector(){ 
    this.x=0;
    this.y=0;
    this.v[0]=0;
    this.v[1]=0;
  }
  
  public Vector(double x, double y){ 
    this.x=x;
    this.y=y;
    this.v[0]=x;
    this.v[1]=y;
  }
  
  public static Vector[] CreateVectorArray(int num){ 
    Vector[] arrV = new Vector[num];
    for(int i=0; i<=num-1;i++){
      arrV[i] = new Vector();
    }
  return arrV;
  }
    
  public static void printVector(Vector a){
    double[] v_ = new double[2];
    v_[0]=a.getX();
    v_[1]=a.getY();
    System.out.println(Arrays.toString(v_));
  }
  
  public String toString(){
    return Arrays.toString(this.v);
  }
  
  public void setXY(double x, double y){
    this.v[0]=x;
    this.v[1]=y;
  }
  public void setX(double x){
    this.v[0]=x;
  }
  public void setY(double y){
    this.v[1]=y;
  }
  
  public double getX(){
  return this.v[0];
  }
  public double getY(){
  return this.v[1];
  }
  
  public double length(){
  return (double)(Math.sqrt(v[0]*v[0]+v[1]*v[1]));
  }
  
  public Vector add(Vector a){
  return new Vector(v[0]+a.getX(),v[1]+a.getY());
  }
  
  public Vector sub(Vector a){
  return new Vector(v[0]-a.getX(),v[1]-a.getY());
  }
        
  public Vector constMult(double c){
  return new Vector(getX()*c,getY()*c);
  }
  
  public static double scalarMult(Vector a,Vector b){
  return (double)(a.getX()*b.getX()+a.getY()*b.getY());
  }
  
  public static boolean isCollinear(Vector a,Vector b){
    boolean ans_=false;
    if((float)(a.getX())/b.getX()==(float)(a.getY())/b.getY()){
      ans_=true;
    }
  return ans_;
  }
  
  public static boolean isOrtogonal(Vector a,Vector b){
    boolean ans_=false;
    if(scalarMult(a,b)==0){
      ans_=true;
    }
  return ans_;
  }

//////////////////////////////////////////////////////
  
  public static void main(String[] args) {
    
    Vector a0 = new Vector();
    Vector a = new Vector(1,0);
    Vector b = new Vector(0,4);
    
    Vector[] arrV = new Vector[2];
    arrV = CreateVectorArray(2);
    //Vector[] arrV = {a,b};
    
    
    printVector(arrV[0]);

    System.out.println ("Vector a= "+a);
    //printVector(a);
    System.out.println ("Vector b= "+b);
    //printVector(b);
    
    if(isCollinear(a,b)){
      System.out.println ("Vectors a and b are collinear");
    }
    else{
      System.out.println ("Vectors a and b aren't collinear");
    }
    
    if(isOrtogonal(a,b)){
      System.out.println ("Vectors a and b are ortogonal");
    }
    else{
      System.out.println ("Vectors a and b aren't ortogonal");
    }
    
    System.out.println ("Vector a+b= "+a.add(b));
    
    System.out.println ("Vector a-b= "+a.sub(b));
    
    System.out.println ("Scalar mult a*b= "+scalarMult(a,b));
    
    a.setXY(3,4);
    System.out.println ("Vector set a=[2,3] "+a);
    //printVector(a);
    
    System.out.println ("length a= "+a.length());
    
    double n=5;
    System.out.println ("Vector a*"+n+"= "+a.constMult(n));
    //a.constMult(n);
    printVector(a);
    
    
  }
}
