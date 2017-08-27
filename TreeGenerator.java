public class TreeGenerator {
    public void makeTree(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            printStars(i, numberOfRows);
            System.out.println("");
        }
    }

    private void printStars(int iteration, int numberOfRows) {
        int numberOfColumns = getAHalfLessOne(numberOfRows);
        int numberOfStars = getAHalfLessOne(iteration);
        int emptyColumns = getEmptyColumns(numberOfColumns, numberOfStars);
        int lastEmptyColumns = getLastEmptyColumns(emptyColumns, numberOfStars);
        for (int k = 0; k < numberOfColumns; k++) {
            if (k < emptyColumns || k > lastEmptyColumns) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }

    private int getAHalfLessOne(int number) {
        return (number * 2) - 1;
    }

    private int getEmptyColumns(int numberOfColumns, int numberOfStars) {
        return (numberOfColumns - numberOfStars) / 2;
    }

    private int getLastEmptyColumns(int firstEmptyColumns, int numberOfStars) {
        return (firstEmptyColumns + numberOfStars) - 1;
    }
}
