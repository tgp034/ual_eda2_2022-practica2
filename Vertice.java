package practica2grafo;
import java.util.ArrayList;

/*
 * Cada instancia a esta clase representa cada vertice
 * Cada vertice tiene asociado una etiqueta
 * Por tanto, la existencia de esta no permite vértices duplicados
 * El array de lista vecindad contiene las aristas incidentes al vértice
*/


public class Vertice
{
 
    private ArrayList<Arista> aristasAdy;
    private String nombre;

    public Vertice (String nombre)
    {
    	this.nombre = nombre;
    	this.aristasAdy = new ArrayList<Arista>();
    }

    /**
     * Añade un objeto Arista al array de lista vecindad
     * si y solo este no esté contenido en dicho array de lista 
     * @param arista. Objeto a añadir
     */
    public void insertarAdyacente(Arista arista)
    {
    	if( !this.aristasAdy.contains(arista))
    		this.aristasAdy.add(arista);
    }

    /**
     * Comprueba si la arista incide en este vertice
     * @param arista. Objeto a evaluar
     * @return true. Si y solo si el objeto esta contenido en el array de adyacencia
     */
    public boolean contieneAdyacente(Arista arista)
    {
    	return this.aristasAdy.contains(arista);
    }

    /**
     * @param indice. Indica la posicion a extraer
     * @return Arista. La arista apuntada por el índice en el array de adyacencia
     */
    public Arista getAdyacente(int indice)
    {
    	return this.aristasAdy.get(indice);
    }

    /**
     * Se elimina una arista del array de lista vecindad mediante posición
     * @param indice. Indica la posicion a eliminar
     * @return Arista. La Arista que ha sido eliminada del array de lista vecindad
     */
    public Arista eliminarAdyacente(int indice)
    {
    	return this.aristasAdy.remove(indice);
    }


    /**
     * Se elimina el objeto Arista del array de lista vecindad mediante
     * el identificando la referencia del objeto Arista
     * @param arista. indice el objeto Arista a eliminar
     */
    public void eliminarAdyacente(Arista arista)
    {
    	this.aristasAdy.remove(arista);
    }

    /**
     * @return int. Se devuelve el número de aristas incidentes (o vecinos) 
     * tiene el vértice en el array de lista vecindad
     */
    public int ContarAdyacentes()
    {
    	return this.aristasAdy.size();
    }

    /**
     * @return String. Devuelve el valor de la cadena etiqueta
     */
    public String getNombre()
    {
    	return this.nombre;
    }

    /**
     * Se comprueba si vertice2 es un objeto de tipo Vertice
     * En tal caso podemos convertirlo de Object a Vertice
     * Y por último evaluamos si contiene el mismo valor que el objeto vertice actual
     * Para ello las etiquetas deben coincidir(son únicas para cada objeto Vertice) 
     * @param vertice2. Objeto que comparamos con el vertice para 
     * evaluar si son el mismo objeto
     * @return true. Efectivamente son el mismo objeto
     */
    public boolean equals(Object vertice2)
    {
	if( !(vertice2 instanceof Vertice))
	    return false;

	Vertice v = (Vertice) vertice2;
	return this.nombre.equals(v.nombre);
    }

    /**
     * @return String. Representación del vértice en una cadena
     */
    public String toString()
    {
	return "Vertice: " + this.nombre;
    }


    /**
     * @return int. Código hash para este vértice
     **/
    public int hashCode()
    {
	return this.getNombre().hashCode();
    }
    
    /**
     * @return ArrayList<Arista>. Copia del array de adyacencias
     */ 
    public ArrayList<Arista> getAdyacentes()
    {
	return new ArrayList<Arista>(this.aristasAdy);
    }
}
