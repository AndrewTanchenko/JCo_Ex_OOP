// Javacore / Tanchenko A.

import java.util.Arrays;

class Vector {
  
    private int x;
    private int y;
    private int[] v = {x,y};
  
  public Vector(){ 
    //this.x=0;
    //this.y=0;
    this.v[0]=0;
    this.v[1]=0;
  }
  
  public Vector(int x, int y){ 
    //this.x=x;
    //this.y=y;
    this.v[0]=x;
    this.v[1]=y;
  }
  
  public static void printVector(Vector a){
    int[] v_ = new int[2];
    v_[0]=a.getX();
    v_[1]=a.getY();
    System.out.println(Arrays.toString(v_));
  }
  
  public String toString(){
    return Arrays.toString(getXY());
  }
  
  public void setXY(int x, int y){
    this.v[0]=x;
    this.v[1]=y;
  }
  public void setX(int x){
    this.v[0]=x;
  }
  public void setY(int y){
    this.v[1]=y;
  }
  
  public int[] getXY(){
  return v;
  }
  public int getX(){
  return v[0];
  }
  public int getY(){
  return v[1];
  }
  
  public int length(){
  return (int)(Math.sqrt(v[0]*v[0]+v[1]*v[1]));
  }
  
  public Vector add(Vector a){
  return new Vector(v[0]+a.getX(),v[1]+a.getY());
  }
  
  public Vector sub(Vector a){
  return new Vector(v[0]-a.getX(),v[1]-a.getY());
  }
  
  public static int scalarMult(Vector a,Vector b){
  return (int)(a.getX()*b.getX()+a.getY()*b.getY());
  }
      
  public int[] constMult(int c){
    v[0]=v[0]*c;
    v[1]=v[1]*c;
  return v;
  }

//////////////////////////////////////////////////////
  
  public static void main(String[] args) {
    Vector a = new Vector(1,2);
    Vector b = new Vector(3,4);


    System.out.println ("Vector a= "+a.toString());
    printVector(a);
    System.out.println ("Vector b= "+b.toString());
    printVector(b);
    
    System.out.println ("Vector a+b= ");
    printVector(a.add(b));
    
    System.out.println ("Vector a-b= ");
    printVector(a.sub(b));
    
    System.out.println ("Scalar mult a*b= "+scalarMult(a,b));
    
    System.out.println ("Vector a=[2,3] ");
    a.setXY(2,3);
    printVector(a);
    
    System.out.println ("length a= "+a.length());
    
    int n=5;
    System.out.println ("Vector a*"+n+"= ");
    a.constMult(n);
    printVector(a);
    
    
    //System.out.println ("a(x,y)= "+a.getX()+","+a.getY());
    //System.out.println ("b.y= "+b.getY());
    
  }
}
