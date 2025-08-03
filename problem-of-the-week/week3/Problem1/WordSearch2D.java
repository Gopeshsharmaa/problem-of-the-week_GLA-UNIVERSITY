public class WordSearch2D {

    public static boolean wordSearch(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check each row
        for (int i = 0; i < rows; i++) {
            StringBuilder rowStr = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                rowStr.append(matrix[i][j]);
            }
            if (rowStr.toString().contains(word)) {
                return true;
            }
        }

        // Check each column
        for (int j = 0; j < cols; j++) {
            StringBuilder colStr = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                colStr.append(matrix[i][j]);
            }
            if (colStr.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };

        System.out.println(wordSearch(matrix, "FOAM"));  // true
        System.out.println(wordSearch(matrix, "MASS"));  // true
        System.out.println(wordSearch(matrix, "FACE"));  // false
    }
}
