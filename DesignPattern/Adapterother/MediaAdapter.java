package Adapterother;

public class MediaAdapter implements MediaPlayer  {

	AdvanceMediaPlayer advanceplay;
	 public MediaAdapter (String Audiotype) 
	 {
		 if (Audiotype.equalsIgnoreCase("VLC"))
		 {
			
			 advanceplay = new VlcPlayer();
		}
		 else if(Audiotype.equalsIgnoreCase("MP4")) 
		 {
			 
			 advanceplay = new Mp4Player(); 
		 }
		 
	 }
	@Override
	public void play(String audiotype, String filename) {
		
		if (audiotype.equalsIgnoreCase("VLC"))
		 {
			
			 advanceplay.PlayVlc(filename);
		}
		 else if(audiotype.equalsIgnoreCase("MP4")) 
		 {
			 
			 advanceplay.playMp4(filename);
		 }
	}

}
