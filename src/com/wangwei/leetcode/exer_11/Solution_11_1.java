package com.wangwei.leetcode.exer_11;

/**
 * @Author wangwei
 * @Date 2020/10/13 10:04 上午
 * @Version 1.0
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 示例：
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_11_1 {

    public int maxArea(int[] height){
        int max = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j-i) * Math.min(height[i], height[j]);
                max = Math.max(area, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution_11_1 solution_11_1 = new Solution_11_1();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        solution_11_1.maxArea(arr);
    }
}
