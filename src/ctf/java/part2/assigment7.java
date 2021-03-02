package ctf.java.part2;

public class assigment7 {
	public static void main(String[] args) {
		String string1 = "You and Me";
		String string2 = " you and me ";
		//1.
		if (string1 == string2)
			System.out.println("String are Equal");
		else 
			System.out.println("String not Equal");
		//2.
		if (string1.contains("Me"))
			System.out.println("Word 'Me' in string1");
		else 
			System.out.println("Word 'Me' not in string1");
		//3.
		System.out.println("Length of string1 is "+string1.length());
		//4.
		System.out.println("Position 1-4 of string1 is "+string1.substring(0,4));
		//5.
		System.out.println("Remove all space of string2 is "+string2.trim());
		//6.
		System.out.println(string1.toUpperCase());
		//7.
		System.out.println("Remove all space and Upper case of string2 is "+string2.trim().toUpperCase());
	}
}
