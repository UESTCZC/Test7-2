
public class StuScore {
		private int i;
		private int []copyGrade=new int[30];
		private int []copyNeiBuBianHao=new int[30];
	/*public StuScore() {
		// TODO 自动生成的构造函数存根private int i;

	
		}*/
	   
		public StuScore(Student student[]) {
			// 这是先把前两个元素排好位置，再把第三个排好位，以此类推，要排序的元素之前都是排好了的
			luRuGrade( student);
			for (int j = 1; j < copyGrade.length; j++) {// 这个算法只能从数组的第二个值开始，若从第三个开始考虑2 3
												// 1这种情况
				int key = copyGrade[j];
				int keyNeiBu=copyNeiBuBianHao[j];// 设计标记
				i = j - 1;
				while (i >= 0 && copyGrade[i] <key) {// 从标记的前一个元素开始比较
					copyGrade[i + 1] = copyGrade[i];
					copyNeiBuBianHao[i+1]=copyNeiBuBianHao[i];// （只是起一个移位作用）条件成立说明前一个比标记大，则将前一个元素赋值给后一个元素
					i = i - 1;// 然后又从前 前一个元素开始比较标记key，若前前元素也比标记大
				}
				copyGrade[i + 1] = key;
				copyNeiBuBianHao[i+1]=keyNeiBu;
				//System.out.println("修改测试");//只是起一个移位作用
			}
			System.out.println("\n"+"\n"+"\n"+"以下是对成绩的排序");
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
	
