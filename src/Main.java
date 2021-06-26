//import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import java.util.Scanner;
import java.lang.Math;


    public class Main {
        public static void main(String[] args){
            mainmenu();
        }

        public static void mainmenu(){
            System.out.println("Pilih Program Yang Ingin Anda Gunakan");
            System.out.println("1. Menghitung Operasi Antar Dua Bilangan");
            System.out.println("2. Menghitung Logaritma dan Rasio Antar Tiga Bilangan");
            System.out.println("3. Menghitung Biaya Jasa Arsitek");
            System.out.println("4. Menghitung Nilai Akhir dan Grade Mahasiswa"+ "\n");
            System.out.print("silahkan pilih program = ");

            Scanner input = new Scanner(System.in);
            int isian = input.nextInt();

            if (isian == 1){
                Operasihitung.main();
            }
            else if (isian == 2){
                logAndSin.main();
            }
            else if (isian == 3){
                MenghitungJasaArsitek.main();
            }
            else if (isian == 4){
                menghitungNilai.main();
            }
            else {
                System.out.println("Mohon isikan nilai antara 1 - 4 !!");
                mainmenu();
            }
        }

        // NO 1 - Zhakirasakti Desta Kamandaka
        static class Operasihitung {
            public static void main() {
                //Deklarasi
                float angka1,angka2,penjumlahan,pengurangan,perkalian,pembagian,modulus;
                //input
                System.out.print("\n" + "Program Penghitung Operasi" + "\n");
                System.out.print("masukkan angka pertama = ");
                Scanner input1 = new Scanner(System.in);
                angka1 = input1.nextFloat();
                System.out.print("masukkan angka kedua = ");
                Scanner input2 = new Scanner(System.in);
                angka2 = input2.nextFloat();
                //operasi
                penjumlahan = angka1 + angka2;
                pengurangan = angka1 - angka2;
                perkalian   = angka1 * angka2;
                pembagian   = angka1 / angka2;
                modulus     = angka1 % angka2;
                //menampilkan hasil operasi
                System.out.println("Hasil operasi adalah sebagai berikut = ");
                System.out.println("Penjumlahan = " + penjumlahan);
                System.out.println("Pengurangan = " + pengurangan);
                System.out.println("Perkalian   = " + perkalian);
                System.out.println("Pembagian   = " + pembagian);
                System.out.println("Modulus     = " + modulus);
            }
            }

        // NO 2 - Kevin Fajri Mahardhika Amrulloh
        static class logAndSin {
            public static void main() {
                System.out.print("\n" + "Program Penghitung Logaritma dan Rasio" + "\n");
                Scanner input1 = new Scanner(System.in);
                System.out.println("Aplikasi penjumlahan log⏨ 3 bilangan &\npengurangan Sin Cos Tan.\n\nSilakan masukan bilangan anda.");
                System.out.print("Bilangan pertama : ");
                double output1 = input1.nextDouble();

                Scanner input2 = new Scanner(System.in);
                System.out.print("Bilangan kedua : ");
                double output2 = input2.nextDouble();

                Scanner input3 = new Scanner(System.in);
                System.out.print("Bilangan ketiga : ");
                double output3 = input3.nextDouble();

                System.out.println("\nHasil penjumlahan dari log⏨" + "(" + output1 + ")" + " + " + "log⏨" + "(" + output2 + ")" + " + " + "log⏨" + "(" + output3 + ")"  +" = " + (Math.log10(output1) + Math.log10(output2) + Math.log10(output3)));
                System.out.println("Hasil pengurangan dari Cos" + "(" + output1 + ")" + " - " + "Sin" + "(" + output2 + ")" + " - " + "Tan" + "(" + output3 + ")"  +" = " + (Math.cos(output1) + Math.sin(output2) + Math.tan(output3)));
            }
        }

        //NO 3 - Ardellia Zein Rahma Mutiara
        static class MenghitungJasaArsitek {
            public static void main() {

                int luas, harga, luasTanah;
                Scanner scLuasTanah = new Scanner(System.in);

                System.out.print("\n" + "Program Penghitung Jasa Arsitek" + "\n");
                System.out.println("Masukan Luas Tanah");
                luas = scLuasTanah.nextInt();

                luasTanah = luas-50;

                if (luas > 50) {
                    System.out.println("Luas tanah >50 meter");
                    harga = luasTanah * 1500000 + 50000000;

                } else {
                    System.out.println("Luas tanah <=50 meter");
                    harga = 50000000;
                }

                System.out.println("Harga Jasa =  " + "Rp. "+ harga);

            }
        }

        //NO 4 - Rusdy Hafid Baradja & Liwa Alex Saputra
        static class menghitungNilai
        {
            public static void main()
            {
                float total;
                String tp1, tp2, tk1, tk2, kuis1, kuis2, uas;
                Scanner inputTp1 = new Scanner(System.in);
                Scanner inputTp2 = new Scanner(System.in);
                Scanner inputTk1 = new Scanner(System.in);
                Scanner inputTk2 = new Scanner(System.in);
                Scanner inputKuis1 = new Scanner(System.in);
                Scanner inputKuis2 = new Scanner(System.in);
                Scanner inputUas = new Scanner(System.in);

                System.out.print("\n" + "Program Penghitung Nilai Akhir dan Grade" + "\n");
                System.out.print("Masukan nilai Tugas Pribadi 1 (TP1) ...");
                tp1 = inputTp1.nextLine();
                while ( !isNumeric(tp1) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Pribadi 1 (TP1) kembali ...");
                    tp1 = inputTp1.nextLine();
                }

                System.out.print("Masukan nilai Tugas Pribadi 2 (TP2) ...");
                tp2 = inputTp2.nextLine();
                while ( !isNumeric(tp2) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Pribadi 2 (TP2) kembali ...");
                    tp2 = inputTp2.nextLine();
                }

                System.out.print("Masukan nilai Tugas Kelompok 1 (TK1) ...");
                tk1 = inputTk1.nextLine();
                while ( !isNumeric(tk1) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Kelompok 1 (TK1) kembali ...");
                    tk1 = inputTk1.nextLine();
                }

                System.out.print("Masukan nilai Tugas Kelompok 2 (TK2) ...");
                tk2 = inputTk2.nextLine();
                while ( !isNumeric(tk2) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Kelompok 2 (TK2) kembali ...");
                    tk2 = inputTk2.nextLine();
                }

                System.out.print("Masukan nilai Kuis 1 ...");
                kuis1 = inputKuis1.nextLine();
                while ( !isNumeric(kuis1) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai Kuis 1 kembali ...");
                    kuis1 = inputKuis1.nextLine();
                }

                System.out.print("Masukan nilai Kuis 2 ...");
                kuis2 = inputKuis2.nextLine();
                while ( !isNumeric(kuis2) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai Kuis 2 kembali ...");
                    kuis2 = inputKuis2.nextLine();
                }

                System.out.print("Masukan nilai UAS ...");
                uas = inputUas.nextLine();
                while ( !isNumeric(uas) )
                {
                    System.out.print("Nilai mengandung huruf, harap masukkan nilai UAS kembali ...");
                    uas = inputUas.nextLine();
                }

                total = calculateScore(15, Float.parseFloat(tp1)) + calculateScore(15, Float.parseFloat(tp2)) + calculateScore(10, Float.parseFloat(tk1)) +
                        calculateScore(10, Float.parseFloat(tk2)) + calculateScore(10, Float.parseFloat(kuis1)) + calculateScore(10, Float.parseFloat(kuis2)) + calculateScore(30, Float.parseFloat(uas));

                if (total >= 85)
                {
                    System.out.println("Mahasiswa mendapat grade A");
                }
                else if (total >= 75 & total < 85)
                {
                    System.out.println("Mahasiswa mendapat grade B");
                }
                else if (total >= 65 & total < 75)
                {
                    System.out.println("Mahasiswa mendapat grade C");
                }
                else if (total >= 50 & total < 65)
                {
                    System.out.println("Mahasiswa mendapat grade D");
                }
                else
                {
                    System.out.println("Mahasiswa mendapat grade E");
                }
                System.out.println("Nilai Mahasiswa ... " + String.format("%.02f", total));
            }
            public static boolean isNumeric(String strNum)
            {
                if (strNum == null)
                {
                    return false;
                }
                try
                {
                    Double.parseDouble(strNum);
                }
                catch (NumberFormatException nfe)
                {
                    return false;
                }
                return true;
            }
            public static float calculateScore(int counter, float score)
            {
                float d = 0;
                try
                {
                    d = (score * (float)(counter/100.0));
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("Error saat menghitung nilai");
                }
                return d;
            }
        }
        } //here





