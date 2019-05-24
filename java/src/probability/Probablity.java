package probability;

import java.util.Vector;

public class Probablity {
	private int n;
	private Vector<String> DataSet;
	
	public Probablity(int n, Vector<String> dataSet) {
		super();
		if(n>1 & dataSet.capacity()>1) {
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

	protected void setDataSetsetN(Vector<String> dataSet,int n) {
		DataSet = dataSet;
		this.n = n;
	}
	
	public double max(Vector<double[]> dataSet,int n, int s) {
		double max =0;
		if (s<n | s>0 | n>0) {
			if(s==0)s=n;
			for(int i=0;i<=s;i++) {
				if(max<dataSet.elementAt(i)[0])max=dataSet.elementAt(i)[0];
			}
		}
		return max;
	}
	
	public double min(Vector<double[]> dataSet,int n, int s) {
		double min =0;
		if (s<n | s>0 | n>0) {
			if(s==0)s=n;
			for(int i=0;i<=s;i++) {
				if(min>dataSet.elementAt(i)[0])min=dataSet.elementAt(i)[0];
			}
		}
		return min;
	}
	
	public double mean(Vector<double[]> dataSet,int n, int s) {
		double mean =0;
		double sum =0;
		if (s<n | s>0 | n>0) {
			if(s==0)s=n;
			for(int i=0;i<=s;i++) {
				sum += dataSet.elementAt(i)[0];
			}
		 mean=sum/s;
		}
		return mean;
	}
	
	public double var(Vector<double[]> dataSet,int n, int s) {
		double var =0;
		double mean=mean(dataSet,n,s);
		double app =0;
		double sum =0;
		if (s<n | s>0 | n>0) {
			if(s==0)s=n;
			for(int i=0;i<=s;i++) {
				app = Math.pow(2,dataSet.elementAt(i)[0]-mean);
				sum += app;
			}
			var=sum/(s-1);
		}
		return var;
	}
	
	public double der(Vector<double[]> dataSet,int n, int s) {
		double var=var(dataSet,n,s);
		return Math.sqrt(var);
	}
	
	@Override
	public String toString() {
		return "Probablity [n " + n + ", DataSet " + DataSet + "]";
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
