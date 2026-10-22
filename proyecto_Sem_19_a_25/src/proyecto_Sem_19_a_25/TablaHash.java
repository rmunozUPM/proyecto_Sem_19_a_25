package proyecto_Sem_19_a_25;
import java.util.ArrayList;
import java.util.List;

public class TablaHash {
	private List<String>[] tabla;
	public TablaHash(int size) {
		tabla = new List[size];
		for(int i = 0;i<tabla.length;i++)
			tabla[i]=new ArrayList<String>();		
	}
	private int hash (String s) {
		return Math.abs(s.hashCode()%tabla.length);
	}
	
	public void add(String s) {
		int h = hash(s);
		if(!tabla[h].contains(s))
			tabla[h].add(s);
	}
	
	public void remove (String s) {
		int h = hash(s);
		tabla[h].remove(s);
	}
	
	public boolean contains (String s) {
		int h = hash(s);
		return tabla[h].contains(s);
	}
	
}

