package Rdatas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1000000000000L); //long 10000 ms
        System.out.println(date.toString());
    }
}
