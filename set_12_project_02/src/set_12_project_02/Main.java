package set_12_project_02;

import set_12_project_02.Frac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frac a = new Frac(20,4),   
			 b = new Frac(1,-2),
		     c = new Frac(-14,-4), 
		     d = new Frac(-8,-4),
		     f = new Frac(4),      
		     m = new Frac(-1);

		Frac f2 = Frac.add(Frac.mul(d,c),
		                   new Frac(10).mul(b));
														 
		Frac f4 = Frac.add(Frac.mul(Frac.mul(a,b),
		                   new Frac(-2)),m);
											 
//		Frac zz = d.add(a).add(f.mul(Frac.mul(b,c)));

		Frac ww = Frac.div(f2,f4).sub(b).sub(c);

		System.out.println(f2 + " " + f4 + " " + /*zz + " " + */ww);
	}

}
