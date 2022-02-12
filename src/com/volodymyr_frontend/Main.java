package com.volodymyr_frontend;

import java.util.Arrays;

public class Main {
    private static final String Name = "Volodymyr";
    private static final String LastName = "Melnyk";
    private static final String FatherName = "Oleksiyovych";

    private static final String BirthDate = "25.07";
    private static final String BirthYear = "2003";
    private static final String BirthCity = "Zmerynka";


    public static void main(String[] args) {

        // Task 1
        char[] universityAndSpeciality = {
                'N', 'a', 't', 'i', 'o', 'n', 'a', 'l', ' ',
                'f', 'o', 'r', 'e', 's', 't', 'r', 'y', ' ',
                'u', 'n', 'i', 'v', 'e', 'r', 's', 'i', 't', 'y', ' ',
                'o', 'f', ' ', 'U', 'k', 'r', 'a', 'i', 'n', 'e', ' ',

                'Д', 'К', 'Т', 'Д', ' ',

                'C', 'S', '-', '2', '1', '/', '2', ' ',

                'C', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ',
                'S', 'c', 'i', 'e', 'n', 'c', 'e'
        };

        // Task 2
        String speciality = new String(universityAndSpeciality).substring(53);
        System.out.println(speciality);

        // Task 3
        String specialityReversed = new String(new StringBuffer(speciality).reverse());
        System.out.println(specialityReversed);

        // Task 4
        String specialityUpper = speciality.toUpperCase();
        System.out.println("Is string 1 and 3 equals: " + speciality.equals(specialityUpper));

        // Task 5
        System.out.println(new String(universityAndSpeciality).substring(40, 44));

        // Task 6
        String specialityPlusSpecialityUpper = speciality + specialityUpper;
        System.out.println(specialityPlusSpecialityUpper);

        // Task 7
        char searchLetter = 'e';
        int firstIndex = speciality.indexOf(searchLetter);
        int lastIndex = speciality.lastIndexOf(searchLetter);

        System.out.print("firstIndex = " + firstIndex + "\tlastIndex = " + lastIndex);

        // Task 8
        String pib = LastName + " " + Name + " " + FatherName;

        StringBuffer volodymyr = new StringBuffer(
                pib + ", " + BirthDate + "." + BirthYear
        );

        System.out.println("\n\n" + volodymyr);

        // Task 9
        int dateIndex = volodymyr.indexOf(BirthDate);

        volodymyr.delete(dateIndex, dateIndex + BirthDate.length() + 1);
        System.out.println(volodymyr);

        // Task 10
        volodymyr.append(" " + BirthCity);
        System.out.println(volodymyr);

        // Task 11
        volodymyr.insert(volodymyr.indexOf(BirthYear) + BirthYear.length(), " Male");
        System.out.println(volodymyr);

        // Task 12
        System.out.println("Characters - " + volodymyr.length());
        System.out.println("Bytes - " + volodymyr.toString().getBytes().length);

        // Task 13
        volodymyr.delete(pib.length(), volodymyr.length());
        System.out.println(volodymyr);

        // Task 14
        String ln = volodymyr.substring(volodymyr.indexOf(LastName), LastName.length());

        System.out.println(new StringBuffer(ln).reverse());
    }
}
