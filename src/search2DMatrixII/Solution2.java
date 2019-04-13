package search2DMatrixII;
//����ѡ��һ�������������ٸ��ݵ����Խ��б���
//��ά�����Ա��۰���ң�������Խ�ܶ�
public class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0 || matrix == null) {
    		return false;
    	}
    	int col = 0, row = matrix.length-1;
    	while(col < matrix[0].length && row >= 0) {
    		if(matrix[row][col] == target) {
    			return true;
    		}else if(matrix[row][col] > target) {
    			row--;
    		}else {
    			col++;
    		}
    	}
    	return false;
    }
}
