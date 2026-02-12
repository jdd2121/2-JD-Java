public class RotatingRepo{

    private static boolean linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target Found");
                return true;
            }
        }
        System.out.println("Target Not Found");
        return false;
    }
    public static void main(String[] args){
        System.out.println("test");
        int[] idkWhatToDo = {0, 5, 7, 18, 22};
        int targetValue = 7;
        linearSearch(idkWhatToDo, targetValue);
        //good luck with making this interesting
    }
}