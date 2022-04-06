package com.sda.arppl2.methodology;

public class Main {
    public static void main(String[] args) {

        System.out.println("Zadanie 1 wykonane!");
        Osoba person = new Osoba("Marian", "Kowalski");
        System.out.println(person.imie+person.nazwisko);
        Osoba person2 = new Osoba("Adrian", "Roztocki");
        Osoba person3 = new Osoba("Hugo", "Kołątaj");
        Osoba person4 = new Osoba("Alicja", "Wkrainieczarów");
        Osoba person5 = new Osoba("Dagmara", "Drakula");
    }
}
