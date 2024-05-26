
public class third {

	public static void main(String[] args) {
		//【問1】 基本問題
		//1から10までの整数の合計を計算し、その結果を表示するプログラムをforループを使用して作成してください
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			
		}System.out.println("1から１０までの輪の合計:" + sum);
		System.out.println("");
		
		
		
		//【問2】九九
		//九九を表示するプログラムを作成してください
		for(int i = 1; i <= 9; i++) {
			for(int j =1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//【問3】階段
		//添付されている「階段」を出力するようなプログラムを作成してください
		for(int i = 0; i <= 4; i++) {
			for(int j =0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");	
		}
		System.out.println("");
		
		//【問4】ピラミッド
		int max = 5;
		String a = "*";
		
		for (int i = 0; i < max; i++) {
			for(int j =0; j<max-i; j++) {
				System.out.print(" ");
			}
			for(int K = 0; K <= (i*2); K++) {
				System.out.print(a);
			}
			System.out.println("\n");
		}

	}

}
