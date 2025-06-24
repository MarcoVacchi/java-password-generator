package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        String firstName;
        String surName;
        String color;
        int dayOfBirth;
        int monthOfBirth;
        int ageOfBirth;

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome ");
        firstName = input.nextLine();

        System.out.print("Inserisci il tuo cognome ");
        surName = input.nextLine();

        System.out.print("Inserisci il tuo colore preferito ");
        color = input.nextLine();

        Scanner dateOfBirth = new Scanner(System.in);

        System.out.print("Inserisci il giorno di nascita ");
        dayOfBirth = dateOfBirth.nextInt();

        System.out.print("Inserisci il mese di nascita ");
        monthOfBirth = dateOfBirth.nextInt();

        System.out.print("Inserisci l'anno di nascita ");
        ageOfBirth = dateOfBirth.nextInt();

        dateOfBirth.close();
        input.close();

        int datePass = dayOfBirth + monthOfBirth + ageOfBirth;
        String password = firstName + surName + color + datePass;

        System.out.println("la tua nuova password è: " + password);

    }
}

// Attività richieste:
// - Create un nuovo progetto java chiamato java-password-generator
// - Aggiungete un package org.lessons.java.security
// - Aggiungete una classe PasswordGenerator che contenga un metodo main

// Il programma deve fare quanto segue:
// - Salvare in opportune variabili il nome, cognome, colore preferito e data di
// nascita di un utente suddivisa in giorno, mese e anno in numero
// - Generare (e stampare a video) una password concatenando nome, cognome,
// colore preferito e somma di giorno, mese e anno di nascita, separate dal
// carattere -

// Esempio:
// Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore
// preferito è il magenta. La sua password sarà Pinco-Pallo-magenta-2011
