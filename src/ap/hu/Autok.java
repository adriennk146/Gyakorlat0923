package ap.hu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Autok {

    private List<Auto> autoLista;

    public Autok(String fajlNev){
        this.autoLista = new ArrayList<Auto>();

        try{
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            String sor= br.readLine();
            while (sor!=null)
            {
                this.autoLista.add(new Auto(sor));
                sor=br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (
                IOException ioe)
        {
            System.err.println("Hiba a fájl megnyitása során.");
        }
    }

    public boolean szabadEAzIdopont(LocalTime idopont)
    {
        int i =0;
        while(i<this.autoLista.size()
        && this.autoLista.get(i).getIdopont().equals(idopont)){
            i++;
        }
        boolean szabadE = false;
        return szabadE;

    }

    public String ToString()
    {
        String s = "";
        for(Auto a:this.autoLista){
            s+= a.toString()+"\n";
        }
        return s;
    }




}
