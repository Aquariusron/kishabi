package test.sort;

public class Sample2 {

	public static void main(String[] args) {
		/*2017.07.25
		 * ソート練習第2段
		 * ・乱数生成はなし
		 * ・配列を使ってマージソートの練習
		 * ・まずは処理をべた書き
		 */

		//配列を生成
		int[] array = new int[8];
		//eclipseで怒られるメソッド宣言
		public void sortNumbers2 ( int[] hairetsu ) {

			try {
				//配列の初期化
				array = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];

				//一応ぷりんと
				System.out.println( array );

				//保持用配列
				int[] smallArray;
				int[] bigArray;
				 //配列を÷2、比較、÷2のイメージ
				//iとjでインデックス用のfor文を回す
				for(int i = 0; i < 5; i++) {
					for(int j = 5; j < array.length; j++) {
						//比較
						if(array[i] < array[j]) {
							//代入
							bigArray[0] = array[j];
							smallArray[0] = array[i];
						} else {
							bigArray[0] = array[i];
							smallArray[0] = array[j];
						}
					}
				}

				//上の処理で配列が2つに割れたので、さらに各々の配列内で比較を繰り返す。
				//メソッドわけした方が見やすいし無駄が省かれるかも

				//保持用配列
				int[] sArray;
				int[] bArray;
				//smallArray内での処理
				for(int i = 0; i < 2; i++) {
					for(int j = 2; j < smallArray.length; j++) {
						//比較
						if(smallArray[i] < smallArray[j]) {
							//代入
							sArray[0] = smallArray[j];
							bArray[0] = smallArray[i];
						} else {
							sArray[0] = smallArray[i];
							bArray[0] = smallArray[j];
						}
					}
				}

				//保持用配列
				int[] ssArray;
				int[] bbArray;
				//bigArray内での処理
				for(int i = 0; i < 2; i++) {
					for(int j = 2; j < bigArray.length; j++) {
						//比較
						if(bigArray[i] < bigArray[j]) {
							//代入
							ssArray[0] = bigArray[j];
							bbArray[0] = bigArray[i];
						} else {
							ssArray[0] = bigArray[i];
							bbArray[0] = bigArray[j];
						}
					}
				}
				/*
				 * イメージ的にはここまででsArray = 1,2
				 * bArray = 3,4
				 * ssArray = 5,6
				 * bbArray = 7,8,9の配列がそれぞれ出来ているようにしたい
				 */

				return;

			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}

		}

	}

}
