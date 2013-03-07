package ch.uzh.ifi.attempto.ape.drs;

/**
* Created with IntelliJ IDEA.
* User: ses
* Date: 3/6/13
* Time: 9:27 PM
* To change this template use File | Settings | File Templates.
*/
public class DRSImplication extends DRSItem {
    DRS antecedent;
    DRS consequent;

    public DRSImplication(DRS antecedent, DRS consequent) {
        this.antecedent = antecedent;
        this.consequent = consequent;
    }

    @Override
    public String toString() {
        return "DRSImplication{" +
                "antecedent=" + antecedent +
                ", consequent=" + consequent +
                '}';
    }
}
