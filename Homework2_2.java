public class Homework2_2 {
    public static void main(String[] args) {
        int[] newArray = { 3, 2, 5, 4, 6, 7, 3, 1 };

        try {
            int d = 0;
            double catchedRes1 = newArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound " + e);
        } catch (NullPointerException e) {
            System.out.println("Nulls are not alowed" + e);
        }

    }   
}
