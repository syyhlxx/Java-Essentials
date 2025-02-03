package CodeSamples;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Transporter {
	
	
	
	public static void main(String[] args) {
		
		StarfleetOfficer cmdDecker = new StarfleetOfficer("Decker Unit","Commander",000);

	    try (FileOutputStream fileOut = new FileOutputStream("person.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	        out.writeObject(cmdDecker);
	        System.out.println("Starfleet officer has been saved in transport buffer person.ser");
	    } catch (IOException i) {
	        i.printStackTrace();
	    }
	    
	    StarfleetOfficer officer = null;

	    try (FileInputStream fileIn = new FileInputStream("person.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn)) {
	        officer = (StarfleetOfficer) in.readObject();
	        System.out.println("Deserialized Person...");
	        System.out.println("Name: " + officer.getName());
	        System.out.println("Rank: " + officer.getRank());
	        System.out.println("SerialNumber: " + officer.getSerialNumber());
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public static class StarfleetOfficer implements Serializable {
	    private static final long serialVersionUID = 1L; // Recommended for version control
	    private String name;
	    private String rank;
	    private int serialNum;

	    public StarfleetOfficer(String name, String rank, int serialNum) {
	        this.name = name;
	        this.rank = rank;
	        this.serialNum = serialNum;
	    } // Getters and setters
	    
	    // Getter method
	    public String getName() {
	        return name;
	    }
	    
	    // Getter method
	    public String getRank() {
	        return rank;
	    }
	    
	    // Getter method
	    public int getSerialNumber() {
	        return serialNum;
	    }

	
	

}
	
	
	   
}


