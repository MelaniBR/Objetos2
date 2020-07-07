package tp8.IShapeShifte;


import java.util.ArrayList;
import java.util.List;

public class Comun implements IShapeShifte{
	
	private Integer value;
	
	public Comun(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public IShapeShifte compose(IShapeShifte ss) {
		Compuesto resultado =  new Compuesto(this, ss);
		return resultado;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifte flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
	List<Integer> valuesIntegers=new ArrayList<Integer>();
	valuesIntegers.add(this.value);
		
		return valuesIntegers;
	}

}