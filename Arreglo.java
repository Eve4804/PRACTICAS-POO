/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Usuario
 */
public class Arreglos {
private String arr[][];
    private int cve;
    private String nombre;
    private String primerAp;
    private String mes;
    public String numero;
    public String vector[];

    public Arreglos(String[] vector)
    {
        this.vector = null;
    }

    public Arreglos()
    {
        this.arr = null;
    }

    public Arreglos(int c, String nom, String pap, String m, String num)
    {
        this.cve = c;
        this.mes = m;
        this.nombre = nom;
        this.primerAp = pap;
        this.numero = num;
    }

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public String[] getVector()
    {
        return vector;
    }

    public void setVector(String[] vector)
    {
        this.vector = vector;
    }

    /**
     * @return el arreglo
     */
    private String[][] getArr()
    {
        return this.arr;
    }

    public void setArr(String[][] arr)
    {
        this.arr = arr;
    }

    /*
    *@param arr
     */
    public int getCve()
    {
        return this.cve;
    }

    public void setCve(int c)
    {
        this.cve = c;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nom)
    {
        this.nombre = nom;
    }

    public String getPrimerAp()
    {
        return this.primerAp;
    }

    public void setPrimerAp(String pap)
    {
        this.primerAp = pap;
    }

    public String getMes()
    {
        return this.mes;
    }

    public void setMes(String m)
    {
        this.mes = m;
    }

    /**
     * El metodo insertar,se realiza en dos momentos de forma general: 1. cuando
     * el arreglo esta vacio 2. cuando el arreglo ya contiene algun registro
     *
     * @param c: es la clave
     * @param ap: es el apellido
     * @param m: es el mes
     * @param nom: es el nombre
     */
    public void insertat(String num)
    {
        int numero = Integer.parseInt(num); //con paseInt cualquier dato se puede pasar a Int
        if (this.getVector() == null)
        {
            this.setVector(new String[1]);//una posicion esta vacio
            this.vector[0] = num;
        } else
        {
            String tmp[] = new String[this.getVector().length + 1];
            tmp[this.getVector().length] = num;
            this.setVector(tmp);
        }
    }

    public void insertar(int c, String nom, String ap, String m)
    {
        String cve = Integer.toString(c);// con toString cualquier dato se puede pasar a string
        if (this.getArr() == null)
        {
            //el arreglo esta vacio
            this.setArr(new String[1][4]);
            this.arr[0][0] = cve;
            this.arr[0][1] = nom;
            this.arr[0][2] = ap;
            this.arr[0][3] = m;

        } else
        {
            //ya tiene algun dato o alguna informacion,se anexa algo nuevo
            String tmp[][] = new String[this.getArr().length + 1][4];
            System.arraycopy(this.getArr(), 0, tmp, 0, this.getArr().length);
            //asignar los datos al arreglo
            tmp[this.getArr().length][0] = cve;
            tmp[this.getArr().length][1] = nom;
            tmp[this.getArr().length][2] = ap;
            tmp[this.getArr().length][3] = m;
            //se guardan los datos 
            this.setArr(tmp);
        }
    }

    public void ordenamientoNum()
    {
        boolean ordenado = false;
        int count = 0;
        int i;
        while (ordenado)
        {
            for (i = 0; i <this.getVector().length; i++)
            {
                if (this.getVector()[i].equalsIgnoreCase(this.getVector()[i + 1]))
                {
                    String a = this.getVector()[i];
                    this.getVector()[i] = this.getVector()[i + 1];
                    count++;
                }
            }
            if(count==0){
                ordenado = true;
            }
            count =0;

        }
    }

