interface PhoneInterface2{
	final int TIMEOUT=10000;
	void senCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**phone**");
	}
}
interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	public void play();
	public void stop();
}
class PDA{
	public int calculate(int x,int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void senCall() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�Ծ��");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���ǿ����մϴ�.0");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�����ߴ��մϴ�.0");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("���ڰ��ϴ�.0");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("���ڿԾ��");
	}
	
	public void schedule() {
		System.out.println("���������մϴ�.");
	}
	
}
public class InterfaceWithExtendsEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.senCall();
		phone.play();
		System.out.println("3��5�� ���ϸ�"+phone.calculate(3, 5));
		phone.schedule();

	}

}
