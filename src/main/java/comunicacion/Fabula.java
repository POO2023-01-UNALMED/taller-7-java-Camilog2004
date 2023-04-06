package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    //Getters and Setters
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //Methods

    @Override
    public int palabrasTotales(int parametro){
        return getPaginas()*parametro*1;
    }
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    @Override
    public String toString(){
        return getOrigen()+"\n"+
                getTitulo()+"\n"+
                getAutor()+"\n"+
                getPaginas()+"\n"+
                getEnsenanza();
    }

}
