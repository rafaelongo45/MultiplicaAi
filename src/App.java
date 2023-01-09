public class App {
    public static void main(String[] args) throws Exception {
        multTable(9);
    }

    public static void multTable(int x){
        System.out.println("Multiplication table for the number: " + x);
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < numArr.length; i++){
            System.out.println(x + "x" + numArr[i] + " = " + numArr[i] * x);
        }
    }
}
