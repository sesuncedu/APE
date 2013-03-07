package ch.uzh.ifi.attempto.ape.drs;

/**
* Created with IntelliJ IDEA.
* User: ses
* Date: 3/6/13
* Time: 9:27 PM
* To change this template use File | Settings | File Templates.
*/
public class DRSVar extends DRSItem {
    String name;
    public DRSVar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "?" + name;
    }
}
