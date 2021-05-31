package study.oop.basic;

public interface OrderAcceptance {
	
	//商品紹介を受け付けて、取扱商品の一覧を返す。
	public String[] queryItems();
	//注文を受け付けて、受注可否を返す。
	public boolean order(String item);
	//注文を確定させ、問い合わせ番号を返す。
	public String confirm(String name, String address);


}
