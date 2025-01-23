public class binarysearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14}; 
        int target = 8; 
        int l = 0; 
        int h = array.length - 1; 
        int result = -1; 
        while (l <= h) {
            int m = (l + h) / 2; 
            if (array[m] == target) {
                result = m;
                break;
            } else if (array[m] < target) {
                l = m + 1; 
            } else {
                h = m - 1; 
            }
        }
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
