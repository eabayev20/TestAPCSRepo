public class Demo{
  public static void main(String[] args){

     if(args.length==0){
     printLoop(5);
     }else{
       int a = Integer.valueOf(args[0]);
       printLoop(a);
    }
    
}
  public static void printLoop(int n){
    for(int i = 1;i<= n; i ++){
      for(int j = n;j >= i; j--){
        System.out.print(i);
      }
      System.out.println();
    }

  }
  public static String arrToString(int[]arr){
    if (arr.length==0) return "{}";
    String result=Integer.toString(arr[0]);
    for (int i=1; i<arr.length; i++){
      result = result + "," + " "+Integer.toString(arr[i]);
    }
    return "{" + result + "}";
  }
  public static String arrayDeepToString(int[][]arr){
    String result = "";
    for(int i = 0; i < arr.length; i ++){
      result = result + "{";
      for(int j =0; j < arr[i].length; j ++){
        result = result + arr[i][j];
        if(j != arr[i].length-1){
          result = result + ",";
        }
      }
      if(i == arr.length-1){
        result = result + "}";
      }else{
      result = result + "}, ";
    }
    }
    return "{" + result + "}";
  }
  public static int[][] create2DArray(int rows, int cols,int maxValue){
    int[][]arr  = new int[rows][cols];
    int value = 0;
    for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = (int) (Math.random()* (maxValue+1));
                value = value + 1;
                if(value == maxValue+1){
                  j = cols;
                  value = 0;
                }
            }
  }
  return arr;
}
 public static int[][] create2DArrayRandomized(int rows, int cols,int maxValue){
   int[][]arr = new int[rows][];
   for(int i = 0; i< rows; i++){
     arr[i] = new int[(int) (Math.random()* (cols+1))];
   }
   for(int i = 0; i < rows; i++){
           for(int j = 0; j < arr[i].length ; j++){
               arr[i][j]  = (int) (Math.random()* maxValue+1);
           }
 }
   return arr;
 }

}
