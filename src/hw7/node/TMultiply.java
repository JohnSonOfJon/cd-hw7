/* This file was generated by SableCC (http://www.sablecc.org/). */

package hw7.node;

import hw7.analysis.*;

@SuppressWarnings("nls")
public final class TMultiply extends Token
{
    public TMultiply()
    {
        super.setText("buff");
    }

    public TMultiply(int line, int pos)
    {
        super.setText("buff");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMultiply(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMultiply(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMultiply text.");
    }
}
