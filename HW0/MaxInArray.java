/** Prints the max of an array
 *
 *  @author Pradyumna Shembekar
 *  11/25/2015
*/
public class MaxInArray {
   public static int max(int[] m) {
       int maxi = 0;

       for(int i = 0; i < m.length; i += 1) {
           if (maxi > m[i]) {
               maxi = maxi;
           } else {
               maxi = m[i];
           }
       }
       return maxi;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      int maxi = max(numbers);
      System.out.println(maxi);
   }
}
