package lesson10;

public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix() {
        numbers = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix(int row, int columns) {
        numbers = new double[row][columns];
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (!isRowAndColumnIndexValid(rowIndex, colIndex)) {
            return -1;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (!isRowAndColumnIndexValid(rowIndex, colIndex)) {
            return;
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (!isMatrixSame(otherMatrix)) {
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (!isMatrixSame(otherMatrix)) {
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (!isMatrixSame(otherMatrix) || !isMatrixSquare(otherMatrix)) {
            return null;
        }
        double c = 0;
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                for (int k = 0; k < getColumns(); k++) {
                    c += getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                }
                result.setValueAt(i, j, c);
                c = 0;
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        double c = 0;
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                for (int k = 0; k < getColumns(); k++) {
                    c += getValueAt(i, k) * value;
                }
                result.setValueAt(i, j, c);
                c = 0;
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + "  ");
            }
            System.out.println();
        }
    }

    /**
     * проверяет что строка и столбец не выходит за пределы массива
     *
     * @return true - проверка прошла успешно
     * false - проверка не прошла
     */
    private boolean isRowAndColumnIndexValid(int rowIndex, int colIndex) {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Индекс строки не подходит");
            return false;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Индекс колонки не подходит");
            return false;
        }
        return true;
    }

    private boolean isMatrixSame(IMatrix otherMatrix) {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает кол-во строк");
            return false;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает кол-во строк");
            return false;
        }
        return true;
    }

    private boolean isMatrixSquare(IMatrix otherMatrix) {
        if (getRows() != getColumns() || otherMatrix.getRows() != otherMatrix.getColumns()) {
            return false;
        }
        return true;
    }
}
