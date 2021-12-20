public abstract class Karyawan {
  private int nip;
  private String nama;
  private String alamat;
  private int nomor;

  public Karyawan(int nip, String nama, String alamat, int nomor) {
    this.nip = nip;
    this.nama = nama;
    this.alamat = alamat;
    this.nomor = nomor;
  }

  public int getNip() {
    return nip;
  }

  public String getName() {
    return nama;
  }

  public String getAdress() {
    return alamat;
  }

  public int getNumber() {
    return nomor;
  }
}

/* file : Gaji.java */
class Pegawai extends Karyawan {

  public Pegawai(int nip, String nama, String alamat, int nomor) {
    super(nip, nama, alamat, nomor);
    setInfo(nip, nama, alamat, nomor);
  }

  public void setInfo(int nip, String nama, String alamat, int nomor) {
    System.out.println("===================");
    System.out.println("NIP:" + nip);
    System.out.println("Nama:" + nama);
    System.out.println("Alamat:" + alamat);
    System.out.println("Nomor:" + nomor);
  }
}

/* File : ViertualDemo.java */
class result {
  public static void main(String args[]) {
    System.out.println("===================");
    System.out.println("|| Info Pegawai ||");
    Pegawai P1 = new Pegawai(12321,"Test Mohtashim", "Ambehta, UP", 6546785);
    Pegawai P2 = new Pegawai(12312,"Jhon Test", "Boston, MA", 6546785);
  }
}
