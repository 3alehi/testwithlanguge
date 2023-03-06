public class ComplexAlgorithm {
   public static void main(String[] args) {
      int[] arr = {5, 2, 8, 1, 9};
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      System.out.println("Max value is: " + max);
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 2 == 0) {
            sum += arr[i];
         }
      }
      System.out.println("Sum of even numbers is: " + sum);
      String[] strArr = {"hello", "world", "java", "programming"};
      int strCount = 0;
      for (String str : strArr) {
         if (str.length() > 5) {
            strCount++;
         }
      }
      System.out.println("Number of strings with length > 5: " + strCount);
      int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int diagonalSum = 0;
      for (int i = 0; i < twoDArray.length; i++) {
         diagonalSum += twoDArray[i][i];
      }
      System.out.println("Sum of diagonal elements is: " + diagonalSum);
   }
}
