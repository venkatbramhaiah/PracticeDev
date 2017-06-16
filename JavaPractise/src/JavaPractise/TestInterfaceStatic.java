package JavaPractise;

class TestInterfaceStatic{  
 int data=50;  
  
 void change(TestInterfaceStatic data1){  
 data1.data=data1.data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
	 TestInterfaceStatic op=new TestInterfaceStatic();  
  
   System.out.println("before change "+op.data);  
   op.change(op);  
   System.out.println("after change "+op.data);  
  
 }  
}  