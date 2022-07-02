public class ContainerWithMostWater {


    //int array[] contains the heights of the bars

    public static int ContainerWithMostWater(int arr[]){
        //one pointer start form the front and other from the end
        int i= 0;
        int j= arr.length;
        //maxArea is 0 at first
        int maxArea = 0;

        // start moving the pointers
        while (i<j){
            // lets get the height, and remember to store only small height as,
            //two walls, one small and ohter bigger can hold only water up till small other wise it will overflow

            int height = Math.min(arr[i], arr[j]);
            //also width is j-i, ex arr[8] will have width with first element as 8-0 =8;
            int width = j-i;

            int area = height * width;
            //get the max area
            maxArea = Math.max(maxArea, area);
            // move the pointers closer to each other accordingly.
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
