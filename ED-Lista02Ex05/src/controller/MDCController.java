package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	
	public int MDC(int x, int y) {
		if(x == y) {
			return x;
		}else if(x > y){
			return MDC(x - y, y);
		}else {
			return MDC(y, x);
		}
	}

}
