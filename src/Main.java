public class Main {

    public static void main(String[] args) {
        Pessoa[] p=new Pessoa[2];
        Livro[] l=new Livro[3];

        p[0]=new Pessoa("Adriano", 39,"M");
        p[1]=new Pessoa("Hadassa", 7, "F");

        l[0]=new Livro("Alice no País das Maravilhas","Vila Lobos",200,p[1]);
        l[1]=new Livro("Bíblia Sagrada","Jeová",2000,p[0]);
        l[2]=new Livro("JAVA", "Jorge Fonseca", 800,p[0]);
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        l[0].fechar();
        System.out.println(l[0].detalhes());
        System.out.println(p[0].toString());
        p[0].fazerAniversario();
        System.out.println(p[0].toString());
        p[1].fazerAniversario();
        System.out.println(p[1].toString());
        l[2].abrir();

        l[2].folhear(20);
        l[2].voltarPag();
        System.out.println(l[2].detalhes());
        l[1].abrir();
        l[1].folhear(1200);
        l[1].avancarPag();
        l[1].avancarPag();
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        l[1].fechar();
        System.out.println(l[1].detalhes());
        l[1].abrir();
        l[1].folhear(1999);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        l[1].avancarPag();





    }
}
