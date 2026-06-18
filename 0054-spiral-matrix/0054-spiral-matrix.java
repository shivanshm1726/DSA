class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = m-1;
        int endCol = n-1;

        while(startRow <= endRow && startCol <= endCol){
            //top left to right
            for(int col = startCol; col <= endCol; col++){
                list.add(matrix[startRow][col]);
            }
            startRow++;

            // top to bottom
            for(int row = startRow; row <= endRow; row++){
                list.add(matrix[row][endCol]);
            }
            endCol--;

            //bottom right to left
            if(startRow <= endRow){
                for(int col = endCol; col >= startCol; col--){
                    list.add(matrix[endRow][col]);
                }
                endRow--;
            }

            // bottom to up

            if(startCol <= endCol){
                for(int row = endRow; row >= startRow; row--){
                    list.add(matrix[row][startCol]);
                }
                startCol++;
            }
        }
        return list;
    }
}