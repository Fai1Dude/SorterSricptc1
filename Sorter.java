public class Sorter {
    public static void main(String[] args) {
        
    }
    public static void sort(int[]array){Bubble(array);}
    public static void Bubble(int[] list) {
        boolean nxtpass = true;
        for (int k = 1; k < list.length && nxtpass; k++) {
          nxtpass = false;
          for (int i = 0; i < list.length - k; i++) {
            if (list[i] > list[i + 1]) {
              int temp = list[i];
              list[i] = list[i + 1];
              list[i + 1] = temp;
              nxtpass = true; }}}}
    
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
    public static void sort(int[] array) {
        insertionSort(array);
    }

}
