import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int total = 0;
        BufferedReader bf = null;
        try
        {
            bf = new BufferedReader(new FileReader("C:\\Users\\Furkan\\Desktop\\readingFile(checkedExceptionExample)\\src\\Sayilar.txt"));
            String line = null;
            while((line =bf.readLine()) != null){
                total+=Integer.valueOf(line);

            }
            System.out.println("toplam: "+total);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            bf.close();
        }
    }
}
