package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        (no video for the challenge — it uses arrays, from part 10)
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part17/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.




public class Challenge {

    public static int sumSkip13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }

        return sum;
    }

    public static boolean hasPair(int[] nums, int value) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == value && nums[i + 1] == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 13, 5, 2};
        int[] nums3 = {};

        System.out.println(sumSkip13(nums1));
        System.out.println(sumSkip13(nums2));
        System.out.println(sumSkip13(nums3));

        int[] pair1 = {1, 2, 2};
        int[] pair2 = {2, 1, 2};
        int[] pair3 = {7};

        System.out.println(hasPair(pair1, 2));
        System.out.println(hasPair(pair2, 2));
        System.out.println(hasPair(pair3, 7));
    }
}

