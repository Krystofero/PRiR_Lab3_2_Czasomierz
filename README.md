Programowanie równolegle i rozproszone - projekt 2 labolatorium 3 Czasomierz

Projekt przedstawia czasomierz zliczający w nieskończponość liczbę sekund, minut oraz godzin.
Składa się z dwóch plików: 
jeden odpowiada za wywołnie konstruktora Czasomierz i uruchomienie wątku:

public static void main(String[] args) throws InterruptedException {
        Czasomierz c1 = new Czasomierz();
        c1.start();
    }
    
Plik Czasomierz.java reprezentuje klasę Czasomierz rozszerzającą klasę Thread (wątek)
zmienne reprezentujące upływający czas są typu int:

    int sekunda = 0;
    int minuta = 0;
    int godzina = 0;
    
Po rozpoczęciu pracy na wątku (metoda start) rozpoczyna się nieskończona pętla zliczająca godziny, minuty oraz sekundy:
metoda sleep(1000); pozwala na odliczanie co 1 sek (1000ms = 1s). Dlatego też co 1 sekundę inkremetowane o 1 są sekundy, gdy ich liczba będzie równa 59 są zerowane,
a inkrementowane o 1 są minuty. Gdy liczba minut osiągnie 59 są one zerowane a o 1 inkrementowane są godziny. Gdy liczba godzin osiągnie 24 są one zerowane a odliczanie zaczyna się defacto od początku.

public void start() throws InterruptedException{
        while(true){
            sekunda++;
            if(sekunda==59){
                minuta++;
                sekunda = 0;
                if(minuta==59){
                    godzina++;
                    minuta = 0;
                    if(godzina==24){
                        godzina = 0;
                    }
                }
            }
            sleep(1000);
            System.out.println(godzina + " : " + minuta + " : " + sekunda);
        } 
    }
