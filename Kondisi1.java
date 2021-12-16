public class Kondisi1
{
	public void accept()
	{
		System.out.println("Selamat, Kamu Berhasil");
	}

	public void reject()
	{
		System.out.println("Maaf, Tidak Berhasil");
	}

	public static void main(String [] args){
		Kondisi1 test = new Kondisi1();
		int score = 900;
		int income = 200000;
		boolean authorized = true;

		if (score > 700)
			test.accept();
		else if(((income >= 40000) && (income <= 100000)) && authorized && (score > 500))
			test.accept();
		else if(income > 100000)
			test.accept();
		else 
			test.reject();
	}
}

