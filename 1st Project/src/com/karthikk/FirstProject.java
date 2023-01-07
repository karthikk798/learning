package com.karthikk;

import com.karthikk.matrix.Matrix;

public class FirstProject {

	public static void main(String[] args) throws Exception {
		Matrix a, b;
		a = new Matrix();
		b = new Matrix();
		a.setRows(2);
		b.setRows(2);
		a.setColumns(3);
		b.setColumns(3);
		a.setData(new int[][] { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 } });
		b.setData(new int[][] { new int[] { 11, 12, 13 }, new int[] { 14, 15, 16 } });
		
		System.out.println("Matrix a");
		a.print();
		System.out.println("Matrix b");
		b.print();
		a.add(b);
		a.print();
		
		
	}
}
