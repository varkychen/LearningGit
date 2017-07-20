public class StringReversal {
	public static void main(String... args) {
		System.out.println(reverseString("Hello World !!!"));
	}

	public static String reverseString(String arg) {
		if (arg.length() <= 1) {
			return arg;
		} else {
			return arg.charAt(arg.length() - 1) + reverseString(arg.substring(0, arg.length() - 1));
		}
	}
}
