package com.example.modul2;

public class OrderFoto {
    private KatalogFoto KatalogFoto;
    private String ukuran;
    private int numOrder;
    private double hargaSubtotal;

    public OrderFoto(KatalogFoto _katalogFoto, int _numOrder, String _ukuran, double _hargaSubtotal){
        KatalogFoto = _katalogFoto;
        setNumOrder(_numOrder);
        ukuran = _ukuran;
        setHargaSubtotal(_hargaSubtotal);
    }

    public KatalogFoto getKatalogFoto(){
        return KatalogFoto;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public String getUkuran() {
        return ukuran;
    }

    public double getHargaSubtotal() {
        return hargaSubtotal;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public void setHargaSubtotal(double hargaSubtotal) {
        this.hargaSubtotal = hargaSubtotal;
    }
}
