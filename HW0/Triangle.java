/** Prints
 *         *
 *         **
 *         ***
 *         ****
 *         *****
*/

public class Triangle {
    public static void main(String[] args) {
        for(int row = 1; row < 6; row += 1) {
            for(int numberOfStars = 1; numberOfStars <= row; numberOfStars += 1) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
