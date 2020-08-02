package processor;

public class Matrix {
    private int rowsNum;
    private int columnsNum;
    private double[][] array;

    public Matrix(double[][] array, int rowsNum, int columnsNum ) {
        this.rowsNum = rowsNum;
        this.columnsNum = columnsNum;
        this.array = array;
    }

    public int getRowsNum() {
        return rowsNum;
    }

    public int getColumnsNum() {
        return columnsNum;
    }

    public double[][] getArray() {
        return array;
    }
}
