package JavaPractise;

class Rectangle{
	int width;
	int height;

	public Rectangle(int a, int b) {
		width=a;
		height=b;
	}
	
 int getArea(){
		return width*height;
	}
	
	
}

public class Testing {
	public static void main(String args[]){
	Rectangle obj= new Rectangle(10, 20);
int res=obj.getArea();
System.out.println(res);
	}


}
