package view;

import controller.Algorithm;
import java.util.ArrayList;
import model.CSV;



public class Main {
    public static void main(String[] args) {
        Algorithm a= new Algorithm ();
        ArrayList<CSV> ls = new ArrayList<>();
        ls.add(new CSV(1, "Le Van Nguyen", "nguyen@gmail.com", "'0982320356", "Thuy Phuong   - hUong Thuy -  Hue"));
        ls.add(new CSV(2, "NGUyen tHi         nGoc   ", "ngoc@gmail.com", "'0986431545", "Tran Hung dAo - DiEn nGoc   -   Quang nAm"));
        ls.add(new CSV(3, "Nguyen   van MiNh      	", "minh@gmail.com", "'0976256314", "Cau Giay     - Ha    Noi    - Viet Nam    "));
        a.display(ls);
    }
}