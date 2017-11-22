package set_00_project_04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// age is 8-bit
        // gender is 1-bit
        // weight is 8-bit
        // height is 8-bit
        int age=60, gender=1, weight=82, height=182;
        int packed1 = 0, packed2 = 0;

        System.out.println("age in binary form is " + Integer.toBinaryString(age));
        System.out.println("gender in binary form is " + Integer.toBinaryString(gender));
        System.out.println("weight in binary form is " + Integer.toBinaryString(weight));
        System.out.println("height in binary form is " + Integer.toBinaryString(height));

        // packing - 2 approaches
        packed2 |= height;
        packed2 |= (weight << 8);
        packed2 |= (gender << 16);
        packed2 |= (age << 17);

        packed1 = (((((age << 1) | gender) << 8) | weight) << 8) | height;

        System.out.println("packed1 in binary form is " + Integer.toBinaryString(packed1));
        System.out.println("packed2 in binary form is " + Integer.toBinaryString(packed2));
        assert packed1 == packed2;
        
        // unpacking
        assert height == (packed1 & 0xff);
        assert weight == (packed1 >>> 8 & 0xff);
        assert gender == ((packed1 >>> 16) & 1);
        assert age == (packed1 >>> 17);
	}

}
