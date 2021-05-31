package study.oop.basic;
//注文受付契約
public interface CargoTracking {
 //問い合わせ番号を受け付けて、配送状況を返す
	public String track(String querNo);
}
