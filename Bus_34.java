package TugasPraktikum;

public class Bus_34 {
    private double penumpang, maxPenumpang, counter, penumpangBaru;

    //konstruktor
    public Bus_34(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter  = 0;
        penumpangBaru = 0;
    }

    //method mutator
    public void addpenumpang(double penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if(temp>=maxPenumpang){
            System.out.println("Overload penumpang");
        }
        else{
            this.penumpang=temp;
            counter++;
            penumpangBaru += penumpang;
        }
    }
    public void getPenumpang(double penumpang){
        double temp;
        temp = (double) this.penumpang - penumpang;
        if(temp < 0){
            System.out.println("Jumlah penumpang tidak bisa kurang dari 0");
        }
        else{
            this.penumpang = temp;
            counter--;
            penumpangBaru -= penumpang;
        }
    }

    public double getAvarage(){
        if (counter == 0){
            return 0;
        }
        else{
            return penumpangBaru/counter;
        }
    }

    public void cetak(){
        System.out.println("Penumpang sekarang: "+penumpang);
        System.out.println("Penumpang: seharusnya adalah: "+maxPenumpang);
        System.out.println("Rata-rata berat penumpang = "+getAvarage());
    }
}
