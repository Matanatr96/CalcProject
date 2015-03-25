import java.util.ArrayLists;
public class Matrix {
	// make a bunch of helper methods. 
	// all the ones listed in the project description

	// Create/instantiate/initialize vectors and matrices
	// What should i do here guys?
	// Im not 100% sure how we should go about this.
	public Matrix() {

	}

	//  Take the dot product of two vectors
	public double dot(int[] one, int[] two) {
		int length = one.length();
		double value = 0;

		for (int i = 0; i < length; i++) {
			value = value + one[i] * two[i];
		}

		return value;
	}

	//Find the LU-Factorization of a matrix
	public Matrix[] lu(Matrix one, Matrix two) {

	}
}