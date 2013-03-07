package ch.uzh.ifi.attempto.ape.drs;

import jpl.Term;

/**
* Created with IntelliJ IDEA.
* User: ses
* Date: 3/6/13
* Time: 9:26 PM
* To change this template use File | Settings | File Templates.
*/
public class DRSAtom extends DRSItem {
    Term term;
    int sentenceId;
    int tokenId;

    public DRSAtom(Term term, int sentenceId, int tokenId) {
        this.term = term;
        this.sentenceId = sentenceId;
        this.tokenId = tokenId;
    }
    public String toString() {
        return "'" + term.toString() + "'";
    }
}
