package ch.uzh.ifi.attempto.ape.drs;

import jpl.Compound;
import jpl.JPLException;
import jpl.Term;
import jpl.Variable;

/**
* Created with IntelliJ IDEA.
* User: ses
* Date: 3/6/13
* Time: 9:26 PM
* To change this template use File | Settings | File Templates.
*/
public class DRS extends DRSItem{
    DRSItemList vars;
    DRSItemList body;

    static DRSItemList convertListToDRSItems(Term cons) {
        DRSItemList result = new DRSItemList();
        return convertListToDRSItems(cons, result);
    }

    static DRSItemList convertListToDRSItems(Term cons, DRSItemList result) {
        if (cons.name().equals("[]")) {
            return result;
        } else if (cons.isCompound() && cons.name().equals(".")) {
            Compound compound = (Compound) cons;
            if (compound.arity() != 2) {
                throw new JPLException("wrong arity");
            }
            result.add(convertTermToDRSItem(compound.arg(1)));
            return convertListToDRSItems(compound.arg(2), result);
        } else {
            throw new JPLException("Not a proper list");
        }
    }

    public static DRSItem convertTermToDRSItem(Term term) {
        if (term instanceof Variable) {
            Variable variable = (Variable) term;
            return new DRSVar(variable.name());
        }
        if (term.name().equals("drs")) {
            DRS result = new DRS();
            result.vars = (DRSItemList)convertTermToDRSItem(term.arg(1));
            result.body = (DRSItemList)convertTermToDRSItem(term.arg(2));
            return result;
        } else if (term.name().equals(".")) {
               return convertListToDRSItems(term);
        } else if (term.name().equals("=>")) {
            DRS antecedent = (DRS)convertTermToDRSItem(term.arg(1));
            DRS consequent = (DRS)convertTermToDRSItem(term.arg(2));
            return new DRSImplication(antecedent,consequent);
        } else if (term.name().equals("-")) {
            Term atom = term.arg(1);
            Term location = term.arg(2);
            if(!location.name().equals("/")) {
                throw new JPLException("expected /, got " + location.toString());
            }
            int sid = location.arg(1).intValue();
            int tid = location.arg(2).intValue();
            return new DRSAtom(atom,sid,tid);
        }

        else {
            throw new JPLException("bad translate of DRS term: " + term.toString());
        }
    }

    @Override
    public String toString() {
        return "DRS{" +
                "vars=" + vars +
                ", body=" + body +
                '}';
    }
}
