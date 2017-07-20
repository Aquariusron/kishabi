package test.sort;

public class sample1 {

	public static void main(String[] args) {

		    //ソートの要素が微塵もない更新する度に乱数ができて比較するだけのメソッド
		    //使用するアルゴリズムと値の保持について考える
		    //2017.07.20

		//比較用の数字を用意
        	int num;
        	int otherNum;
        	int maxNum;

		    public void sampleMethod(int number, int secondNum) {

		        //配列を用意
		        //int[] number = new int[9];

		        //乱数で１〜９を用意
		        num = (int)(Math.random()*10);
		        otherNum = (int)(Math.random()*10);

		        //乱数が０だったら条件外なので処理抜け
		        if(num == 0 || otherNum == 0) {
		            return;
		        }

		        //乱数が被ったら処理抜け
		        if(!(num == otherNum)) {
		            return;
		        }

		        //大小比較
		        if(num < otherNum) {
		            maxNum = otherNum;
		            System.out.print(num + "<" + maxNum);
		        } else {
		            maxNum = num;
		            System.out.print(otherNum + "<" + maxNum);
		        }

		    }



	}

}
