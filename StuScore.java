
public class StuScore {
		private int i;
		private int []copyGrade=new int[30];
		private int []copyNeiBuBianHao=new int[30];
	/*public StuScore() {
		// TODO �Զ����ɵĹ��캯�����private int i;

	
		}*/
	   
		public StuScore(Student student[]) {
			// �����Ȱ�ǰ����Ԫ���ź�λ�ã��ٰѵ������ź�λ���Դ����ƣ�Ҫ�����Ԫ��֮ǰ�����ź��˵�
			luRuGrade( student);
			for (int j = 1; j < copyGrade.length; j++) {// ����㷨ֻ�ܴ�����ĵڶ���ֵ��ʼ�����ӵ�������ʼ����2 3
												// 1�������
				int key = copyGrade[j];
				int keyNeiBu=copyNeiBuBianHao[j];// ��Ʊ��
				i = j - 1;
				while (i >= 0 && copyGrade[i] <key) {// �ӱ�ǵ�ǰһ��Ԫ�ؿ�ʼ�Ƚ�
					copyGrade[i + 1] = copyGrade[i];
					copyNeiBuBianHao[i+1]=copyNeiBuBianHao[i];// ��ֻ����һ����λ���ã���������˵��ǰһ���ȱ�Ǵ���ǰһ��Ԫ�ظ�ֵ����һ��Ԫ��
					i = i - 1;// Ȼ���ִ�ǰ ǰһ��Ԫ�ؿ�ʼ�Ƚϱ��key����ǰǰԪ��Ҳ�ȱ�Ǵ�
				}
				copyGrade[i + 1] = key;
				copyNeiBuBianHao[i+1]=keyNeiBu;
				//System.out.println("�޸Ĳ���");//ֻ����һ����λ����
			}
			System.out.println("\n"+"\n"+"\n"+"�����ǶԳɼ�������");
			for(int k=0;k<copyNeiBuBianHao.length;k++){
				int l=copyNeiBuBianHao[k];
				student[l].show();
			}
		}
		public void luRuGrade(Student student[]){
			for(int i=0;i<student.length;i++){
				copyGrade[i]=student[i].getGrade();
				copyNeiBuBianHao[i]=student[i].getNeiBuBianHao();
			}
		}
		
		
	}
	
