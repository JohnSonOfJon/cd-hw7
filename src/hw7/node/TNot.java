/* This file was generated by SableCC (http://www.sablecc.org/). */

package hw7.node;

import hw7.analysis.*;

@SuppressWarnings("nls")
public final class TNot extends Token
{
    public TNot()
    {
        super.setText("dah");
    }

    public TNot(int line, int pos)
    {
        super.setText("dah");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNot(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNot(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNot text.");
    }
}
