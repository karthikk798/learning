package com.karthikk.matrix;

public class Matrix {
	private int rows, columns;
	private int[][] data;

	public void add(Matrix b) {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				this.data[i][j] = this.data[i][j] + b.data[i][j];
			}
		}
	}

	public void print() {
		for (int j = 0; j < getRows(); j++) {
			for (int i = 0; i < getColumns(); i++) {
				System.out.print(data[j][i]);
				System.out.print(" ");

			}
			System.out.println();
		}
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) throws Exception {
		if (rows <= 0)
			throw new Exception("rows have to be more than zero");
		this.rows = rows;
	}

	public int getColumns() {
		return this.columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int[][] getData() {
		return data;
	}

	public void setData(int[][] data) {
		this.data = data;
	}

}
