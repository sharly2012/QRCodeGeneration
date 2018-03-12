public class Test {

	public static void main(String[] args) throws Exception {
		String text = "http://www.dans88.com.cn";
		QRCodeUtil.encode(text, "", "/Users/admin/test", true);
	}

	// public static void main(String[] args) throws Exception {
	// String text = "http://www.dans88.com.cn";
	// QRCodeUtil.encode(text, "/Users/admin/test/my180.jpg", "/Users/admin/test",
	// true);
	// }
}
