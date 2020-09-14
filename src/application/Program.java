package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


import entities.Post;
import entities.Comment;

public class Program  {
    public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");

    Comment c3 = new Comment("Good Job!");
    Comment c4 = new Comment("Nice GGWP!");

    Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
            "Traveling to New Zealnd",
            "daora",12);

    Post p2 = new Post(sdf.parse("14/09/2020 20:10:33"),"Testes Titulo","Living",20);





    p1.addComment(c1);
    p1.addComment(c2);


    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p1);
    System.out.println(p2);

    sc.close();

    }
}
