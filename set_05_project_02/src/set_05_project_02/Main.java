package set_05_project_02;

public class Main {
	
	public static void main(String[] args) {
		info(encode(131070,126,131071,127,8191,7));
	}
	
//	1. identi er of the calling customer (caller): 17-bit number, i.e., from interval [0, 217 − 1] = [0, 131071];
//	2. zone number of the caller (caller_zone): 7-bit number, i.e., from interval [0, 27 − 1] = [0, 127];
//	3. identi er of the receiving customer (callee): 17-bit number;
//	4. zone number of the callee (callee_zone): 7-bit number;
//	5. duration of the call in seconds: 13-bit number, i.e., from interval [0, 213 − 1] = [0, 8191];
//	6. tari  number: 3-bit number, i.e., from interval [0, 23 − 1] = [0, 7];

	public static long encode(int caller, int caller_zone, int callee, int callee_zone, int duration, int tariff) {
		long encoded = 0; 
		
//		System.out.println(Long.toBinaryString(caller));
//		System.out.println(Long.toBinaryString(caller_zone));
//		
//		System.out.println(Long.toBinaryString(callee));
//		System.out.println(Long.toBinaryString(callee_zone));
		
		encoded |= caller;
		encoded = encoded << 7;
		encoded |= caller_zone;
		encoded = encoded << 17;
		encoded |= callee;
		encoded = encoded << 7;
		encoded |= callee_zone;
		encoded = encoded << 13;
		encoded |= duration;
		encoded = encoded << 3;
		encoded |= tariff;
		
		return encoded;
	}
	
	public static int extractByIndex(long n, int index, int lenght) {
		
//		System.out.println(
//			Long.toBinaryString(
//				((n >>> (64 - index - lenght)) << (64 - lenght)) >>> (64 - lenght)
//			)
//		);
		
		return Integer.parseInt(
			Long.toBinaryString(
				((n >>> (64 - index - lenght)) << (64 - lenght)) >>> (64 - lenght)
			), 2
		);				
	}

	public static void info(long res) {
		int caller = 0;
		int caller_zone = 0; 
		int callee = 0;
		int callee_zone = 0; 
		int duration = 0;
		int tariff = 0;
		
//		System.out.println(Long.toBinaryString(res));
//		System.out.println("");
		
		caller 		= extractByIndex(res, 0, 17);
		caller_zone = extractByIndex(res, 17, 7);
		callee 		= extractByIndex(res, 24, 17);
		callee_zone = extractByIndex(res, 41, 7);
		duration 	= extractByIndex(res, 48, 13);
		tariff 		= extractByIndex(res, 61, 3);
				
		System.out.println(caller_zone + " " + caller);
		System.out.println(callee_zone + " " + callee);
		System.out.println(duration);
		System.out.println(tariff);
		
	}
	
}    