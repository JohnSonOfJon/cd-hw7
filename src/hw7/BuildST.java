package hw7;

import hw7.NT.*;

/**
 * A Visitor which builds symbol tables for a syntax tree
 * Semantic phase, part 1
 * 
 * @author (sdb) 
 * @version (Mar 2016)
 */
public class BuildST implements Visitor
{
   SymbolTable symTab, symTabMethod, symTabClass, symTabProg;
   
   public BuildST ()
   { }
   
   public void visit (Program n)
   {    symTab =  new SymbolTable();
   		symTabProg =  new SymbolTable();
        n.mainClass.accept (this);
        n.classDecls.accept (this);
    }
    
    public void visit (MainClass n)
    {   symTabProg.put (n.className, 
            new Binding (n.className, IdType.CLASS));
        symTabProg.put (n.args, new Binding (n.args, IdType.VARIABLE);
        n.symTab = new SymBolTable();
        n.className.accept(this);
        n.args.accept (this);
        n.stmt.accept (this);   //   ??
    }
    
    public void visit (ClassDecl n)
    {   }
    
    public void visit (ClassDeclSimple n)
    {   symTabProg.put (n.className, new Binding (n.className,
                    IdType.CLASS);
        n.className.accept (this);
        symTab = symTabClass = n.symtab = new SymbolTable();
        n.fields.accept (this);  // Enter fields into the symbol table
        n.methods.accept (this);
    }

	@Override
	public void visit(VarDecl n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Type n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Stm n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Assign n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Exp n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Elist n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(And n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(AList n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Less n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Llist n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Term n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TList n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Not n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Factor n) {
		// TODO Auto-generated method stub
		
	}
    
    // Continue in this manner for the following classes:
    // ClassDeclExtends, VarDecl, MethodDecl, Formal, 
    
    
        
    }
        
    
}
