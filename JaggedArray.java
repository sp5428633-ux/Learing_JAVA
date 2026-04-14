public class JaggedArray {
    public static void main(String[] args) {
       
        int [][]arr= new int [3][];
        arr[0]=new int [2];
        arr[1]=new int [3];
        arr[2]=new int [2];
      
        arr[0][0]=10;
        arr[0][1]=20;

        arr[1][0]=30;
        arr[1][1]=40;
        arr[1][2]=50;

        arr[2][0]=60;
        arr[2][1]=70;
System.out.println("enchased For loop");
       for (int [] row : arr) {
           for(int values : row){
             System.out.print(values);
           }
           System.out.println("");
       }

       System.out.println("simple For loop");
        int [][]arrs={
            {10,20,},
            {10,20,30},
            {10,20}
        };

        for (int i = 0; i < arrs.length; i++) {
         for (int j = 0; j < arrs[i].length; j++) {

        System.out.print(arrs[i][j]);
        }
       System.out.println(" ");
    
      }

    }
}
