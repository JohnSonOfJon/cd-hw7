/* This file was generated by SableCC (http://www.sablecc.org/). */

package hw7.node;

import hw7.analysis.*;

@SuppressWarnings("nls")
public final class TDeclare extends Token
{
    public TDeclare()
    {
        super.setText("declare");
    }

    public TDeclare(int line, int pos)
    {
        super.setText("declare");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDeclare(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDeclare(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDeclare text.");
    }
}
