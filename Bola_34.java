package TugasPraktikum;

public class Bola_34 {
    private double jariJari;

    public Bola_34(){
        this.jariJari = 0.0;
    }

    public void  setJariJari(double jariJari){
        if (jariJari > 0 ){
        }
        else{
            System.out.println("Jari-jari harus lebih dari 0. ");
        }
    }

    public double showDiameter(){
        return 2* jariJari;
    }

    public double showLuasPermukaan(){
        return 4 * Math.pow(jariJari,2);
    }
    public double showVolume(){
        return(4/3) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        //Langkah 1: membuat variable jariJari
        double jariJariVariable = 0.5;

        //Langkah 2: menciptakan objek bola
        Bola_34 bolaObjek = new Bola_34();

        //Langkah 3: memanggil method showDiameter(), showLuasPermukaan(), diameterVolume()
        System.out.println("Diameter: "+bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: "+bolaObjek.showLuasPermukaan());
        System.out.println("Volume: "+bolaObjek.showVolume());

        //Langkah 4: memanipulasi objek dg memanggil method jariJari()
        bolaObjek.setJariJari();

        //Langkah 5: menampilakn hasil setelah memanipulasi
        System.out.println("\n Setelah memanipulasi: ");
        System.out.println("Diameter: "+bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: "+bolaObjek.showLuasPermukaan());
        System.out.println("Volume: "+bolaObjek.showVolume());
    }
}
