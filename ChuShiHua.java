
import java.util.Random;

public class ChuShiHua {
	protected  int []realIdNumber=new int[30];
	protected String []qunName=new String[30];
	
	public ChuShiHua() {
		setIdNumber();
		setName( );
	}
	
		// TODO �Զ����ɵĹ��캯�����
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
		String []firstName={"��","����","���ǲ�","Ľ��","��","��","Ҷ","��","��","��","ŷ��"};
		String []lastName={"����","����","����","����","��ɽ","����","����","ɳ��","��Ⱥ","����","�»�"};
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
