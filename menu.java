import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class menu{
	public static void main(String[] args) {
		List<Mahasiswa> ListMhs;
		ListMhs = new ArrayList<>();
		int tanya = 0;
		int d_index_e = 0;
		int d_index_h = 0;
		Scanner key1,key2;

		while (tanya != 5) {

			System.out.println("\n\nMENU");
			System.out.println("===============");
			System.out.println("1. Tambah Data");
			System.out.println("2. Ubah Data");
			System.out.println("3. Hapus Data");
			System.out.println("4. Tampilkan Daftar Mahasiswa");
			System.out.println("5. Slesai.\n\n");

			key1 = new Scanner (System.in);
			key2 = new Scanner (System.in);

			System.out.print("Pilih Menu (1/2/3/4/5)");
			tanya = key1.nextInt();

			System.out.print("\n");
			if ( tanya == 1) {
				Mahasiswa m = new Mahasiswa();
				key2 = new Scanner (System.in);
				System.out.println("Tambah Data Mahasiswa :");
				System.out.print("Nim : ");
				m.setNim(key2.nextLine());
				System.out.print("Nama : ");
				m.setNama(key2.nextLine());
				System.out.print("Alamat : ");
				m.setAlamat(key2.nextLine());
				System.out.print("Prodi : ");
				m.setProdi(key2.nextLine());

				ListMhs.add(new Mahasiswa (m.getNim(), m.getNama(), m.getAlamat(), m.getProdi()));

			} else if ( tanya == 2 ) {
				// Ubah data
				Mahasiswa m3 = new Mahasiswa();
				System.out.print("Ubah Data (Masukan Index) : ");
				d_index_e = key1.nextInt();
				System.out.println("Masukan Data Baru:");
				System.out.print("Nim : ");
				m3.setNim(key2.nextLine());
				System.out.print("Nama : ");
				m3.setNama(key2.nextLine());
				System.out.print("Alamat : ");
				m3.setAlamat(key2.nextLine());
				System.out.print("Prodi : ");
				m3.setProdi(key2.nextLine());


				ListMhs.set(d_index_e,new Mahasiswa(m3.getNim(), m3.getNama(), m3.getAlamat(), m3.getProdi()));

				System.out.print("Data Index ke : " + d_index_e + " Berhasil Di Ubah");
			} else if ( tanya == 3 ) {
				// Hapus Data
				System.out.print("Hapus Data (Masukan Index) : ");
				d_index_h = key2.nextInt();

				ListMhs.remove(d_index_h);

				System.out.print("Data Index ke : " + d_index_h + " Berhasil Di Hapus");
			} else if ( tanya == 4 ) {

				int total_data = ListMhs.size();
				System.out.println("Daftar Mahasiswa\n");
				int mke = 0;
				for(Mahasiswa obj : ListMhs){

					System.out.println("Mahasiswa Index ke : " + mke);
           			System.out.println("Nim : "+obj.getNim());
           			System.out.println("Nama : "+obj.getNama());
           			System.out.println("Alamat : "+obj.getAlamat());
           			System.out.println("Prodi : "+obj.getProdi());
           			System.out.println("\n");
           			mke++;
        		}
			}

		}

		System.out.println("\n\nBerhasil Keluar");
	}
}
