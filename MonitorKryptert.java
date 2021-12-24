
class MonitorKryptert extends Telegrafist {
    String[] krypterteBeskjeder;
    

    public String[] hentKrypterteBeskjeder() {
        return krypterteBeskjeder

    }

    public void beskjederFraTelegraf() {
        beskjeder = Telegrafist.lytter();
        add.krypterteBeskjeder(beskjeder);
    }

}