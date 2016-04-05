package hw7;

import hw7.NT.*;

/**
 * A Visitor can perform operations on a Syntax Tree, such as
 *    Build symbol tables
 *    Type check
 *    Optimize
 *    Code Gen...
 * 
 * @author (sdb) 
 * @version (Mar 2016)
 */
public interface Visitor
{
    void visit (Program n);
    void visit (VarDecl n);
    void visit (Type n);
    void visit (Stm n);
    void visit (Assign n);
    void visit (Exp n);
    void visit (Elist n);
    void visit (And n);
    void visit (AList n);
    void visit (Less n);
    void visit (Llist n);
    void visit (Term n);
    void visit (TList n);
    void visit (Not n);
    void visit (Factor n);
}

