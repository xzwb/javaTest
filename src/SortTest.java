public class SortTest {
    public static int[] nums = {5, 88, 19, 75, 21, 56, 13, 64, 80, 37};

    public static void sort() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (nums[j] < nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] nums, int left, int right) {
        int i, j, t, temp;
        if (left > right) {
            return;
        }
        temp = nums[left];
        i = left;
        j = right;
        while (i != j) {
            while (nums[j] >= temp && i < j) {
                j--;
            }
            while (nums[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[left] = nums[i];
        nums[i] = temp;
        quickSort(nums, left, i-1);
        quickSort(nums, i+1, right);
        return;
    }

    public static int key(int num, int left, int right) {
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (num > nums[mid]) {
                left = mid + 1;
            } else if (num < nums[mid]) {
                right = mid - 1;
            } else if (num == nums[mid]) {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        quickSort(nums, 0, 9);
        // sort();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(key(21, 0, 9));
    }
}
