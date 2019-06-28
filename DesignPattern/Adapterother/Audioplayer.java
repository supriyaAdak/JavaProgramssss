package Adapterother;

public class Audioplayer implements MediaPlayer {
	MediaPlayer mediaadapter;
	@Override
	public void play(String audiotype, String filename) {
		if (audiotype.equalsIgnoreCase("mp3")) {
			System.out.println("mp3 player:"+filename);
		}
		else if(audiotype.equalsIgnoreCase("VLC")||audiotype.equalsIgnoreCase("mp4")) 
		{
			mediaadapter= new MediaAdapter(audiotype);
			mediaadapter.play(audiotype, filename);
			
		}else {
			System.out.println("invalid media");
		}
		
	}

}
