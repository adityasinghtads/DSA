package DSAJava.Practice;

public class practice2 {
    public static void main(String[] args) {
      int[] arr = {10, 20, 30, 40, 50};
      int elementToFind = 30;
      int index = -1;
      
      for(int i=0; i<arr.length; i++) {
        if(arr[i] == elementToFind) {
          index = i;
          break;
        }
      }
      
      if(index == -1) {
        System.out.println("Element not found in array");
      } else {
        System.out.println("Element found at index: " + index);
      }
    }
  }
  