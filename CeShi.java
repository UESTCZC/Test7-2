import java.awt.List;
import java.util.ArrayList;


public class CeShi {

	public CeShi() {
		// TODO 自动生成的构造函数存根
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list=new ArrayList();
		ChuShiHua s=new ChuShiHua();
		Student []student=new Student[30];
		int []qunGrade=new int[30];
		for(int a=0;a<30;a++){	
			student[a]=new Student(a,s);
		student[a].show();	
			
		}
		StuScore stuScore=new StuScore(student);
		/*for(int i=0;i<student.length;i++){
			list.add(student[i]);
		}*/
		
		
	}

}
