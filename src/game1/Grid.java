package game1;

public class Grid {
//	private int num;
//	private int beixuan[];
//	private int zhen;
	
	public int num;
	public int beixuan[];
	public int zhen;
	public int row;
	public int line;
	Grid(){//初始化
		beixuan=new int [9];
		for(int i=0;i<9;i++){
			beixuan[i]=i+1;
		}
		this.zhen=-1;
		this.num=0;
		this.row=0;
		this.line=0;
	}
	
	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int[] getBeixuan(){
		return beixuan;
	}
	public void setBeixuan(int beixuan[]){
		this.beixuan=beixuan;
	}
	public int getZhen(){
		return this.zhen;
	}
	public void setZhen(int zhen){
		this.zhen=zhen;
	}
}
