package net.md_5.mendax.datainput;

import java.io.DataInput;
import java.io.IOException;

public class Jump extends Instruction {

    public final int len;

	public Jump(int len) {
        if (len < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.len = len;
    }

    @Override
    void read(DataInput in) throws IOException {
        skip(in, len);
    }
}
