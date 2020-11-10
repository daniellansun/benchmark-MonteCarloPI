@groovy.transform.CompileStatic
class MonteCarloPI {
	static void main(String[] args) {
		int nThrows = 0; int nSuccess = 0;
		double x, y;
		long then = System.nanoTime();
		int events=(int)1e8;
		for (int i = 0; i < events; i++)   {
		   x = Math.random(); y = Math.random();     // Throw a dart                   
		   nThrows++;
		   if ( x*x + y*y <= 1 )  nSuccess++;
		}
		double itime = (System.nanoTime() - then)/1e6;
		System.out.println("Time for calculations (ms): " + itime+"\n");
		System.out.println("Pi = " + 4*(float)nSuccess/(float)nThrows +"\n");
	}
}