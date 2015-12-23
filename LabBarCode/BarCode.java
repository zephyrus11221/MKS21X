public class BarCode implements Comparable{
    // instance variables
    private String _zip = "";
    private int _checkDigit = 0; 
    private String zipnum = "";
    private int zipDigits = 0;
    private static final String[] digits={"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", 
                                   "|:::|", "|::|:", "|:|::"};
    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	zipnum=zip;
	char[] hold = zip.toCharArray();
	for (int x = 0; x<hold.length; x++){
	    _zip+=digits[hold[x]];
	    zipDigits+=hold[x]*10^(4-x);
	}

}
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	this._zip=x._zip;
	this._checkDigit=x._checkDigit;

}    
    
    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int _checkSum = 0;
	char[] hold = zipnum.toCharArray();
	for (int x = 0; x<hold.length; x++){
	    String dig = ""+hold[x];
	    _checkSum+=Integer.parseInt(dig);
	}
	return _checkSum%10;
    }
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	return "|" + zipnum +  _zip + digits[checkSum()] + "|";
    }
    
    
    public boolean equals(Object other){
	return (other instanceof BarCode) && (((BarCode)other)._zip.equals(_zip));
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.
    public int compareTo(Comparable other){
	return zipDigits-(BarCode)other.zipDigits;
    }
    // postcondition: compares the zip + checkdigit 
    
}