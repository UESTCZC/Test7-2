
import java.util.*;

public class Student {
	private String name;
	private int idNumber;
	private String sex;
	private int grade;
	private int neiBuBianHao;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int i,ChuShiHua s) {
		
		setSex();
		setScore();
		this.name=s.qunName[i];
		this.idNumber=s.realIdNumber[i];
		this.neiBuBianHao=i;
		
	}
	/*public String setName(int m){
		String []firstName={"��","����","���ǲ�","Ľ��","��","��","Ҷ","��","��","��","ŷ��"};
		String []lastName={"����","����","����","����","��ɽ","����","ç��","ɳ��","��Ⱥ","����","�»�"};
		Random r=new Random();
		String []qunName=new String[30];
		for(int i=0;i<qunName.length;i++){
			qunName[i]=firstName[r.nextInt(11)]+lastName[r.nextInt(11)];
			for(int j=0;j<qunName.length;j++){
				if(qunName[i].equals(qunName[j])){
			    i--;
				break;
				}
			}
		}
	return qunName[m];
		String lastName=new String();
		switch(r.nextInt(10)){
		case 0:lastName="����";break;
		case 1:lastName="����";break;
		case 2:lastName="����";break;
		case 3:lastName="����";break;
		case 4:lastName="��ɽ";break;
		case 5:lastName="����";break;
		case 6:lastName="ç��";break;
		case 7:lastName="ɳ��";break;
		case 8:lastName="��Ⱥ";break;
		case 9:lastName="����";break;
		default:System.exit(0);
		}
		 return name=firstName.concat(lastName);
	}*/
	public void setSex(){
		Random r=new Random();
		String qunSex[]={"��","Ů"};
		this.sex=qunSex[r.nextInt(2)];
	
	}
	

	public void setScore() {
		Random r=new Random();
		this.grade=r.nextInt(41)+60;
		
		// TODO Auto-generated constructor stub
		/*int number=20070301;
		for(int i=0;i<idNumber.length;i++){
			idNumber[i]=number;
			number++;*/
		}
	
	/*public int setIdNumber(){
		int  []qunIdNumber=new int[30];
		int a=20070301;
		for(int i=0;i<qunIdNumber.length;i++){
			qunIdNumber[i]=a;
			a++;
		}
		Random r=new Random();
		int []realIdNumber=new int[30];
		for(int i=0;i<qunIdNumber.length;i++){
			realIdNumber[i]=qunIdNumber[r.nextInt(30)];
			for(int j=0;j<qunIdNumber.length;j++){
				if(realIdNumber[i]==qunIdNumber[j]){
			    i--;
				break;
				}
			}
	}
	}*/
	public int getGrade(){
		return grade;
	}
	public int getNeiBuBianHao() {
		
		return neiBuBianHao;
	}

	

	public void show(){
		System.out.println(idNumber+"  "+name+"      "+"\t"+sex+"     "+grade);
	}
}
