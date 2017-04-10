
import java.util.Random;

public class ChuShiHua {
	protected  int []realIdNumber=new int[30];
	protected String []qunName=new String[30];
	
	public ChuShiHua() {
		setIdNumber();
		setName( );
	}
	
		// TODO 自动生成的构造函数存根
	public void setIdNumber(){
		int  []qunIdNumber=new int[30];
		
		for(int i=0;i<qunIdNumber.length;i++){
			qunIdNumber[i]=1;
		}
		Random r=new Random();
		for(int i=0;i<qunIdNumber.length;i++){
			realIdNumber[i]=r.nextInt(30)+20070301;
			for(int j=0;j<qunIdNumber.length;j++){
				if(realIdNumber[i]==qunIdNumber[j]){
			    i--;
				break;
				}
			}
					qunIdNumber[i]=realIdNumber[i];
					
					
				
			
		}
	
	}
	
	public void setName(){
		String []firstName={"张","独孤","宇智波","慕容","刘","秦","叶","马","岳","狗","欧阳"};
		String []lastName={"尼玛","狗蛋","赵四","铁柱","本山","东北","钢牙","沙雕","不群","冠西","德华"};
		Random r=new Random();
		String[] nameTemp = new String[30];
		for (int a = 0; a < nameTemp.length; a++) {
			nameTemp[a] = "a";
		}

		for(int i=0;i<qunName.length;i++){
			qunName[i]=firstName[r.nextInt(11)]+lastName[r.nextInt(11)];
			for(int j=0;j<qunName.length;j++){
				if(qunName[i].equals(nameTemp[j])){
			    i--;
				break;
				}
			}
					nameTemp[i]=qunName[i];
					
					
				
			
		}
		
	}
	
		
}
