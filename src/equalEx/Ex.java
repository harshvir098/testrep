package equalEx;

public class Ex implements Comparable<Ex>{

    int length;
    int wid;
    int height;
    String nombre;

    public Ex(String nombre, int length, int wid, int height) {
        super();
        this.length = length;
        this.wid = wid;
        this.height = height;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    int calcularVolumen() {
        return length * wid * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ex)) return false;
        Ex deposito = (Ex) obj;
        return (this.length * this.height * this.wid) == (deposito.length * deposito.wid * deposito.height);
    }

    @Override
    public int compareTo(Ex o) {
        int vol1 = this.length * this.height * this.wid;
        int vol2 = o.length * o.height * o.wid;

        if (vol1 < vol2) {
            return -1;
        } else if (vol1 > vol2) {
            return 1;
        } else {
            return 0;
        }
    }
}


