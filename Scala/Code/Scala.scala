import java.math.BigDecimal;
class Scala extends leikr.Engine {

	var x:Array[Int] = new Array[Int](10)
	var y:Array[Int] = new Array[Int](10)

	var dx:Array[Int] = new Array[Int](10)
	var dy:Array[Int] = new Array[Int](10)

	var width:BigDecimal = new BigDecimal(10)
	var height:BigDecimal = new BigDecimal(10)
	
  	override def create(): Unit = {
		for( i <- 0 to 9){
			x(i) = randInt(0, 221)
			y(i) = randInt(0, 161)
			
			dx(i) = randInt(-1, 2)
			dy(i) = randInt(-1, 2)
		}
  	}
  	
  	override def update(delta: Float): Unit = {
		for( i <- 0 to 9){
			if(x(i) < 0) dx(i) = 1;
			else if (x(i) > 230) dx(i) = -1;

			if(y(i) < 0) dy(i) = 1;
			else if (y(i) > 150) dy(i) = -1;

			x(i) += dx(i);
			y(i) += dy(i);
		}
  	}
  	
	override def render(): Unit = {
		for(i <- 0 to 9){      
			setColor(10+i)
			fillRect(new BigDecimal(x(i)), new BigDecimal(y(i)), width, height)
		}
	}
}	
