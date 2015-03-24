package com.ardublock.translator.block;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;
import com.ardublock.core.exception.ArdublockException;

public class SerialReadPolyBlock extends TranslatorBlock
{
	public SerialReadPolyBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode() throws ArdublockException
	{
		translator.addSetupCommand("Serial.begin(9600);");
		
		String ret = "Serial.read()";
		
		return codePrefix+ret+codeSuffix;
	}
}
