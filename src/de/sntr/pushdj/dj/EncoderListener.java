package de.sntr.pushdj.dj;

import de.sntr.pushdj.push.Encoder;

public interface EncoderListener {

	public void increased(Encoder control);
	public void decreased(Encoder control);
	
}
