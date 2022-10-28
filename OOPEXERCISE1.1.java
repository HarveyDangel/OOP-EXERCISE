class Bicycle
{
	private String ownerName ;

	private String tagNo ; // add tagNo attribute 

	public Bicycle (){
		ownerName = "unknown" ;
		tagNo = "none" ; // add tagNo in the constructor
	}
	public String getOwnerName(){
		return ownerName ;
	}	
	public void setOwnerName (String name) {
		ownerName = name ;
	}
	public String getTagNo (){ // add tagNo method 
		return tagNo ;
	}
	public void setTagNo (String tag){
		tagNo = tag ;
	}

}
