package de.sntr.pushdj.push;

public class MatrixBlink extends Thread {

	public volatile boolean running = true;

	Button button;
	int onColor, offColor;
	int onTime, offTime;
	
	public MatrixBlink(Button button, int onColor, int offColor, int onTime, int offTime) {
		this.button = button;
		this.onColor = onColor;
		this.offColor = offColor;
		this.onTime = onTime;
		this.offTime = offTime;
	}
	
	@Override
	public void run() {
		while (running) {
			PushAdapter.setColor(button, onColor);
			try {
				sleep(onTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PushAdapter.setColor(button, offColor);
			try {
				sleep(offTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
