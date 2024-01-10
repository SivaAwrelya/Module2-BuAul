package TugasPraktikum;

public class TestBus_34 {
    public static void main(String[] args) {
        //TODO code application logic here
        Bus_34 busMini=new Bus_34(10);
        busMini.addpenumpang(5);
        busMini.addpenumpang(6);
        busMini.getPenumpang(10);
        busMini.getPenumpang(15);

        busMini.getAvarage();
        busMini.cetak();
    }
}
