package Adapterother;

public class VlcPlayer implements AdvanceMediaPlayer
{

	@Override
	public void PlayVlc(String filename) {
		System.out.println("play VLCplayer:    "+filename);
		
	}

	@Override
	public void playMp4(String filename) {
		
	}

}
