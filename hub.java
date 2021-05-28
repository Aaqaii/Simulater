package simulater;
public class hub {
String data;
int mac;
public device A,B,C,D,E;
public hub() {
	data="0";
	mac=0;
	
}
hub(device A,device B,device C,device D,device E ){
	data="0";
	mac=0;
	this.A=A;
	this.B=B;
	this.C=C;
	this.D=D;
	this.E=E;
}public void store(int mac,String x,char s) {
	this.mac=mac;
	this.data=x;
	send(s);
}
private void send(char s) {
	if(s=='A') {
		if(mac==B.mac && data==B.data) 
			System.out.println("Data accepted by B and data send to it is "+data);
		else
			System.out.println("discard the data by B");
		if(mac==C.mac && data==C.data) 
			System.out.println("Data accepted by C and data send to it is "+data);
		else
			System.out.println("discard the data by C");
		if(mac==D.mac && data==D.data) 
			System.out.println("Data accepted by D and data send to it is "+data);
		else
			System.out.println("discard the data by D");
		if(mac==E.mac && data==E.data) 
			System.out.println("Data accepted by E and data send to it is "+data);
		else
			System.out.println("discard the data by E");
		
	}
	if(s=='B') {
		if(mac==A.mac && data==A.data) 
			System.out.println("Data accepted by A and data send to it is "+data);
		else
			System.out.println("discard the data by A");
		if(mac==C.mac && data==C.data) 
			System.out.println("Data accepted by C and data send to it is "+data);
		else
			System.out.println("discard the data by C");
		if(mac==D.mac && data==D.data) 
			System.out.println("Data accepted by D and data send to it is "+data);
		else
			System.out.println("discard the data by D");
		if(mac==E.mac && data==E.data) 
			System.out.println("Data accepted by E and data send to it is "+data);
		else
			System.out.println("discard the data by E");
		
	}
	if(s=='C') {
		if(mac==B.mac && data==B.data) 
			System.out.println("Data accepted by B and data send to it is "+data);
		else
			System.out.println("discard the data by B");
		if(mac==A.mac && data==A.data) 
			System.out.println("Data accepted by A and data send to it is "+data);
		else
			System.out.println("discard the data by A");
		if(mac==D.mac && data==D.data) 
			System.out.println("Data accepted by D and data send to it is "+data);
		else
			System.out.println("discard the data by D");
		if(mac==E.mac && data==E.data) 
			System.out.println("Data accepted by E and data send to it is "+data);
		else
			System.out.println("discard the data by E");
		
	}
	if(s=='D') {
		if(mac==B.mac && data==B.data) 
			System.out.println("Data accepted by B and data send to it is "+data);
		else
			System.out.println("discard the data by B");
		if(mac==C.mac && data==C.data) 
			System.out.println("Data accepted by C and data send to it is "+data);
		else
			System.out.println("discard the data by C");
		if(mac==A.mac && data==A.data) 
			System.out.println("Data accepted by A and data send to it is "+data);
		else
			System.out.println("discard the data by A");
		if(mac==E.mac && data==E.data) 
			System.out.println("Data accepted by E and data send to it is "+data);
		else
			System.out.println("discard the data by E");
		
	}
	if(s=='E') {
		if(mac==B.mac && data==B.data) 
			System.out.println("Data accepted by B and data send to it is "+data);
		else
			System.out.println("discard the data by B");
		if(mac==C.mac && data==C.data) 
			System.out.println("Data accepted by C and data send to it is "+data);
		else
			System.out.println("discard the data by C");
		if(mac==A.mac && data==A.data) 
			System.out.println("Data accepted by A and data send to it is "+data);
		else
			System.out.println("discard the data by A");
		if(mac==D.mac && data==D.data) 
			System.out.println("Mac Address matched with D and data send to it is "+data);
		else
			System.out.println("discard the data by D");
		
	}
	
}
}
