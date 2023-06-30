package Aula07;

public class Cell {
	 private String cellName;
	 private boolean doorIsOpen;
	 private int securityCode;
	 
	 public Cell (String cellName, boolean doorIsOpen, int securityCode) {
		 this.cellName = cellName;
		 this.doorIsOpen = doorIsOpen;
		 this.securityCode = securityCode;
	 }
	 
	 public void setIsOpen(int code){
	        if(code != securityCode){
	            System.out.println("Incorrect code");
	        }
	        else{
	            if(doorIsOpen == true){
	                doorIsOpen = false;
	                System.out.println("Cell " +cellName +" Closed");
	            }
	            else{
	                doorIsOpen = true;
	                System.out.println("Cell " +cellName +" Open");
	            }
	        }
	 }

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public boolean isDoorIsOpen() {
		return doorIsOpen;
	}

	public void setDoorIsOpen(boolean doorIsOpen) {
		this.doorIsOpen = doorIsOpen;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	 
	 
	 
}