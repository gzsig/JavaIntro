public class TestBitwise {
	public static void main(String[] args) {
		String msg = "BOM DIA" + ((char) (0x53));
		int hash = 0;
		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
			int dec = Integer.valueOf(c);
			String s = toString(c);
			System.out.println(s);
			if (i == 0) {
				hash = dec;
			} else {
				hash = hash ^ dec;
			}
		}
		System.out.println(toString((char) (hash)));
		System.out.print(msg);
		System.out.println();
	}
	private static String toString(char c) {
		int dec = Integer.valueOf(c);
		String hex = Integer.toHexString(dec);
		String bin = Integer.toBinaryString(dec);
		bin = String.format("%8s", bin).replace(' ', '0');
		bin = bin.substring(0, 4) + "." + bin.substring(4, bin.length());
		return c + " " + String.valueOf(dec) + " " + hex + " " + bin;
	}

}
