public class Arrays{
    public static boolean arr(int[] arr1, int[] arr2){
        int two_digit_count_1 = 0;
        for (int number : arr1) {
            if (number >= 10 && number < 100){
                two_digit_count_1++;
            }
        }

        int two_digit_count_2 = 0;
        for (int number : arr2) {
            if (number >= 10 && number < 100){
                two_digit_count_2++;
            }
        }

        if(two_digit_count_1 == two_digit_count_2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(Arrays.arr(new int[]{15,8,2,37,49,117}, new int[]{9,6,7,12,48,4,6,90,5}));
    }
}