package com.company;

import java.util.ArrayList;

class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i=colStart; i<=colEnd; i++){
                ans.add(matrix[rowStart][i]);
            }

            rowStart++;

            for(int i=rowStart; i<=rowEnd; i++){
                ans.add(matrix[i][colEnd]);
            }

            colEnd--;

            if(rowStart > rowEnd || colStart > colEnd){
                break;
            }

            for(int i=colEnd; i>=colStart; i--){
                ans.add(matrix[rowEnd][i]);
            }
            rowEnd--;


            for(int i=rowEnd; i>=rowStart; i--){
                ans.add(matrix[i][colStart]);
            }

            colStart++;
        }

        return ans;
    }
}