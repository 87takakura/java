package study.oop.basic;

public interface Delivery {
	//配送指示を受けて問い合わせ番号を返す
	public String deliver(String name, String address, String item);

}
