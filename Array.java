public class Array {
    public static void main(String[] args) {
        // int []arr ={10,20,30,40};
      

      
    

    // for (Object elem : arr) {
    //     System.err.println(elem);
    // }

    // int num[] = new int [3];
    // num[1]=40;
    // num[2]=50;
    // num[3]=60;

    // to reverse array
    //   for(int i=arr.length-1;i>=0;i--){
    //      System.err.println(arr[i]);
    // }
//to reverse array using swapping the elements
    int[] arrs = {1, 2, 3, 4, 5,6,7,8,9,};

int start = 2;
int end = arrs.length-3;

while (start < end) {
    int temp;
    temp = arrs[start];
    arrs[start] = arrs[end];
    arrs[end] = temp;

    start++;
    end--;
}

// Print array
for (int elem : arrs) {
    System.out.println(elem);
}


     }
    

}
