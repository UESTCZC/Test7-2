
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
		String []firstName={"张","独孤","宇智波","慕容","刘","秦","叶","马","岳","狗","欧阳"};
		String []lastName={"尼玛","狗蛋","赵四","铁柱","本山","东北","莽子","沙雕","不群","冠西","德华"};
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
		case 0:lastName="尼玛";break;
		case 1:lastName="狗蛋";break;
		case 2:lastName="赵四";break;
		case 3:lastName="铁柱";break;
		case 4:lastName="本山";break;
		case 5:lastName="东北";break;
		case 6:lastName="莽子";break;
		case 7:lastName="沙雕";break;
		case 8:lastName="不群";break;
		case 9:lastName="冠西";break;
		default:System.exit(0);
		}
		 return name=firstName.concat(lastName);
	}*/
	public void setSex(){
		Random r=new Random();
		String qunSex[]={"男","女"};
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
