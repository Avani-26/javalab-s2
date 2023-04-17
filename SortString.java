import java.io.*; 
class SortString {
 
    // Main driver method
    public static void main(String[] args) throws Exception
    {
        // Custom string
        String str = "codingninjas";
       
        // Converting string into an array for operating
        char arr[] = str.toCharArray();
 
        // User-defined logic for sorting strings in java
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println("Original String: "+ str);
        
		// Final sorted array
        System.out.println("Sorted String: "+ new String(arr));
    }
}
