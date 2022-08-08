package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;

public class SnailArray {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3}, {4,5,6}, {7,8,9}
        };
        int firstLine = 0, firstRow = 0, lastLine = array.length - 1, lastRow = array[0].length - 1,
                numberOfElements = array.length * array[0].length,
                currentLine = 0, currentRow = 0;
        ArrayList<Integer> result = new ArrayList<>();

        outerLoop:
        for (;;) {

            for (; currentRow <= lastRow; currentRow++) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentRow--;
            currentLine++;
            firstLine++;
            for (; currentLine <= lastLine; currentLine++) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentLine--;
            currentRow--;
            lastRow--;
            for (; currentRow >= firstRow; currentRow--) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentRow++;
            currentLine--;
            lastLine--;
            for (; currentLine >= firstLine; currentLine--) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentLine++;
            currentRow++;
            firstRow++;

        }

        System.out.println("result = " + result);
   }
}
