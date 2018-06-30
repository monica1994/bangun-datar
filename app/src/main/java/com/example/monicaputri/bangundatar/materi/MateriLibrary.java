package com.example.monicaputri.bangundatar.materi;

import com.example.monicaputri.bangundatar.R;

public class MateriLibrary {

    /*
    index(0) = Persegi
    index(1) = Persegi Panjang

    */
    private int imgBangunDatars[] = {
            R.drawable.ic_folder_open_black_24dp,
            R.drawable.ic_exit_to_app_black_24dp,
    };

    private String sifats[] = {
            "- Memiliki 4 sudut \n- 4 sisi sama panjang",
            "- Memiliki 4 sudut \n- 2 pasang sisi sama panjang"
    };

    private int formulas[] = {
            R.drawable.ic_exit_to_app_black_24dp,
            R.drawable.ic_exit_to_app_black_24dp,
    };

    public int getImageBangunDatar (int index){
      int imageBangunDatar = imgBangunDatars[index];
      return imageBangunDatar;
    };

    public String getSifat (int index){
        String sifat = sifats[index];
        return sifat;
    };

    public int getFormula (int index){
        int formula = formulas[index];
        return formula;
    };

}
