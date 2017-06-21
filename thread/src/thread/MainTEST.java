package thread;
public class MainTEST {
	public static void main(String[] args){
		MainTEST mt = new MainTEST();
		//새 스텍을 생성 스텍위에 run()
		MyThead t2 = new MyThead();
		t2.start(); //t2가 새로운 스택을 생성 후에 run() 로딩 후 끝 
		mt.printA();
		
	}
	public void printA(){
		for(int i=0; i<100; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("A");
		}
	}
	public void printB(){
		for(int i=0; i<100; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("B");
		}
	}
}
class MyThead extends Thread{
	public void run() {
	MainTEST mt = new MainTEST();
	mt.printB();
	}
}