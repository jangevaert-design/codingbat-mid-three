public class midThree {
  public int[] midThree(int[] nums) {
    int middle = nums.length / 2;
    int[] c = { nums[middle - 1], nums[middle], nums[middle + 1] };

    return c;
  }
}
