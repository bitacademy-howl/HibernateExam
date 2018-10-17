package deprecated;


//import org.hibernate.annotations.Entity;
//
//@Entity(name="Music_table")
public class MusicVO {
	private int musicID;
	private String musicTitle;
	private String genre;
	private String hash_tags;
	private String lyrics;
	private String musicNode;
	private int albumID;
	private int composerID;
	private int lyricstID;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MusicVO(");
		sb.append("musicID : ");
		sb.append(musicID);
		sb.append(", musicTitle : ");
		sb.append(musicTitle);
		sb.append(", genre : ");
		sb.append(genre);
		sb.append(", albumID : ");
		sb.append(albumID);
		sb.append(")");
		return sb.toString();
	}
	
	public int getMusicID() {
		return musicID;
	}
	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHash_tags() {
		return hash_tags;
	}
	public void setHash_tags(String hash_tags) {
		this.hash_tags = hash_tags;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getMusicNode() {
		return musicNode;
	}
	public void setMusicNode(String musicNode) {
		this.musicNode = musicNode;
	}
	public int getAlbumID() {
		return albumID;
	}
	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	public int getComposerID() {
		return composerID;
	}
	public void setComposerID(int composerID) {
		this.composerID = composerID;
	}
	public int getLyricstID() {
		return lyricstID;
	}
	public void setLyricstID(int lyricstID) {
		this.lyricstID = lyricstID;
	}
}
