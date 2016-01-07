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
	    _min = data[x];
	    for (int y = x; y<data.length; y++){
		hold = _min;
		_min = Math.min(_min, data[y]);
		if (!(hold==_min)){
		    data[y]=data[x];
		    data[x]=_min;
		}
	    }
	    printArray(data);
	}
    }

    public static void bubbleSort(int[] data){
	boolean swap = true;
	int pass = 0;
	int hold = 0;
	while (swap){
	    swap = false;
	    pass++;
	    for (int x = 0; x<data.length-pass; x++){
		if (data[x]>data[x+1]){
		    hold = data[x];
		    data[x]=data[x+1];
		    data[x+1]=hold;
		    swap = true;
		}
	    }
	    printArray(data);
	}
    }

    public static void main(String[]args){
	int[] thing = { 1 , 2,  9, 5, 0, 3};
	Sorts.bubbleSort(thing);
    }

}