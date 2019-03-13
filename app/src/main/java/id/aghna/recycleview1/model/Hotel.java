package id.aghna.recycleview1.model;

import android.graphics.drawable.Drawable;

public class Hotel {
    public String judul, deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
