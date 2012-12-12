package net.md_5.mendax.datainput;

import net.md_5.mendax.protocols.PacketDefinitions;

import java.io.DataInput;
import java.io.IOException;

public class DataInputPacketReader {
	private PacketDefinitions packetDefinitions;

	public DataInputPacketReader() {
		this(PacketDefinitions.VANILLA);
	}

	public DataInputPacketReader(PacketDefinitions packetDefinitions) {
		this.packetDefinitions = null;
		setPacketDefinitions(packetDefinitions);
	}

	public PacketDefinitions getPacketDefinitions() {
		return packetDefinitions;
	}

	public void setPacketDefinitions(PacketDefinitions packetDefinitions) {
		if(packetDefinitions == this.packetDefinitions)
			return;

		this.packetDefinitions = packetDefinitions;
    }

    public void readPacket(DataInput in) throws IOException {
        int packetId = in.readUnsignedByte();
        Instruction[] packetDef = packetDefinitions.instructions[packetId];

        if (packetDef == null) {
            throw new IOException("Unknown packet id " + packetId);
        }

        for (Instruction instruction : packetDef) {
            instruction.read(in);
        }
    }
}
