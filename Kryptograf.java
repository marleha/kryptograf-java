
class Kryptograf {
    String[] dekryptert;
}

public void dekrypterBeskjeder() {
    for (String beskjed : beskjeder) {
        dekryptertBeskjed = Kryptografi.dekrypter(beskjed);
    }

    public String[] hentDekrypterteBeskjeder() {
        return dekryptert;
    }
}

