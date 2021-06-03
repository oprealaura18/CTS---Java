package clase;

import java.util.List;

public interface IStudent {
    public String getNume();

    public void setNume(String nume) ;

    public List<Integer> getNote() ;

    public void adaugaNota(int nota);

    public float calculeazaMedie();

    public int getNota(int index);

    public boolean areRestante();
}