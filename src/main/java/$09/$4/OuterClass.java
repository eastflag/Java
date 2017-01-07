package $09.$4;

public class OuterClass {

	public static void main(String[] args) {
		
		setOnClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Clicked");
			}
		});
	}
	
	public static void setOnClickListener(ClickListener l) {
		l.onClick();
	}

}

interface ClickListener {
	void onClick();
}