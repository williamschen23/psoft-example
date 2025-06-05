public class test {
    public static int sum(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length-1; i++){
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args){
        int[] test = new int[]{1, 2, 3, 4, 5};
        System.out.println(sum(test));
    }
}