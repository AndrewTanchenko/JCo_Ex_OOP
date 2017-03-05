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
  
  public static Matrix createMatrix(int m, int n, String matrix){
    switch(matrix){
      case "unit":
        if(m==n){
        //System.out.println("ok");
        Matrix b = new Matrix(m,n);
        for(int i=1;i<=m;i++){
          for(int j=1;j<=m;j++){
            if(i==j){b.setMatrixValue(i,j,1);}
          }
        }
        return b;
      }
    }
    return null;
  }
  
  public void setMatrixValue(int i, int j, double val){
    this.a[i-1][j-1]=val;
  }
  
  public double getMatrixValue(int i, int j){
    return this.a[i-1][j-1];
  }
  
  public int getRowN(){
  return this.m;
  }
  public int getColN(){
  return this.n;
  }
  
  public static void sqrMatrixRow(Matrix a, int n){
    for(int j=1;j<=a.getColN();j++){
      a.setMatrixValue(n,j,a.getMatrixValue(n,j)*a.getMatrixValue(n,j));
    }
  }
  
  public static void swichMatrixRowByMinMaxColEl(Matrix a, int k){
    double min=a.getMatrixValue(1,k),
           max=a.getMatrixValue(1,k);
    int min_i=1,
        max_i=1;
    for(int i=1;i<=a.getRowN();i++){
      if(a.getMatrixValue(i,k)<min){min=a.getMatrixValue(i,k); min_i=i;}
      if(a.getMatrixValue(i,k)>max){max=a.getMatrixValue(i,k); max_i=i;}
    }
    double temp=0;
    for(int j=1;j<=a.getColN();j++){
      temp=a.getMatrixValue(min_i,j);
      a.setMatrixValue(min_i,j,a.getMatrixValue(max_i,j));
      a.setMatrixValue(max_i,j,temp);
    }
    //System.out.println("max="+max+" min="+min+" i1="+min_i+" i2="+max_i);
  }
  
  public String rowToString(int i){
  return Arrays.toString(this.a[i-1]);
  }
  
  public String colToString(int n){
    String s="[";
    for(int i=1;i<=getRowN();i++){
      s+=getMatrixValue(i,n)+", ";
    }
  return s+"]";
  }
  
  public String toString(){
    System.out.println();
  return Arrays.deepToString(this.a);
  }
  
  public static void printMatrix(Matrix a){
    System.out.println("Matrix: ");
    for(int i=1;i<=a.getRowN();i++){
      System.out.println(a.rowToString(i));
    }
  }
  
//////////////////////////////////////////////////////
  
  public static void main(String[] args) {
    int m=3,
        n=3;
    
    Matrix a = new Matrix(m,n);
    Matrix b = createMatrix(3,3,"unit");
    
    System.out.println("getRow = "+a.getRowN());
    System.out.println("getCol = "+a.getColN());
    
    System.out.println(a);
    printMatrix(a);
    System.out.println(b);
    printMatrix(b);
    
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        a.setMatrixValue(i,j,i+j);
      }
    }
    printMatrix(a);
    sqrMatrixRow(a,2);
    printMatrix(a);
    
    swichMatrixRowByMinMaxColEl(a,3);
    printMatrix(a);
    //System.out.println("\n"+a.rowToString(1));
    //System.out.println("\n"+a.colToString(2));
    
  }
}
