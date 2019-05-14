package probability;

import java.util.*;

public class Probablity {
	int n;
	private Vector<String> DataSet;
	
	public Probablity(int n, Vector<String> dataSet) {
		super();
		if(n>1) {
		this.n = n;
		DataSet = new Vector<String>(n);
		DataSet = dataSet;	
		}
	}
	
	public Probablity() {
		super();
		if(this.n==1) {
		this.n = 1;
		DataSet = new Vector<String>(1);	
		}
	}

	public int getN() {
		return n;
	}

	public Vector<String> getDataSet() {
		return DataSet;
	}

	public void setDataSetsetN(Vector<String> dataSet,int n) {
		DataSet = dataSet;
		this.n = n;
	}
	


	@Override
	public String toString() {
		return "Probablity [n=" + n + ", DataSet=" + DataSet + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataSet == null) ? 0 : DataSet.hashCode());
		result = prime * result + n;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Probablity other = (Probablity) obj;
		if (DataSet == null) {
			if (other.DataSet != null)
				return false;
		} else if (!DataSet.equals(other.DataSet))
			return false;
		if (n != other.n)
			return false;
		return true;
	}
	
}
