package angrybird;

public class AngryBird {

    public static void main(String[] args)
    {
       Rojo PaRojo = new Rojo("Rojo","Circular","");
       Amarillo PaAmarillo = new Amarillo("Amarillo","Triangular","");
       Verdes PaVerdes = new Verdes("Verde","Circular","");
       Pajaro[] PajaritoVer;
        PajaritoVer = new Pajaro[]{new Pajaro("Verde","Circular","Jose"),new Pajaro("Verde","Circular","Juan"),new Pajaro("Verde","Circular","Jenny")};
       
       PajaritoVer[0].soy();
       PajaritoVer[0].Des();
       PajaritoVer[1].soy();
       PajaritoVer[1].Des();
       PajaritoVer[2].soy();
       PajaritoVer[2].Des();
       
       PaRojo.Tirarse();
       PaRojo.Des();
       PaAmarillo.Tirarse();
       PaAmarillo.Des();
       PaVerdes.Tirarse();
       PaVerdes.Des();
    }
}