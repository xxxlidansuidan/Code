class Code {
	public static void main(String... args) {
		/*Now let’s consider how to generate a random lowercase letter. The Unicodes for lowercase
		letters are consecutive integers starting from the Unicode for a, then for b, c, . . . , and z*/
		
		int max = 122;
		int min = 97;
		int range = max - min + 1;
		for (int i = 0; i < 175; i++) {
			char ch = (char)(int) ((Math.random() * range) + min);
			if ((i + 1) % 25 == 0) //line breaking in 26 
				System.out.println(ch);
			else
				System.out.print(ch + " ");
		}
	}
}
