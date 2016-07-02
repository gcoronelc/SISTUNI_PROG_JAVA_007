package uni.sistemas.model;

public class Matematica {

	// constructor
	public Matematica() {

	}

	// metodos sobrecargados
	public float Promedio(float x, float y) {
		return (x + y) / 2.0F;
	}

	public float Promedio(float x, float y, float z) {
		return (x + y + z) / 3.0F;
	}

	public float Promedio(float x, float y, float z, float w) {
		return (x + y + z + w) / 4.0F;
	}

	public float Promedio(float x, float y, float z, float w, float u) {
		return (x + y + z + w + u) / 5.0F;
	}

}
