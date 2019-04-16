
public class Bitwise
	{

	public static void main(String[] args)
		{
		int numb1 = 10;
		int numb2 = 18;
		int ans;

		//Bitwise OR Operator

		ans = numb1 | numb2;
		System.out.println("1. "+ans);  //26


		//Bitwise AND Operator

		ans = numb1 & numb2;
		System.out.println("\n2. "+ans);  //2


		//Bitwise Complement Operator

		ans = ~numb2;
		System.out.println("\n3. "+ans);  //-19


		//Bitwise XOR Operator

		ans = numb1 ^ numb2;
		System.out.println("\n4. "+ans);  //24


		//Bitwise Left Shift Operator

		System.out.println("\n5. "+ (numb1 << 1));  //20
		System.out.println("   "  + (numb2 << 2));  //72


		//Bitwise Right Shift Operator

		System.out.println("\n6. " + (numb1 >> 1));  //5
		System.out.println("   "   + (numb2 >> 2));  //4


		//Bitwise Double Right Shift Operator

		System.out.println("\n7. " + (numb1 >>> 1));  //5
		System.out.println("   "   + (numb2 >>> 2));  //4
		}

	}
