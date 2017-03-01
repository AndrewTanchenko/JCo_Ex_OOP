// Javacore / Tanchenko A.

import java.util.Arrays;

class Matrix {
  
    private int m;
    private int n;
    private int[][] a = new int[m][n];
  
  public Matrix(int m, int n){ 
    for(int i=0;i<=m-1;i++){
      for(int j=0;j<=n-1;j++){
        this.a[i][j]=0;
      }
    }
  }
  
  public int getRow(){
  return m;
  }
  public int getCol(){
  return n;
  }
  
  public static void printMatrix(Matrix a){
    //int row = new int[2];
    //v_[0]=a.getX();
    //v_[1]=a.getY();
    //System.out.println(Arrays.toString(v_));
    //Arrays.deepToString(a);
    //Arrays.toString(a[i]);
  }
  
  
//////////////////////////////////////////////////////
  
  public static void main(String[] args) {
    Matrix a1 = new Matrix(3,3);
    
    //System.out.println ("getM "+a.getM());
    
    int m=4,
        n=3;
    int[][] a = new int[m][n];
    
    //for(int i=0;i<=m-1;i++){
    //Arrays.fill(a[i], 0);
    //}
    
    for(int i=0;i<=m-1;i++){
      for(int j=0;j<=n-1;j++){
        a[i][j]=0;
      }
    }
    
    System.out.println (Arrays.deepToString(a));
    
    System.out.println (Arrays.toString(a[0]));
    
    
  }
}