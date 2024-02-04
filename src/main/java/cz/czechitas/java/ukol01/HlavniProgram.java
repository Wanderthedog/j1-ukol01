package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        nakresliKolecko();
        nakresliDomecek();
        nakresliDomecek();
        nakresliDomecek();
        nakresliDomecek();
        nakresliDomecek();
        vratSeNaPuvodniPozici();
        nakresliDomecek();
        malovaniDomecku2();
        nakresliDomecek();
        posunPrasatko();
        nakresliPrasatko();
        posunKPismenkum();
        //nakreslioOsmiuhelnik();
        //nakresliHvezdicku();
        pismenoJ();
        pismenoA();
        pismenoN();
        pismenoA();
    }

    public void nakresliKolecko (){

        zofka.penUp();
        zofka.turnLeft(35);
        zofka.move(460);
        zofka.penDown();


        int polomer = 50; // Poloměr kruhu
        int pocetCasti = 360; // 360 casti

        for (int i = 0; i < pocet; i++) {
            zofka.move(polomer * 3.14 * 2 / pocetCasti); // 360x
            zofka.turnLeft(1); // Otoci se o jeden stupen
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);

        zofka.penUp(); //zofka se presune doprostred a pokracuje
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);


        int paprskyDva = 7; // zmatena zofka dela dalsi paprsky

        for (int i = 0; i < paprskyDva; i++) {
            zofka.penUp();
            zofka.move(50);
            zofka.turnRight(45);
            zofka.move(50);
            zofka.penDown();
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
        }

        zofka.turnLeft(35);//zofka jde nekam, kde muze malovat domecky
        zofka.penUp();
        zofka.move(325);
        zofka.turnRight(115);
        zofka.penDown();
    }

public void nakresliHvezdicku (){
    int delkaStrany = 50; // Délka strany hvezdičky

    for (int i = 0; i < 5; i++) {
        zofka.move(delkaStrany);
        zofka.turnLeft(144);
    }

    }
    public void nakresliDomecek() {
        // První část domku - obdelnik
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);

        // Druhá část domku - střecha
        zofka.turnLeft(30);
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(120);


         //zofka jde zpatky na roh domecku
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.penDown();

    }

    public void nakreslioOsmiuhelnik() {
        int strana = 50; // jedna strana osmiuhelniku
        for (int i = 0; i < 8; i++) {
            zofka.move(strana);
            zofka.turnLeft(45); // 360/ 8  = 45
        }
    }

    public void nakresliPrasatko (){

        // První část prasátko tělo
         zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);

        // čumáček
        zofka.turnRight(112.5);
        zofka.move(111.8);
        zofka.turnRight(127);
        zofka.move(111.8);

        //nozicky predni
        zofka.turnRight(31);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        //nozicky zadni
        zofka.turnLeft(45);
        zofka.move(120);
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);

        //Vrátíme zofku do výchozí pozice, sorry prasatko, ocasek priste
        zofka.turnLeft(45);


    }

    public void vratSeNaPuvodniPozici(){
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.penDown();


    }

    public void malovaniDomecku2(){
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(1250);
        zofka.turnRight(90);
        zofka.penDown();


    }

    public void posunPrasatko(){
        zofka.penUp();
        zofka.turnRight(90);
       zofka.move(300);
       zofka.turnLeft(90);
       zofka.penDown();



    }

    public void posunKPismenkum(){
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(180);
        zofka.penDown();



    }
     public void pismenoJ() {

            zofka.penUp();
            zofka.move(12);
            zofka.penDown();
            zofka.turnRight(135);
            zofka.move(17);
            zofka.turnLeft(45);
            zofka.move(25);
            zofka.turnLeft(45);
            zofka.move(17);
            zofka.turnLeft(45);
            zofka.move(89);
            zofka.turnLeft(90);
            zofka.move(50);
            zofka.penUp();
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(60);
            zofka.turnLeft(90);
            zofka.penDown();
            }

            public void pismenoA(){

                      zofka.turnRight(20);
      zofka.move(105);
      zofka.turnRight(140);
      zofka.move(105);
      zofka.turnLeft(180);
      zofka.penUp();
      zofka.move(30);
      zofka.penDown();
      zofka.turnLeft(70);
      zofka.move(48);
      zofka.penUp();
      zofka.turnLeft(180);
      zofka.move(48);
      zofka.turnRight(70);
      zofka.move(30);
      zofka.turnLeft(70);
      zofka.move(10);
      zofka.turnLeft(90);
      zofka.penDown();
}

    public void pismenoN(){


        zofka.move(105);
        zofka.turnRight(145);
        zofka.move(120);
        zofka.turnLeft(145);
        zofka.move(105);
        zofka.turnRight(180);
        zofka.move(105);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(10);
        zofka.turnLeft(90);
        zofka.penDown();

    }
    }










