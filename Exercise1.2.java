class Bicycle
{
	// Class Attributes
	private String ownerName ;
    private String tagNo ;
    // Constructors
	public Bicycle (){
		ownerName = "unknown" ;
		tagNo = "none" ; 
	}
	// new constructor w/ parameters (exercise 1.2)
	public Bicycle (String IDtag, String name){
		tagNo = IDtag ;
		ownerName = name ;
	}
	
	public String getOwnerName(){
		return ownerName ;
	}	
	public void setOwnerName (String name) {
		ownerName = name ;
	}
	public String getTagNo (){
		return tagNo ;
	}
	public void setTagNo (String tag){
		tagNo = tag ;
	}

}



