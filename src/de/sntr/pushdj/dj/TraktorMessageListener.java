package de.sntr.pushdj.dj;

import de.sntr.pushdj.traktor.TraktorMessage;

public interface TraktorMessageListener {

	public void traktorMessageSent(TraktorMessage message);
	
}
