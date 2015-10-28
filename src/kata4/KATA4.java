package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String nameFile = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\KATA4\\Data\\datos.txt";
        ArrayList<String> mailArray = MailListReader.reader(nameFile);
        Histogram<String> histo = MailHistogramBuilder.build(mailArray);
        
        
        HistogramDisplay histograma = new HistogramDisplay(histo);
        histograma.execute();
        
        
    }
}
