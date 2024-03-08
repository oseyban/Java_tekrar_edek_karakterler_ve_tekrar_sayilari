package org.example;

import java.util.HashMap;
import java.util.Map;

public class TekrarEdenKarakterler {

    public static void main(String[] args) {
        String metin = "merhaba";

        Map<Character, Integer> karakterSayilari = new HashMap<>();


        for (char w : metin.toCharArray()) {
            karakterSayilari.merge(w, 1, Integer::sum);
        }

        karakterSayilari.forEach((karakter, tekrarSayisi) -> {
            if (tekrarSayisi > 1) {
                System.out.println("Karakter: " + karakter + ", Tekrar Sayısı: " + tekrarSayisi);
            }
        });
    }
}
