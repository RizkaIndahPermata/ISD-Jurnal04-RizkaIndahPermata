import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static LinkedList<Data> listTugas = new LinkedList<Data>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int inputan = 0;
        
        while (inputan != 4) {
            System.out.println("1.Input tugas");
            System.out.println("2.Delete tugas");
            System.out.println("3.Lihat list tugas");
            System.out.println("4.Keluar");
            System.out.print("Pilihan: ");
            
            inputan = s.nextInt();
            
            String mataKuliah, tugas, deadline;
            s.nextLine();
            
            switch (inputan) {
                case 1:
                System.out.print("Masukkan mata kuliah: ");
                mataKuliah = s.nextLine();
                System.out.print("Masukkan nama tugas: ");
                tugas = s.nextLine();
                System.out.print("Masukkan deadline: ");
                deadline = s.nextLine();
                
                inputData(mataKuliah, tugas, deadline);
                
                break;
                
                case 2:
                System.out.println("1.hapus depan");
                System.out.println("2.hapus belakang");
                System.out.println("3.hapus nama tugas");
                System.out.print("Pilihan: ");
                
                deleteData();
                break;
                
                case 3:
                listTugas.sort(null);
                displayData();
                break;

                default:
                System.out.println("isi sesuai pilihan!");
                    break;
            }
        }
    }

    public static void inputData (String mataKuliah, String tugas, String deadline) {
        listTugas.add (new Data(mataKuliah, tugas, deadline));
    }

    public static void deleteData (){
        int pilih = s.nextInt();

                switch (pilih) {
                    case 1:
                    listTugas.removeFirst();
                    break;
                    case 2:
                    listTugas.removeLast();
                    break;
                    case 3:
                    String nama = s.nextLine();
                    ListIterator<Data> iterator = listTugas.listIterator();

                    while (iterator.hasNext()) {
                        Data currentTugas = iterator.next();

                        if (currentTugas.getNamaTugas().equalsIgnoreCase(nama)) {
                            iterator.remove();
                        }
                    }
                    
                    default:
                    System.out.println("isi sesuai pilihan!");
                        break;
                }
            }

    public static void displayData() {
        ListIterator <Data> iterator= listTugas.listIterator();
                System.out.println("1. print depan");
                System.out.println("2. print belakang");
                int pilihan = s.nextInt();
                switch (pilihan) {
                    case 1:
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                        break;
                    case 2:
                    iterator = listTugas.listIterator(listTugas.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                }
            }
         }


