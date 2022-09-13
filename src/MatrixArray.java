public class MatrixArray {
    public int[][] generateMatrix(int n) {
        int startX = 0,startY = 0;
        int loop = n/2;
        int count = 0;
        int i = 0,j = 0;
        int offset = 1;
        int [][] rel = new int[n][n];
        while ((loop--)>0){
            for (j = startY; j < n-offset;j++){
                rel[i][j] = ++count;
            }
            for (i = startX; i < n - offset;i++){
                rel[i][j] = ++count;
            }
            for (;j>=offset;j--){
                rel[i][j] = ++count;
            }
            for (;i>=offset;i--){
                rel[i][j] = ++count;
            }
            offset += 1;
            startX += 1;
            startY += 1;
        }
        if(n%2 == 1){
            rel[n/2][n/2] = ++count;
        }
        return rel;
    }
}

