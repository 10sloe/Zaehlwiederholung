import javakarol.*;

class Aufgabe
{
    // Attribute
    Welt welt;
    Roboter robo;

    // Konstruktor
    Aufgabe()
    {
        welt = new Welt(10,10,6);
        robo = new Roboter(welt);
    }

    void los()
    {
        int i = 0;          // definiere eine Z�hlvariable
        while (i < 8)       // �berpr�fe, ob sie noch kleiner als 8 ist
        {  
            robo.Hinlegen();
            robo.Schritt();
            i = i + 1;      // erh�he die Z�hlvariable
        }
    }
}
