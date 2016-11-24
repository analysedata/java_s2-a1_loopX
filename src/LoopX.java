
public class LoopX {

	public static void main(String[] args) {
		for (int x = 0; x < 5; x++) {
			String indentFormat1 = "%10s";
			String indentFormat2 = "%11s";
			String indentFormat3 = "%13s";
			
			if (x == 0) {
				format1(indentFormat1);
			} else if (x == 1) {
				format2(indentFormat2);
			} else if (x == 2) {
				format3(indentFormat3);
			} else if (x == 3) {
				format2(indentFormat2);
			} else if (x == 4) {
				format1(indentFormat1);
			}
		}
	}
	
	public static void format1 (String x) {
		System.out.format(x, "*");
		System.out.print("_______");
		System.out.print("*\n");
		
		// Less code but not exactly as given image:
		// System.out.format(x + " %1s %1s", "*", "_________", "*\n");
	}
	
	public static void format2 (String y) {
		System.out.format(y, "__");
		System.out.print("*");
		System.out.print("___");
		System.out.print("*\n");
		
		// Less code but not exactly as given image:
		// System.out.format(y + " %1s %1s %1s", "__", "*", "___", "*\n");
	}
	
	public static void format3 (String z) {
		System.out.format(z, "____");
		System.out.print("*\n");
		
		// Less code but not exactly as given image:
		// System.out.format(z + " %3s", "____", "*\n");
	}

}
