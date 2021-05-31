package study.oop.basic;

public class DeliveryManager implements Delivery, CargoTracking {

	@Override
	public String track(String queryNo){
		
		return "お問い合わせの貨物は倉庫から出荷されました。";
	}

	@Override
	public String deliver(String name, String address, String item) {
		// TODO 自動生成されたメソッド・スタブ
		return "000000000";
	}

}
