public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        setPagAtual(0);
        setAberto(false);
        this.leitor = leitor;
    }

    @Override
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    @Override
    public void abrir() {
        if(!isAberto()) {
            setAberto(true);
        }else{
            System.out.println("Livro já está aberto");
        }

    }

    @Override
    public void fechar() {
        if(isAberto()) {
            setAberto(false);
            setPagAtual(0);
        } else {
            System.out.println("Livro já está fechado");
        }
    }
    @Override
    public void avancarPag() {
        if(isAberto()) {
            if(getPagAtual() < getTotPaginas()) {
                setPagAtual(this.pagAtual + 1);
            }else{
                System.out.println("Vocês está querendo acessar uma página que não existe");
            }
        }else{
            System.out.println("Livro está fechado");
        }
    }

    @Override
    public void voltarPag() {
        if(isAberto()) {
            if(getPagAtual()>=0) {
                setPagAtual(this.pagAtual-1);
            }else{
                System.out.println("Você está querendo acessar uma página que não existe");
            }
        }else{
            System.out.println("Livro está fechado");
        }

    }


    @Override
    public void folhear(int p) {
        if(isAberto()) {
            if((p >=0) && (p <= getTotPaginas())){
                this.setPagAtual(p);
            }else{
                System.out.println("Vocẽ estará querendo abrir uma página que não existe");

            }
        }else{
            System.out.println("Livro está fechado");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}