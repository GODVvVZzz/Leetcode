package offer.q47;

/**
 * @author HP
 * @date 2022/3/20
 */
public class test {
    public static void main(String[] args) {
        int[][] grid =
                       {{1,4,8,6,2,2,1,7},
                        {4,7,3,1,4,5,5,1},
                        {8,8,2,1,1,8,0,1},
                        {8,9,2,9,8,0,8,9},
                        {5,7,5,7,1,8,5,5},
                        {7,0,9,4,5,6,5,6},
                        {4,9,9,7,9,1,9,0}};

        System.out.println(Solution.maxValue(grid));
    }

}
