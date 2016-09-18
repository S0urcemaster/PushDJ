package de.sntr.pushdj.dj;

import de.sntr.pushdj.push.ButtonListener;
import de.sntr.pushdj.traktor.TraktorMessageListener;


public abstract class ButtonGroup implements ButtonListener, TraktorMessageListener {

	public abstract void activate();
	public abstract void deactivate();

}
