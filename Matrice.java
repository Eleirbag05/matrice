//class matrice         a

public class Matrice {
	private double [][] matrice;
	private int rows;
	private int columns;

	/*to create a matrix with fixed dimensions at 10 with all 1 in it */
	public Matrice() {
		rows = columns = 10;
		matrice = new double [rows][columns];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				matrice[i][j]=1;
			}
		}
	}
	/*-----------*/
	
	
	/*to create a matrix with variable rows and columns
	* but with only elements of the same value */

	public Matrice(int rows, int columns, double element) {
		this.rows=rows;
		this.columns=columns;
		matrice = new double [rows][columns];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				matrice[i][j]=element;
			}
		}
	}
	/*-----------*/
    /*creates a matrix  with variable rows, columns and numbers in it*/
	public Matrice(int rows, int columns, double matrix[][]) {
		this.rows=rows;
		this.columns=columns;
		matrice = new double [rows][columns];
		matrice = matrix;
	}
	
	/*returns the value in that particular position*/
	public double get(int rows, int columns) {
		return matrice[rows][columns];
	}
	/*sets the value in that particular position*/
	public void set(int rows, int columns, double elem) {
		matrice [rows][columns] = elem;
	}
	/*returns the number of elements in the row of the matrix*/
	public int getRows() {
		return rows;
	}
	/*sets the number of elements in the row of the matrix*/
	public void setRows(int rows) {
		this.rows=rows;
	}
	/*returns the number of elements in the column of the matrix*/
	public int getColumns() {
		return columns;
	}
	/*sets the number of elements in the column of the matrix*/
	public void setColumns(int columns) {
		this.columns=columns;
	}
	
	/*-----------*/
	/*returns the minimum value in the matrix*/
	public double min() {
		double min = matrice[0][0];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				if(min<matrice[i][j]) {
					min = matrice [i][j];
				}
			}
		}
		return min;
	}
	/*-----------*/
	/*returns the maximum value in the matrix*/
	public double max() {
		double max = matrice[0][0];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				if(max>matrice[i][j]) {
					max = matrice [i][j];
				}
			}
		}
		return max;
	}
	/*returns the average of the values in the matrix */
	public double average() {
		double sum = 0;
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				sum = sum + matrice[i][j];
			}
		}
		return sum/(rows*columns);
	}
	/*returns the index where the element to find is*/
	public int[] indexOf(double toFind) {
        for (int i=0; i<rows;i++) {
            for (int j=0;j<columns;j++) {
                if (matrice[i][j] == toFind) {
                    int[] index = {i, j};
                    return index;
                }
            }
        }
        int[] error = {-1, -1};
        return error;
    }
	/*returns the number of times the element is present*/
	public int howMany(double toFind) {
		int count = 0;
		for (int i=0; i<rows;i++) {
            for (int j=0;j<columns;j++) {
                if (matrice[i][j] == toFind) {
                    count = count + 1;
                }
            }
        }
		return count;
	}
	
	/*returns a new matrix with the values of the first times the parameter*/
	public double[][] multiplyForScalar(int scalar){
		double[][] matricenuova = new double [rows][columns];
		for (int i=0; i<rows;i++) {
            for (int j=0;j<columns;j++) {
            	matricenuova [i][j] = matrice [i][j] * scalar;
            }
        }
		return matricenuova;
	}
	/*returns a string of the elements under the form of an array */
	public String toString() {
		String string = "[ ";
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				string = string + matrice [i][j] + " ";
			}
		}
		string = string + "]";
		return string;
	}
	

}
