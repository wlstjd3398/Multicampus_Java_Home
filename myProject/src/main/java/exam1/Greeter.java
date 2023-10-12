package exam1;

public class Greeter {

		private String format;
		
		public Greeter() {
			
		}
	
		public void  setFomat(String format) {
			this.format = format;
		}
		
		public String greet(String guest) {
			return String.format(this.format, guest);
		}
		
}
