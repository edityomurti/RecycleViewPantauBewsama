package com.example.hanifsugiyanto.card;

/**
 * Created by hanifsugiyanto on 04/11/15.
 */

    class Kandidat {
        String namaCalon1;
        String namaCalon2;
        String namaCalon3;
        String namaCalon4;
        String namaWakil1;
        String namaWakil2;
        String namaWakil3;
        String namaWakil4;
        int fotoCalon1;
        int fotoCalon2;
        int fotoCalon3;
        int fotoCalon4;
        int fotoWakil1;
        int fotoWakil2;
        int fotoWakil3;
        int fotoWakil4;
        String namaJabatan;
        String daerahJabatan;
        String daerahUplevel;
        String jmlPengamat;
        String jmlPengawas;
        String jmlSaksi;

        Kandidat(String namaJabatan, String daerahJabatan, String daerahUplevel,
                 int fotoCalon1, int fotoWakil1, String namaCalon1, String namaWakil1,
                 int fotoCalon2, int fotoWakil2, String namaCalon2, String namaWakil2,
                 int fotoCalon3, int fotoWakil3, String namaCalon3, String namaWakil3,
                 int fotoCalon4, int fotoWakil4, String namaCalon4, String namaWakil4,
                 String jmlPengamat, String jmlPengawas, String jmlSaksi) {
            this.namaJabatan = namaJabatan;
            this.daerahJabatan = daerahJabatan;
            this.daerahUplevel = daerahUplevel;
            this.jmlPengamat = jmlPengamat;
            this.jmlPengawas = jmlPengawas;
            this.jmlSaksi = jmlSaksi;
            this.namaCalon1 = namaCalon1;
            this.namaCalon2 = namaCalon2;
            this.namaCalon3 = namaCalon3;
            this.namaCalon4 = namaCalon4;
            this.namaWakil1 = namaWakil1;
            this.namaWakil2 = namaWakil2;
            this.namaWakil3 = namaWakil3;
            this.namaWakil4 = namaWakil4;
            this.fotoCalon1 = fotoCalon1;
            this.fotoCalon2 = fotoCalon2;
            this.fotoCalon3 = fotoCalon3;
            this.fotoCalon4 = fotoCalon4;
            this.fotoWakil1 = fotoWakil1;
            this.fotoWakil2 = fotoWakil2;
            this.fotoWakil3 = fotoWakil3;
            this.fotoWakil4 = fotoWakil4;
        }
    }
