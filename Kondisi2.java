public class Kondisi2
{
	public void accept()
	{
		System.out.println("Selamat, Kamu Berhasil");
	}

	public void reject()
	{
		System.out.println("Maaf, Kamu Tidak Berhasil");
	}

	public static void main(String [] args){
		Kondisi2 test = new Kondisi2();
		int score = 900;
		int income = 200000;
		boolean authorized = true;

		if((score > 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000))
			test.reject();
		else
			test.accept();
	}
}

