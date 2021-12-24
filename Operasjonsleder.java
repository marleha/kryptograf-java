
class Operasjonsleder extends MonitorDekryptert {
    ArrayList[] dekrypterteBeskjeder;


    public void hentDekrypterteBeskjeder() {
        String dekryptert = MonitorDekryptert.hentDekrypterteBeskjeder();
        add.dekrypterteBeskjeder[dekryptert];
    }
}

// For
// å holde på meldingene i monitoren bør du bruke en passende beholder, for eksempel
// ArrayList eller LinkedList. Alternativt kan du benytte en beholder fra oblig 3 (vi vil oppfordre
// til å benytte ArrayList eller LinkedList, da det kan være nyttig å bli bedre kjent med
// Java-biblioteket). Pass på at ingen meldinger blir liggende for lenge i monitoren før de blir
// hentet av en kryptograf.