public class ContainerWithMostWater {


    //int array[] contains the heights of the bars

    public static int ContainerWithMostWater(int arr[]){
        int i= 0;
        int j= arr.length;
        int maxArea = 0;
        while (i<j){
            int height = Math.min(arr[i], arr[j]);
            int width = j-i;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if(arr[i]< arr[j]){
                i++;
            }else{
                j--;
            }
        }return maxArea;

    }

    public static void main(String[] args) {

    }
}
