public class Numbers{
    public int[] numbers;

    public boolean different(){
        for(int x = 0; x < numbers.length; x++){
            for(int y = 0; y < numbers.length; y++){
                if(x == y)continue;
                if(numbers[x] == numbers[y])return false;
            }
        }
        return true;
    }

    public Numbers(int a, int b, int c, int d, int e){
        this.numbers = new int[]{a, b, c, d, e};
    }

    public static void main(String[] args){
        Numbers sample1 = new Numbers(3, 4, 2, 1, 6);
        System.out.println(sample1.different());

        Numbers sample2 = new Numbers(9,7,4,3,7);
        System.out.println(sample2.different());
    }
}