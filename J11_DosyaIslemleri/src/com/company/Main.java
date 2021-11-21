package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void dosyaOlustur()
    {
        // il once masaustunde yeni bir dosya olusturalım.
        File f = new File("C:\\Users\\Furkan\\Desktop\\islem.txt");

        try{
            if(f.createNewFile())  // dosya olusturup true yada false doner üretirse olustursun
            {
                System.out.println("dosya uretildi");
            }
            else
            {
                System.out.println("dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        dosyaOlustur();
        InfoFile();
        ReadFile();
        writeFile();

    }

    public static void InfoFile()
    {
        File f = new File("C:\\Users\\Furkan\\Desktop\\islem.txt");
        if(f.exists())// boyle bir dosya varsa
        {
            System.out.println("Dosyanin adi: "+ f.getName());
        }
        System.out.println("Dosya yolu : "+f.getAbsolutePath());
        System.out.println("Dosya yazılabilir mi ? "+f.canWrite());// dosya yazılabilir mi
        System.out.println("Dosya okunabilir mi ? "+f.canRead()); //dosya okunabilir mi
        System.out.println("Dosya Boyutu (byte cinsinden) :"+f.length());// dosyanın boyutu;
    }




    public static void ReadFile()
    {
        File f = new File("C:\\Users\\Furkan\\Desktop\\islem.txt");
        try {
            //file metodu satır satır okuma islemi yapacaktır.
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println("Dosya içindekiler: "+line);
            }
            //dosya okuma bittiginde kapatılmalıdır.
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile()
    {
        File f = new File("C:\\Users\\Furkan\\Desktop\\islem.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
            writer.newLine();
            writer.write("deneme");
            //System.out.println("dosyaya yazıldi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
