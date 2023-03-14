import java.util.Arrays;

class LambdaEx1{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.setAll(arr, (i) -> (int)(Math.random() * 5)+1);
        for(int x : arr){
            System.out.print(x);
        }
        System.out.println("");
    }
}