// 12S24055 - Theresia OKtaviani Samosir
// 12S24016- Boy Harendy Simamora

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasi();
    }
    
    public static void inisialisasi() {
        String[] nama = new String[5];
        int i, x;
        String n;

        n = "benar";
        i = 0;
        func_input(nama);
    }
    
    public static void func_input(String[] nama) {
        String n;
        int i, x, k;

        n = "benar";
        i = 0;
        while (n.equals("benar")) {
            nama[i] = input.nextLine();
            if (i == 3) {
                n = "salah";
            } else {
                n = "benar";
            }
            if (nama[i].equals("---")) {
                n = "salah";
            } else {
                i = i + 1;
            }
        }
        x = i;
        output(nama, i, x);
    }
    
    public static void output(String[] nama, int i, int x) {
        x = i;
        for (i = 0; i <= x - 1; i++) {
            System.out.println(nama[i]);
        }
    }
}
