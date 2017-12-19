package set_12_project_02;

import java.lang.IllegalArgumentException;

public class Frac {
	
	private int num;
	private int denom;
	
	public static int count = 0;
	
	private int hashCode;
	
	public Frac(int num, int denom) {
		
		if(denom == 0)
			throw new IllegalArgumentException("The denominator should be != 0"); 
		
		this.hashCode = ++count; 
		
		this.num = num;	
		this.denom = denom;
		
		if(denom < 0) {
			this.num *= -1;
			this.denom *= -1;
		}
		
		int gdc = gcdI(this.num, this.denom);
		
		this.num = this.num/gdc;
		this.denom = this.denom/gdc;
	
	}
	
	public Frac(int n) {
		this(n, 1);
	}
	
	public Frac() {
		this(0);
	}
	
	public boolean equals(Frac f) {
		return this.hashCode == f.hashCode;
	}
	
	public static int gcdI(int a, int b) {
		
		if(a < 0)
			a *= -1;
		
		if(b < 0)
			b *= -1;
		
		while(a != b) {
			if(a < b) {
				b = b - a;
			} else {
				a = a - b;
			}
		}
		
		return a;
	}
	
	public Frac add(Frac other) {
		Frac f = Frac.add(this, other);
		
		this.num = f.num;
		this.denom = f.denom;
		
		return this;
	}
	
	public Frac sub(Frac other) {
		Frac f = Frac.sub(this, other);
		
		this.num = f.num;
		this.denom = f.denom;
		
		return this;
	}
	
	public Frac div(Frac other) {
		Frac f = Frac.div(this, other);
		
		this.num = f.num;
		this.denom = f.denom;
		
		return this;
	}
	
	public static Frac div(Frac a, Frac b) {
		if(b.num == 0)
			throw new IllegalArgumentException("The denominator should be != 0");
		
		return new Frac(a.num * b.denom, a.denom * b.num);
	}
	
	public Frac mul(Frac other) {
		Frac f = Frac.mul(this, other);
		
		this.num = f.num;
		this.denom = f.denom;
		
		return this;
	}
	
	public static Frac mul(Frac a, Frac b) {	
		return new Frac(a.num * b.num, a.denom * b.denom);
	}
	
	public static Frac sub(Frac a, Frac b) {
		int a_denom = a.denom;
		int b_denom = b.denom;
		
		int c_num;
		int c_denom;
		
		if(a_denom == b_denom) {
			c_num = a.num - b.num;
			c_denom = a_denom;
		} else {
			a.num *= b_denom;
			a.denom *= b_denom;
			
			b.num *= a_denom;
	        b.denom *= a_denom;
	        
			c_num = a.num - b.num;
			c_denom = a.denom;
			
			int gdc = gcdI(c_num, c_denom);
			
			c_num = c_num/gdc;
			c_denom = c_denom/gdc;
		}
		
		return new Frac(c_num, c_denom);
	}
	
	public static Frac add(Frac a, Frac b) {

		int a_denom = a.denom;
		int b_denom = b.denom;
		
		int c_num;
		int c_denom;
		
		if(a_denom == b_denom) {
			c_num = a.num + b.num;
			c_denom = a_denom;
		} else {
			
			a.num *= b_denom;
			a.denom *= b_denom;
			
			b.num *= a_denom;
	        b.denom *= a_denom;
	        
			c_num = a.num + b.num;
			c_denom = a.denom;
			
			int gdc = gcdI(c_num, c_denom);
			
			c_num = c_num/gdc;
			c_denom = c_denom/gdc;
		}
		
		return new Frac(c_num, c_denom);
	}
	
	@Override
	public String toString() {
		return num + "/" + denom;
	}
	

}
