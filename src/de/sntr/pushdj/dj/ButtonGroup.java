package de.sntr.pushdj.dj;


public abstract class ButtonGroup implements ButtonListener, TraktorMessageListener {

	public abstract void activate();
	public abstract void deactivate();

}
