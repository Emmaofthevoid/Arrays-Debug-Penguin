public class ArrayTest2 {
    public static void main(String[] args) {
        String  [] smartphoneNamen = {"Samsung A51", "Iphone 13", "Huawei 15", "Nokia 3210","Xiaomi 7"};
       //eine Zeile steht für ein smartphone
        // jede spalte in der zeile steht für verkaufszahlen in den jeweiligen quartalen
        int [][] smartphoneVerkaufszahlen = {{1000,3000,4000,5000},{6000,7000,8000,9000},{3560,3700,4800,5200},{6500,2300,3450,3400},{3400,4500,5850,5600}};

        for ( int sNr = 0 ;sNr < smartphoneNamen.length; sNr++) {
            System.out.println(smartphoneNamen[sNr] + "   " + sNr);
        }
        //for each loop
        //rechts vom : steht das array ( oder sonst was mehr daten beinhaltet
        //links faneben meine laufvariable die den type des Inhalts des arrays hat
        //(kann einen beliebigen namen haben - eine sogenannte Hansi variable
        for (String smartphone: smartphoneNamen) {
            System.out.println(smartphone);
        }
        //alle smartphone verkaufszahlen inklusive name ausgeben
        for (int sIndex = 0; sIndex < smartphoneVerkaufszahlen.length; sIndex++) {
            System.out.print(smartphoneNamen[sIndex] + ": ");
            for (int qIndex = 0; qIndex < smartphoneVerkaufszahlen[sIndex].length; qIndex++) {
                System.out.print(smartphoneVerkaufszahlen[sIndex][qIndex] + "   ");
            }
            //nach ausgabe aller Quartalszahlen ein in Zeilenumbruch bitte
            System.out.println();

        }
        for (int i = 0; i < smartphoneNamen.length; i++) {

            System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen,i));
        }
        System.out.println("---------");
    }
    // Die folgende methode soll die über das jahr verkauften Zahlen smartphones zurückliefern
    //zahlen: unsere verkaufszahlen
    // welchesSmartphone : Index der Angibt an welche Smartphone wir interessiert sind (0 basiert)
    //weitere anforderung : wenn ungültiger wert auf welchesSmartphone angegeben wird bitte -1 zurückliefern
    public static int verkaufteAnzahlJahr (int [][] zahlen, int welchesSmartphone){
       if (welchesSmartphone < 0 || welchesSmartphone >= zahlen.length){
           return -1;
       }
       int summe = 0;
        for (int q = 0; q < zahlen[welchesSmartphone].length; q++) {
            summe += zahlen[welchesSmartphone][q];

        }
        return summe;
    }
    //Die Folgende methode soll uns den namen des smartphones liefern, das in einem bestimmten Quartal
    //am erfolgreichsten war
    //zahlen: unser verkaufszahlen
    //namen: unser smartphone namen
    //quartalNr: für welches quartal soll berechnet werden (zwischen 1 und 4) - sonst Rückgabewert leerer String
    public static String erfolgreichtesSmartphoneQuartal (int [][] zahlen, String[] namen, int quartalNr){

        return " ";
    }
}
