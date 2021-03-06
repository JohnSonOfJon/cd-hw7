/* This file was generated by SableCC (http://www.sablecc.org/). */

package hw7.node;

import hw7.analysis.*;

@SuppressWarnings("nls")
public final class TAnd extends Token
{
    public TAnd()
    {
        super.setText("fus");
    }

    public TAnd(int line, int pos)
    {
        super.setText("fus");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAnd(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAnd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAnd text.");
    }
}
