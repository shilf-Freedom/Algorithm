package cn.algo.arrayfind;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author 石龙飞
 *
 */
public class ArrayFindTest {
	
	public static void main(String[] args) {
		int[][] array = {{1,5,6,23,49},{3,12,18,31,51},{8,21,46,47,80}};
//		boolean f = ArrayFindTest.Find(12, array);
//		System.out.println(f);
		System.out.println(array[2][3]);
		
	}

    public static boolean Find(int target, int [][] array) {
        
        if(array[0].length == 0)
            return false;
        
        int i = 0;
        int j = array.length - 1;
        boolean find = false;
        boolean finish = false;
        
        
        while(find == false && finish == false){
            if(target > array[i][j])
                i++;
            else if(target < array[i][j])
                j--;
            else
                find = true;
            
            if(i == array[0].length || j == -1)
                finish = true;
        }
        
        return find;
    }

}
