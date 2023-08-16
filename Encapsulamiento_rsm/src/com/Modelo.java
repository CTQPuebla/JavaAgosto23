package com;

public class Modelo {

		private int x;
		protected String mensaje;
		public double decimal;
		
		public Modelo() {
			
		}

		public Modelo(int x, String mensaje, double decimal) {
			super();
			this.x = x;
			this.mensaje = mensaje;
			this.decimal = decimal;
			this.dosomething();//Metodo protected, accedido desde el interior de la clase
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}

		public double getDecimal() {
			return decimal;
		}

		public void setDecimal(double decimal) {
			this.decimal = decimal;
		}

		@Override
		public String toString() {
			return "Modelo [x=" + x + ", mensaje=" + mensaje + ", decimal=" + decimal + "]";
		}
		
		protected void dosomething () {
			System.out.println("hacer algo");
		}
		
}
