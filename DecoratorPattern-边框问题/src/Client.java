
public class Client {

	public static void main(String[] args) {
		TextView textView = new TextView("文本框");
		FancyBorder fancyTextView = new FancyBorder(textView,"带Fancy边框的文本框");
		HorzScrollbar horzFancyTextView = new HorzScrollbar(fancyTextView,"带horz滚动条和Fancy边框的文本框");
	}

}
