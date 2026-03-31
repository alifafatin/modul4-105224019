package modull4.LatihanModul4;

class mesinKopi{
    //nomor1
    float bijiKopi;
    float air;
    float susu;

    //nomor4
    public mesinKopi(){
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }


//nomor 2
public mesinKopi(float bijiKopi, float air, float susu) {
    this.bijiKopi = bijiKopi;
    this.air = air;
    this.susu = susu;
}

public void isiUlangBahan (float bijiKopiUpdate, float airUpdate, float susuUpdate) {
    this.bijiKopi = bijiKopiUpdate;
    this.air = airUpdate;
    this.susu = susuUpdate;
}

//nomor3
public boolean cekKetersediaanCappuccino(){
    if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
        return true;
    } else {
        return false;
    }
}

}
public class main {
    public static void main(String[] args) {
        mesinKopi mesin =  new mesinKopi();

        mesin.isiUlangBahan(20, 100, 200);

        boolean ketersediaanCappuccino = mesin.cekKetersediaanCappuccino();
        System.out.println("Ketersediaan Cappuccino: " + ketersediaanCappuccino);

    }
}
