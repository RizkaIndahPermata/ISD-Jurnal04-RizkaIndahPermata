public class Data implements Comparable<Data> {
    private String namaMatkul;
    private String namaTugas;
    private String deadlineTugas;

    public Data(String namaMatkul, String namaTugas, String deadlineTugas) {
        this.namaMatkul = namaMatkul;
        this.namaTugas = namaTugas;
        this.deadlineTugas = deadlineTugas;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    public String getNamaTugas() {
        return namaTugas;
    }
    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }
    public String getDeadlineTugas() {
        return deadlineTugas;
    }
    public void setDeadlineTugas(String deadlineTugas) {
        this.deadlineTugas = deadlineTugas;
    }

    @Override
    public String toString() {
        return "Mata kuliah :" + namaMatkul + ", Tugas : " + namaTugas + ", Deadline : " + deadlineTugas;
    }

    @Override
    public int compareTo (Data o) {
        return this.deadlineTugas.compareTo(o.getDeadlineTugas());
        
    }
    
}
