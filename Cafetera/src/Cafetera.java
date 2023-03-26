public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Cafetera() {
    }

    public Cafetera(int agua, int cafe, int crema, int vasos) {
        if (agua >= 1 && agua <= 2000 && cafe >= 1 && cafe <=1000 && crema >= 1 && crema <= 1500 && vasos >=1 && vasos <= 50){
            System.out.println("Aún hay ingredientes");
        }
        else {
            System.out.println(" la cafetera no acepta esta cantidad de ingredientes");
        }
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if(cafe == 0){
            System.out.println("Se ha acabado el café");
        }
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if(crema == 0){
            System.out.println("Se ha acabado la crema");
        }
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if(getVasos() == 0){
            System.out.println("Se han acabado los vasos");
        }
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public int servirAmerican() {
        if (getAgua() >= 180 && getCafe() >= 15 && getVasos() >= 1) {
            System.out.println("Se está haciendo un americano");
            this.agua = this.agua - 180;
            this.cafe = this.cafe - 15;
            this.vasos = this.vasos - 1;
        }
        else {
            System.out.println("No es posible hacer más americanos");

        }
        return 0;
    }
    public int servirCapuccino() {
        if (getAgua() >= 100 && getCafe() >= 14 && getCrema() >= 70 && getVasos() >= 1) {
            System.out.println("Se está haciendo un capuchino");
            this.agua = this.agua - 100;
            this.cafe = this.cafe - 70;
            this.vasos = this.vasos - 1;
        }
        else {
            System.out.println("No es posible hacer más capuchinos");
        }
        return 0;
    }
    public int servirExpresso() {
        if (getAgua() >= 120 && getCafe() >= 20 && getVasos() >= 1) {
            System.out.println("Se está haciendo un expresso");
            this.agua = this.agua - 120;
            this.cafe = this.cafe - 20;
            this.vasos = this.vasos - 1;
        }
        else {
            System.out.println("No es posible hacer más expressos");
        }
        return 0;
    }
}
