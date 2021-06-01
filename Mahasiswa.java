public class Mahasiswa{
	// Menginisialisasi variabel
	private String nim;
	private String nama;
	private String alamat;
	private String prodi;
	private String noTelepon;

	public Mahasiswa(){

	}

	public Mahasiswa(String nim, String nama, String alamat, String prodi){
		this.nim = nim;
		this.nama = nama;
		this.alamat = alamat;
		this.prodi = prodi;
	}

	public void setNim(String nim){
		this.nim = nim;
	}

	public String getNim(){
		return this.nim;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return this.nama;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return this.alamat;
	}

	public void setProdi(String prodi){
		this.prodi = prodi;
	}

	public String getProdi(){
		return this.prodi;
	}
}
