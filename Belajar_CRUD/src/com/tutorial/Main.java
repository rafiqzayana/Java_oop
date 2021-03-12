package com.tutorial;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {

            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1. \tLihat seluruh buku");
            System.out.println("2. \tCari data buku");
            System.out.println("3. \tTambah data buku");
            System.out.println("4. \tUbah data buku");
            System.out.println("5. \tHapus data buku");

            System.out.println("\n\nPilihan Anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n===========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    break;
                case "3":
                    System.out.println("\n===========");
                    System.out.println("TAMBAH BUKU");
                    System.out.println("===========");
                    break;
                case "4":
                    System.out.println("\n===========");
                    System.out.println("UBAH BUKU");
                    System.out.println("=========");
                    break;
                case "5":
                    System.out.println("\n===========");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan,silahkan pilih [1-5]");
            }


            isLanjutkan = getYesorNo("Apakah anda ingin melanjutkan?");

        }

    }

    private static void tampilkanData() throws IOException{
        System.out.println("Data akan ditampilkan disini");

        boolean isTambah  = getYesorNo("Apakah anda ingin menambah data?");

    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (Y/N) ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y")&& !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y/n");
            System.out.print("\n"+message+" (Y/N) ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.err.println("Tidak bisa clearscreen");
        }
    }
}
