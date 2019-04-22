/*Now let’s consider how to generate a random lowercase letter. The Unicodes for lowercase
letters are consecutive integers starting from the Unicode for a, then for b, c, . . . , and z*/

class Code {
    /** Main method */
    public static void main(String[] args) {
    final int NUMBER_OF_CHARS = 175;
    final int CHARS_PER_LINE = 25;
    int max = 122;
    int min = 97;
    int range = max - min + 1;

    // Print random characters between 'a' and 'z', 25 chars per line
    for (int i = 0; i < NUMBER_OF_CHARS; i++) {
     /** char ch = (char)(int) ((Math.random() * range) + min);
         char ch = (char)('a' + Math.random() * ('z' - 'a' + 1));
         char ch = (char)(97 + Math.random() * 26); */
	    char ch = RandomCharacter.getRandomLowerCaseLetter();
	    if ((i + 1) % CHARS_PER_LINE == 0)
	    System.out.println(ch);
	    else
	    System.out.print(ch);
    }
}
class RandomCharacter {
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
	return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
	return getRandomCharacter('a', 'z');
	}
	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
	return getRandomCharacter('A', 'Z');
	}
	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
	return getRandomCharacter('0', '9');
	}
	/** Generate a random character */
	public static char getRandomCharacter() {
	return getRandomCharacter('\u0000', '\uFFFF');
	}
}

