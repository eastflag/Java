package $Ex;
public class Ex7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		
		for(int i=0; i < CARD_NUM ; i++){
			int num = i%10 + 1;
			
			if( (i < 10) && (num == 1 || num == 3 || num==8) )
				cards[i] = new SutdaCard(num, true);
			else
				cards[i] = new SutdaCard(num, false);
		}
		
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}