package ap.hu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Autok autoAdatok = new Autok("bejegyzesek.txt");
        System.out.println(autoAdatok.ToString());
        Scanner sc = new Scanner(System.in);
        sc.next();

    }



}
