package Adapterother;

public class Main
{
public static void main(String[] args) {
	Audioplayer audio = new Audioplayer();
	audio.play("mp3", "abc.mp3");
	audio.play("mp4", "aac.mp4");
	audio.play("VLC", "vlc.vlc");
}
}
