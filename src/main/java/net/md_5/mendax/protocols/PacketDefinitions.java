package net.md_5.mendax.protocols;

import net.md_5.mendax.datainput.Instruction;
import net.md_5.mendax.datainput.Jump;

import java.util.ArrayList;
import java.util.List;

import static net.md_5.mendax.protocols.PacketDefinitions.OpCode.*;

public class PacketDefinitions {

    public final OpCode[][] opCodes = new OpCode[256][];

	public static final PacketDefinitions VANILLA = new VanillaPacketDefinitions();
	public static final PacketDefinitions FORGE = new ForgePacketDefinitions();

	public final Instruction[][] instructions = new Instruction[256][];

    public enum OpCode {
        BOOLEAN, BULK_CHUNK, BYTE, BYTE_INT, DOUBLE, FLOAT, INT, INT_3, INT_BYTE, ITEM, LONG, METADATA, OPTIONAL_MOTION, SHORT, SHORT_BYTE, SHORT_ITEM, STRING, USHORT_BYTE
    }

	protected PacketDefinitions() {
        opCodes[0x00] = new OpCode[]{INT};
        opCodes[0x01] = new OpCode[]{INT, STRING, BYTE, BYTE, BYTE, BYTE, BYTE};
        opCodes[0x02] = new OpCode[]{BYTE, STRING, STRING, INT};
        opCodes[0x03] = new OpCode[]{STRING};
        opCodes[0x04] = new OpCode[]{LONG, LONG};
        opCodes[0x05] = new OpCode[]{INT, SHORT, ITEM};
        opCodes[0x06] = new OpCode[]{INT, INT, INT};
        opCodes[0x07] = new OpCode[]{INT, INT, BOOLEAN};
        opCodes[0x08] = new OpCode[]{SHORT, SHORT, FLOAT};
        opCodes[0x09] = new OpCode[]{INT, BYTE, BYTE, SHORT, STRING};
        opCodes[0x0A] = new OpCode[]{BOOLEAN};
        opCodes[0x0B] = new OpCode[]{DOUBLE, DOUBLE, DOUBLE, DOUBLE, BOOLEAN};
        opCodes[0x0C] = new OpCode[]{FLOAT, FLOAT, BOOLEAN};
        opCodes[0x0D] = new OpCode[]{DOUBLE, DOUBLE, DOUBLE, DOUBLE, FLOAT, FLOAT, BOOLEAN};
        opCodes[0x0E] = new OpCode[]{BYTE, INT, BYTE, INT, BYTE};
        opCodes[0x0F] = new OpCode[]{INT, BYTE, INT, BYTE, ITEM, BYTE, BYTE, BYTE};
        opCodes[0x10] = new OpCode[]{SHORT};
        opCodes[0x11] = new OpCode[]{INT, BYTE, INT, BYTE, INT};
        opCodes[0x12] = new OpCode[]{INT, BYTE};
        opCodes[0x13] = new OpCode[]{INT, BYTE};
        opCodes[0x14] = new OpCode[]{INT, STRING, INT, INT, INT, BYTE, BYTE, SHORT, METADATA};
        opCodes[0x15] = new OpCode[]{INT, ITEM,  INT, INT, INT, BYTE, BYTE, BYTE};
        opCodes[0x16] = new OpCode[]{INT, INT};
        opCodes[0x17] = new OpCode[]{INT, BYTE, INT, INT, INT, OPTIONAL_MOTION};
        opCodes[0x18] = new OpCode[]{INT, BYTE, INT, INT, INT, BYTE, BYTE, BYTE, SHORT, SHORT, SHORT, METADATA};
        opCodes[0x19] = new OpCode[]{INT, STRING, INT, INT, INT, INT};
        opCodes[0x1A] = new OpCode[]{INT, INT, INT, INT, SHORT};
        opCodes[0x1B] = null; // Does not exist
        opCodes[0x1C] = new OpCode[]{INT, SHORT, SHORT, SHORT};
        opCodes[0x1D] = new OpCode[]{BYTE_INT};
        opCodes[0x1E] = new OpCode[]{INT};
        opCodes[0x1F] = new OpCode[]{INT, BYTE, BYTE, BYTE};
        opCodes[0x20] = new OpCode[]{INT, BYTE, BYTE};
        opCodes[0x21] = new OpCode[]{INT, BYTE, BYTE, BYTE, BYTE, BYTE};
        opCodes[0x22] = new OpCode[]{INT, INT, INT, INT, BYTE, BYTE};
        opCodes[0x23] = new OpCode[]{INT, BYTE};
        opCodes[0x24] = null; // Does not exist
        opCodes[0x25] = null; // Does not exist
        opCodes[0x26] = new OpCode[]{INT, BYTE};
        opCodes[0x27] = new OpCode[]{INT, INT};
        opCodes[0x28] = new OpCode[]{INT, METADATA};
        opCodes[0x29] = new OpCode[]{INT, BYTE, BYTE, SHORT};
        opCodes[0x2A] = new OpCode[]{INT, BYTE};
        opCodes[0x2B] = new OpCode[]{FLOAT, SHORT, SHORT};
        //
        //
        // 0x2C -> 0x32 Do not exist
        //
        //
        opCodes[0x33] = new OpCode[]{INT, INT, BOOLEAN, SHORT, SHORT, INT_BYTE};
        opCodes[0x34] = new OpCode[]{INT, INT, SHORT, INT_BYTE};
        opCodes[0x35] = new OpCode[]{INT, BYTE, INT, SHORT, BYTE};
        opCodes[0x36] = new OpCode[]{INT, SHORT, INT, BYTE, BYTE, SHORT};
        opCodes[0x37] = new OpCode[]{INT, INT, INT, INT, BYTE};
        opCodes[0x38] = new OpCode[]{BULK_CHUNK};
        opCodes[0x39] = null; // Does not exist
        opCodes[0x3A] = null; // Does not exist
        opCodes[0x3B] = null; // Does not exist
        opCodes[0x3C] = new OpCode[]{DOUBLE, DOUBLE, DOUBLE, FLOAT, INT_3, FLOAT, FLOAT, FLOAT};
        opCodes[0x3D] = new OpCode[]{INT, INT, BYTE, INT, INT, BOOLEAN};
        opCodes[0x3E] = new OpCode[]{STRING, INT, INT, INT, FLOAT, BYTE};
        //
        //
        // 0x3F -> 0x45 Do not exist
        //
        //
        opCodes[0x46] = new OpCode[]{BYTE, BYTE};
        opCodes[0x47] = new OpCode[]{INT, BYTE, INT, INT, INT};
        //
        //
        // 0x4A -> 0x63 Do not exist
        //
        //
        opCodes[0x64] = new OpCode[]{BYTE, BYTE, STRING, BYTE};
        opCodes[0x65] = new OpCode[]{BYTE};
        opCodes[0x66] = new OpCode[]{BYTE, SHORT, BYTE, SHORT, BYTE, ITEM};
        opCodes[0x67] = new OpCode[]{BYTE, SHORT, ITEM};
        opCodes[0x68] = new OpCode[]{BYTE, SHORT_ITEM};
        opCodes[0x69] = new OpCode[]{BYTE, SHORT, SHORT};
        opCodes[0x6A] = new OpCode[]{BYTE, SHORT, BOOLEAN};
        opCodes[0x6B] = new OpCode[]{SHORT, ITEM};
        opCodes[0x6C] = new OpCode[]{BYTE, BYTE};
        //
        //
        // 0x6D -> 0x81 Do not exist
        //
        //
        opCodes[0x82] = new OpCode[]{INT, SHORT, INT, STRING, STRING, STRING, STRING};
        opCodes[0x83] = new OpCode[]{SHORT, SHORT, USHORT_BYTE};
        opCodes[0x84] = new OpCode[]{INT, SHORT, INT, BYTE, SHORT_BYTE};
        //
        //
        // 0x85 -> 0xC7 Do not exist
        //
        //
        opCodes[0xC8] = new OpCode[]{INT, BYTE};
        opCodes[0xC9] = new OpCode[]{STRING, BOOLEAN, SHORT};
        opCodes[0xCA] = new OpCode[]{BYTE, BYTE, BYTE};
        opCodes[0xCB] = new OpCode[]{STRING};
        opCodes[0xCC] = new OpCode[]{STRING, BYTE, BYTE, BYTE, BOOLEAN};
        opCodes[0xCD] = new OpCode[]{BYTE};
        //
        //
        // 0xCE -> 0xF9 Do not exist
        //
        //
        opCodes[0xFA] = new OpCode[]{STRING, SHORT_BYTE};
        opCodes[0xFB] = null; // Does not exist
        opCodes[0xFC] = new OpCode[]{SHORT_BYTE, SHORT_BYTE};
        opCodes[0xFD] = new OpCode[]{STRING, SHORT_BYTE, SHORT_BYTE};
        opCodes[0xFE] = new OpCode[]{}; // Should be byte, screw you too bitchy server admins!
        opCodes[0xFF] = new OpCode[]{STRING};
    }

	protected void initializeInstructions() {
		for (int i = 0; i < instructions.length; i++) {
			List<Instruction> output = new ArrayList<Instruction>();

			OpCode[] enums = opCodes[i];
			if (enums != null) {
				for (OpCode struct : enums) {
					try {
						output.add((Instruction) Instruction.class.getDeclaredField(struct.name()).get(null));
					} catch (Exception ex) {
						throw new UnsupportedOperationException("No definition for " + struct.name());
					}
				}

				List<Instruction> crushed = new ArrayList<Instruction>();
				int nextJumpSize = 0;
				for (Instruction child : output) {
					if (child instanceof Jump) {
						nextJumpSize += ((Jump) child).len;
					} else {
						if (nextJumpSize != 0) {
							crushed.add(new Jump(nextJumpSize));
						}
						crushed.add(child);
						nextJumpSize = 0;
					}
				}
				if (nextJumpSize != 0) {
					crushed.add(new Jump(nextJumpSize));
				}

				instructions[i] = crushed.toArray(new Instruction[crushed.size()]);
			}
		}
	}
}
