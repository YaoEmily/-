
public class Client {

	public static void main(String[] args) {
		TextView textView = new TextView("�ı���");
		FancyBorder fancyTextView = new FancyBorder(textView,"��Fancy�߿���ı���");
		HorzScrollbar horzFancyTextView = new HorzScrollbar(fancyTextView,"��horz��������Fancy�߿���ı���");
	}

}
