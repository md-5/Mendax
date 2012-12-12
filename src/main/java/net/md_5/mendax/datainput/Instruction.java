package net.md_5.mendax.datainput;

import java.io.DataInput;
import java.io.IOException;

public abstract class Instruction {

	public static final Instruction BOOLEAN = new Jump(1);
	public static final Instruction BULK_CHUNK = new BulkChunk();
	public static final Instruction BYTE = new Jump(1);
    // BYTE_INT moved down
	public static final Instruction DOUBLE = new Jump(8);
	public static final Instruction FLOAT = new Jump(4);
	public static final Instruction INT = new Jump(4);
	public static final Instruction INT_3 = new IntHeader(new Jump(3));
	public static final Instruction INT_BYTE = new IntHeader(BYTE);
	public static final Instruction ITEM = new Item();
	public static final Instruction LONG = new Jump(8);
	public static final Instruction METADATA = new MetaData();
	public static final Instruction OPTIONAL_MOTION = new OptionalMotion();
	public static final Instruction SHORT = new Jump(2);
	public static final Instruction SHORT_BYTE = new ShortHeader(BYTE);
	public static final Instruction SHORT_ITEM = new ShortHeader(ITEM);
	public static final Instruction STRING = new ShortHeader(new Jump(2));
	public static final Instruction USHORT_BYTE = new UnsignedShortByte();
    // Illegal forward references below this line
	public static final Instruction BYTE_INT = new ByteHeader(INT);

    abstract void read(DataInput in) throws IOException;

    final void skip(DataInput in, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            in.readUnsignedByte();
        }
    }
}
