package net.md_5.mendax.protocols;

public class ForgePacketDefinitions extends PacketDefinitions {
	protected ForgePacketDefinitions() {
		super();
		opCodes[0x01] = new OpCode[]{OpCode.INT, OpCode.STRING, OpCode.BYTE, OpCode.INT, OpCode.BYTE, OpCode.BYTE, OpCode.BYTE};
		initializeInstructions();
	}
}
