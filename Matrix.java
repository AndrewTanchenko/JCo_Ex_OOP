// Javacore / Tanchenko A.

import java.util.Arrays;

class Matrix {
  
    private int m;
    private int n;
    private double[][] a = new double[m][n];
    
    
  public Matrix(){
    this.m=2;
    this.n=2;
    this.a = new double[m][n];
  }
  
  public Matrix(int m, int n){ 
    this.m=m;
    this.n=n;
    this.a = new double[m][n];
  }
  
  public int getRowN(){
  return this.m;
  }
  public int getColN(){
  return this.n;
  }
  
  public String rowToString(int i){
  return Arrays.toString(this.a[i-1]);
  }
  
  public String toString(){   
  return Arrays.deepToString(this.a);
  }
  
  public static void printMatrix(Matrix a){
    for(int i=1;i<=a.getRowN();i++){
      System.out.println(a.rowToString(i));
    }
  }
  
//////////////////////////////////////////////////////
  
  public static void main(String[] args) {
    Matrix a = new Matrix(3,3);
    
    System.out.println("getRow = "+a.getRowN());
    System.out.println("getCol = "+a.getColN());
    
    System.out.println(a);
    printMatrix(a);
    
  }
}
