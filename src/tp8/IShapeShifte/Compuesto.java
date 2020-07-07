package tp8.IShapeShifte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Compuesto implements IShapeShifte {
	
	private List<IShapeShifte> shapeShifters;
	
	public Compuesto(IShapeShifte ss1, IShapeShifte ss2) {
		this.shapeShifters = new ArrayList<IShapeShifte>();
		this.shapeShifters.add(ss1);
		this.shapeShifters.add(ss2);
	}

	@Override
	public IShapeShifte compose(IShapeShifte ss) {
		IShapeShifte shipeShifte = new Compuesto(this,ss);
		
		return shipeShifte;
	}
	
	/*
	 * 
		a.deepest() es igual a 0. c.deepest() es igual a 1. f.deepest() es igual a 3.
	 */
	
	@Override
	public int deepest() {
		Integer maximaProfundidadOrdenada = shapeShifters.stream().mapToInt(ss-> ss.deepest()).sum();
		
                
		return  1 + maximaProfundidadOrdenada ;
	}

	@Override
	public IShapeShifte flat() {
		
			
				shapeShifters.stream().map(m -> m.flat());
			
		
		return this;
	}

	@Override
	public List<Integer> values() {
		
		return this.getShapeShifters().stream().flatMap(ss->ss.values().stream()).collect(Collectors.toList());
		
	}
	
	private List<IShapeShifte> getShapeShifters() {
		return this.shapeShifters;
	}

}