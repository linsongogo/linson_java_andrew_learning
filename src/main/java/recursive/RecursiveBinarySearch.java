package recursive;

/**
 * • 情况1: 如果关键字比中间元素小，那么只需在前一半数组元素中进行递归査找。
 * • 情况2: 如果关键字和中间元素相等，则匹配成功，査找结束。
 * • 情况3:如果关键字比中间元素大，那么只需在后一半数组元素中进行递归査找
 */
public class RecursiveBinarySearch {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    System.out.println(recursiveBinarySearch(array, -1));
  }

  public static int recursiveBinarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    return recursiveBinarySearch(list, key, low, high);
  }

  //上面方法参数不够，下面的为辅助方法，是上面方法的重载。list查找的列表，key目标
  //low和high是第一个和最后一个数的下标
  private static int recursiveBinarySearch(int[] list, int key,
      int low, int high) {
    if (low > high)  // The list has been exhausted without a match
    {
      return -low - 1; //需查找的元素应该位于当前数组的哪个位置
    }

    int mid = (low + high) / 2;
    if (key < list[mid]) {
      return recursiveBinarySearch(list, key, low, mid - 1);
    } else if (key == list[mid]) {
      return mid;
    } else {
      return recursiveBinarySearch(list, key, mid + 1, high);
    }
  }
}