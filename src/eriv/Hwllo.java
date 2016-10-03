package eriv;

public class Hwllo {
	public static void main(String[] args){
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		lyrics=lyrics.replaceAll("it", "\"her\"");
		lyrics=lyrics.replaceFirst("Cannot", "Can't");
		System.out.println(lyrics);
	}
}