    public void ordenamientoNom()
    {
        boolean ordenado = false;
        int count = 0;
        int i;

        while (ordenado)
        {
            //recorrer el arreglo
            for (i = 0; i < this.getArr().length; i++)
            {
                if (this.getArr()[i][1].equalsIgnoreCase(this.getArr()[i + 1][1]))
                {
                    //primera columna  0  
                    String f = this.getArr()[i][0];
                    this.getArr()[i][0] = this.getArr()[i + 1][1];
                    this.getArr()[i][0] = f;
                    //segunda columna  1
                    String z = this.getArr()[i][1];
                    this.getArr()[i][1] = this.getArr()[i + 1][1];
                    this.getArr()[i][1] = z;
                    //tercera columna  2
                    String w = this.getArr()[i][2];
                    this.getArr()[i][2] = this.getArr()[i + 1][2];
                    this.getArr()[i][2] = w;
                    //cuarta columna  3
                    String y = this.getArr()[i][3];
                    this.getArr()[i][3] = this.getArr()[i + 1][3];
                    this.getArr()[i][3] = y;

                    count++;
                }
            }
            if (count == 0)
            {
                ordenado = true;
            }
            count = 0;

        }

    }
    

  
    public int buscarClave(String cve)
    {
        String s = "";
        int k;
        cve = cve.replaceAll(" ", "");//trim
        if (this.getArr() == null)
        {
            return -1;//arreglo vacio
        } else
        {
            for (k = 0; k < 4; k++)
            {
                if (cve.equals(this.getArr()[k][0]))//comparar cadenas
                {
                    return k;//fue encontrado

                }

            }

        }
        return -2;//no encontrado
    }

    /**
     *
     * La funcion visualizaDatosCve realiza una busqueda de dato; si fue
     * encontrado regresamos en una variable de texto
     */
    public String visualizaDatosCve(String d)
    {
        String s = "";
        int i;
        if (this.getArr() == null)
        {
            return ""; //El arreglo esta vacio
        } else
        {
            for (i = 0; i < this.getArr().length; i++)
            {
                if (d.equals(this.getArr()[i][0]))
                {
                    s += "| Clave: " + this.getArr()[i][0] + "";
                    s += "| Nombre: " + this.getArr()[i][1] + "";
                    s += "| Primer Apellido: " + this.getArr()[i][2] + "";
                    s += "| Mes: " + this.getArr()[i][3] + "\n";
                    return s; //fue encontrado
                }
            }
        }
        if (s.isEmpty())
        {
            s = "Clave no encontrada!!";
        }

        return s;
    }

    /**
     * *
     * La funcion visualizaDatosMes
     */
    public String visualizaDatosMes(String d)
    {
        String s = "";
        int i;
        if (this.getArr() == null)
        {
            return ""; //El arreglo esta vacio
        } else
        {
            for (i = 3; i < this.getArr().length; i++)
            {
                if (d.equals(this.getArr()[i][3]))
                {
                    s += "| Clave: " + this.getArr()[i][0] + "";
                    s += "| Nombre: " + this.getArr()[i][1] + "";
                    s += "| Primer Apellido: " + this.getArr()[i][2] + "";
                    s += "| Mes: " + this.getArr()[i][3] + "\n";
                    return s; //fue encontrado
                }
            }
        }
        if (s.isEmpty())
        {
            s = "Clave no encontrada!!";
        }

        return s;
    }

    /**
     * Metodo eliminarCve, elimina una fila por su clave
     */
    public void eliminaCve(int cve)
    {
        if (this.getArr().length == 1)
        {
            this.setArr(null);//el arreglo vacio 
        } else
        {
            String tmp[][];
        }
        String tmp[][] = new String[this.getArr().length - 1][4];
        int j = 0, i;
        for (i = 0; i < this.getArr().length; i++)
        {
            if (i != cve)
            {
                tmp[j][0] = this.getArr()[i][0];
                tmp[j][1] = this.getArr()[i][1];
                tmp[j][2] = this.getArr()[i][2];
                tmp[j][3] = this.getArr()[i][3];
                j++;
            }
        }

        this.setArr(tmp);
    }

    /*La funcion visualisaArreglo() muestra todo el contenido
        del arreglo.
     */
    public String visualizaArreglos()
    {
        String s = "";
        int f, c;
        if (this.getArr() != null)
        {
            for (f = 0; f < this.getArr().length; f++)
            {
                for (c = 0; c < this.getArr().length; c++)
                {
                    if (c == 0)
                    {
                        s += "|Clave: " + this.getArr()[f][c] + " ";
                    }
                    if (c == 1)
                    {
                        s += "|Nombre: " + this.getArr()[f][c] + " ";
                    }
                    if (c == 2)
                    {
                        s += "|Primer Apellido: " + this.getArr()[f][c] + " ";
                    }
                    if (c == 3)
                    {
                        s += "|Mes: " + this.getArr()[f][c] + " \n";
                    }
                }

            }
        } else
        {
            s = "No hay datos";
        }

        return s;
    }
}
