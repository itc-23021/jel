// s23021
// d48Q22のコードをコンパイルエラーしないように修正
enum Connection {OFFLINE, ONLINE}
class d48Q22kadai {
		public static void main(String[] args) {
				Connection s = Connection.OFFLINE;
				if (s == Connection.OFFLINE) {
				   s = Connection.ONLINE;
				}
				System.out.print(s);
		}
}
