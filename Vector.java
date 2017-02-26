// Javacore / Tanchenko A.

class Vector {
  
    public int x;
    public int y;
    public int[] v = {x,y};
  
  public Vector(){ 
    x=0;
    y=0;
    v[0]=0;
    v[1]=0;
  }
  
  public Vector(int x, int y){ 
    x=this.x;
    y=this.y;
    v[0]=this.x;
    v[1]=this.y;
  }
  
  public void printVector(){
    System.out.println("x="+x+",y="+y);
  }
  
  public void setXY(int x, int y){
    v[0]=this.x;
    v[1]=this.y;
  }
  
  public int getX(){
  return x;
  }
  public int getY(){
  return y;
  }
  
  public int length(int[] a){
    int l = 0;
    l=(int)(Math.sqrt(a[0]*a[0]+a[1]*a[1]));
  return l;
  }
  
  public int[] sum(int[] a, int[] b){
    int[] v =new int[2];
    v[0]=a[0]+b[0];
    v[1]=a[1]+b[1];
  return v;
  }
  
  public int[] sub(int[] a,int[] b){
    int[] v =new int[2];
    v[0]=a[0]-b[0];
    v[1]=a[1]-b[1];
  return v;
  }
  
  public int scalarMult(int[] a,int[] b){
    int sMult = 0;
    sMult=a[0]*b[0]+a[1]*b[1];
  return sMult;
  }
  
  public int[] constMult(int[] a,int c){
    int[] v = new int[2];
    v[0]=a[0]*c;
    v[1]=a[1]*c;
  return v;
  }


  
  public static void main(String[] args) {
    Vector a = new Vector(1,2);
    
    //a.setXY(1,2);
    a.x=1;
    a.y=2;
    a.printVector();
    
    //System.out.println (""+Arrays.toString(a));
    System.out.println (""+a.getX());
    System.out.println (""+a.getY());
    
  }
}