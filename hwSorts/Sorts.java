public class Sorts{
    public static void printArray(int[] data){
	String otpt = "["+data[0];
	for (int x = 1; x<data.length; x++){
	    otpt += ", "+data[x];
	}
	otpt+="]";
	System.out.println(otpt);
    }
    
    public static void selectionSort(int[] data){
	int _min = data[0];
	int hold = 0;
	int index = 0;
	printArray(data);
	for (int x = 0; x<data.length; x++){
	    for (int y = x; y<data.length; x++){
		hold = _min;
		_min = Math.min(_min, data[y]);
		if (!(hold==_min)){
		    index = y;
		}
	    }
	    data[index]=data[x];
	    printArray(data);
	}
    }

    public static void main(String[]args){
	int[] thing = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.selectionSort(thing);
    }

}