package 네트워크프로그램;

import java.net.Socket;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		// 서버랑 클라이언트랑
		// 양쪽에 전화기 역할을 하는 소켓이 있어야함.
		// 클라이언트에서 소켓을 만들어주면, 서버소켓으로
		// 승인요청을 보냄.
		for (int i = 0; i < 5; i++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 승인요청 보냄.!!");
		}
	}
}
