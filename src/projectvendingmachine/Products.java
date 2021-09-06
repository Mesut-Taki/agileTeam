package projectvendingmachine;

public class Products {

    /*
            Products=urunler
            Project Algorithm (Pseudo Code)

        1) Hoşgeldiniz mesajı ver

        2) Vending Machine'in kullanım talimatını ver

        3) 10 dollar yatır

        4) Müşterinin parasını göster

        5) Müşteriye Ürünleri ve fiyatını göster (1-10) 6) Müşterinin girdiği urun numarasını al

        Eger urun numarası doğru ise 8. adıma git

        Eger urun numarası yanlış ise 7. adima git 7) Müşteriye yanlış urun numarası girdiğini bildir ve 4. adima git

        8) Secilen urunun fiyatını al

        9) Müşterinin yatirdiği para ile urunun fiyatını karsilastir.

        Para yeterli ise 10. adima git Para yeterli degil ise 13. adıma git

        10) Urun fiyatını müşterinin parasından çıkar

        11) Müşteriye kalan parasını göster

        12) Müşteriye alış verişe devam edip etmeyeceğini sor Eger müşteri evet derse 4. adıma git

        Eger müşteri hayır derse 17. adıma git

        13) Müşteriye para ekleyip eklemeyeceğini sor Eger müşteri evet derse 14. adıma git

        Eger müşteri hayır derse 17. adıma git 14) Ne kadar para ekleyeceğini sor

        15) Müşterinin ekleyeceği miktarı al ve parasına ekle

        16) Müşteriye eklendikten sonraki para miktarını göster ve 5. adima git

        17) Müşteriye kalan parasını göster

        18) Müşteriye iyi günler dile
             */
    private double snicker = 2.5;
    private double chipsAhoy = 2.2;
    private double pringles = 12.99;
    private double milano =14.3;
    private double reeses = 3.9;
    private double cocaCola = 2.2;
    private double fanta = 2.0;
    private double water = 1.0;
    private double arizona = 1.5;
    private double skittles = 1.99;
    private int productNum;
    private double price;


    public double getSnicker() {
        return snicker;
    }

    public double getChipsAhoy() {
        return chipsAhoy;
    }

    public double getPringles() {
        return pringles;
    }

    public double getMilano() {
        return milano;
    }

    public double getReeses() {
        return reeses;
    }

    public double getCocaCola() {
        return cocaCola;
    }

    public double getFanta() {
        return fanta;
    }

    public double getWater() {
        return water;
    }

    public double getArizona() {
        return arizona;
    }

    public double getSkittles() {
        return skittles;
    }

    public int getProductNum() {
        return productNum;
    }

    public double getPrice() {
        return price;
    }

    public void setSnicker(double snicker) {
        this.snicker = snicker;
    }

    public void setChipsAhoy(double chipsAhoy) {
        this.chipsAhoy = chipsAhoy;
    }

    public void setPringles(double pringles) {
        this.pringles = pringles;
    }

    public void setMilano(double milano) {
        this.milano = milano;
    }

    public void setReeses(double reeses) {
        this.reeses = reeses;
    }

    public void setCocaCola(double cocaCola) {
        this.cocaCola = cocaCola;
    }

    public void setFanta(double fanta) {
        this.fanta = fanta;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public void setArizona(double arizona) {
        this.arizona = arizona;
    }

    public void setSkittles(double skittles) {
        this.skittles = skittles;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public String toString() {
        return "Products : " +
                "\n1.Snicker= $" + snicker +
                "\n2.ChipsAhoy= $" + chipsAhoy +
                "\n3.Pringles= $" + pringles +
                "\n4.Milano= $" + milano +
                "\n5.Reeses= $" + reeses +
                "\n6.CocaCola= $" + cocaCola +
                "\n7.Fanta= $" + fanta +
                "\n8.Water= $" + water +
                "\n9.Arizona= $" + arizona +
                "\n10.Skittles= $" + skittles;

    }

    public void setPrice(double price) {
        this.price = price;


    }

}
