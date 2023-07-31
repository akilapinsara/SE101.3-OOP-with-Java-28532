public class Q2 {
    public static void main(String[] args) {
        int[] numbers={1,56,78,5,41,9,62,58};
        //             0, 1, 2,3, 4,5, 6, 7
        try{
            numbers[3]=89;
            System.out.println("Result's "+numbers[3]);
            int ans=numbers[2]/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            for(int i=0;i< numbers.length;i++){
                System.out.println(numbers[i]);
            }
        }

    }
}