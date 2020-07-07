package tp8.IShapeShifte;


import java.util.List;

public interface IShapeShifte {
	
		public IShapeShifte compose(IShapeShifte ss); 
		public int deepest();
		public IShapeShifte flat();
		public List<Integer> values();
		
	

}