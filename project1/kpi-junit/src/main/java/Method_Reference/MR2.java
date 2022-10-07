package Method_Reference;

public class MR2 {
	public static void ThreadStatus() {
		System.out.println("Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(MR2::ThreadStatus);
		t2.start();

	}

}
