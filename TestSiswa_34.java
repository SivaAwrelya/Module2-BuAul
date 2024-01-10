package Latihan3;

public class TestSiswa_34 {
    public static void main(String[] args) {
        
        EncapSiswa_34 siswa = new EncapSiswa_34();
        siswa.setName("agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("nama: "+siswa.getName()+" alamat "+siswa.getAddress()+" berumur "+siswa.getAge()+" tahun ");
    }
}
