
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJLINK
 */
public class Data {
    public static void main (String[]args) throws ParseException{
    Scanner sc=new Scanner(System.in);
    
    SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf3= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
    
    Date d1= new Date();
    Date d2= new Date(System.currentTimeMillis()); 
    Date d3= new Date(0L);
    Date d4= new Date(1000L*60L*60L*5L);
            
    Date y1= sdf1.parse("29/03/2020");    
    Date y2= sdf2.parse("29/03/2020 17:45:00");
    Date y3= Date.from(Instant.parse("2020-03-29T18:06:00Z"));
    
    System.out.println("d1: "+sdf2.format(d1));
    System.out.println("d2: "+sdf2.format(d2));
    System.out.println("d3: "+sdf2.format(d3));
    System.out.println("d4: "+sdf2.format(d4));
    System.out.println("y1: "+sdf2.format(y1));
    System.out.println("y2: "+sdf2.format(y2));
    System.out.println("y3: "+sdf2.format(y3));
    System.out.println("_______________________");
    System.out.println("d1: "+sdf3.format(d1));
    System.out.println("d2: "+sdf3.format(d2));
    System.out.println("d3: "+sdf3.format(d3));
    System.out.println("d4: "+sdf3.format(d4));
    System.out.println("y1: "+sdf3.format(y1));
    System.out.println("y2: "+sdf3.format(y2));
    System.out.println("y3: "+sdf3.format(y3));
    }
    
}
