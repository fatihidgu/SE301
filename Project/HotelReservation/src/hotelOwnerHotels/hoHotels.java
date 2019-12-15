package hotelOwnerHotels;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

public class hoHotels {
	private String name;
	private String location;
	private int quality;
	private int costs;
	private int vrooms;
	private int coste;
	private int vroome;
	private int costp;
	private int vroomp;
	private char isactive;
	private char isaccepted;
	private int oldid;
	private String hemail;
	
	public hoHotels(String name, String location, int quality, int costs, int vrooms, int coste, int vroome, int costp, int vroomp, char isactive, char isaccepted) {
		this.name = name;
		this.location = location;
		this.quality = quality;
		this.costs = costs;
		this.vrooms = vrooms;
		this.coste = coste;
		this.vroome = vroome;
		this.costp = costp;
		this.vroomp = vroomp;
		this.isactive = isactive;
		this.isaccepted = isaccepted;
	}
	public hoHotels(String name, String location,String email, int oldid) {
		//admin �zel
		this.name = name;
		this.location = location;
		this.oldid=oldid;
		this.hemail=email;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getQuality() {
		return quality;
	}
	
	public int getCosts() {
		return costs;
	}
	
	public int getVrooms() {
		return vrooms;
	}
	
	public int getCoste() {
		return coste;
	}
	
	public int getVroome() {
		return vroome;
	}
	
	public int getCostp() {
		return costp;
	}
	
	public int getVroomp() {
		return vroomp;
	}
	
	public char getIsactive() {
		return isactive;
	}
	
	public char getIsaccepted() {
		return isaccepted;
	}
	public int getOldid() {
		return oldid;
	}
	public void setOldid(int oldid) {
		this.oldid = oldid;
	}
	public String getHemail() {
		return hemail;
	}
	public void setHemail(String hemail) {
		this.hemail = hemail;
	}


}