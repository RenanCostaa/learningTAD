class Elemento {
  private Integer info;
  private Elemento proximo;

  public Elemento() {
    this.info = null;
    this.proximo = null;
  }

  public void adicionaElemento(Integer info, Elemento prox){
    this.info=info;
    this.proximo=prox;
  }
  public void adicionaUltimoElemento(Integer info){
    this.info=info;
    this.proximo=null;
  }

  public Integer getInfo() {
    return this.info;
  }

  public void setInfo(Integer a) {
    this.info = a;
  }

  public Elemento getProximo() {
    return this.proximo;
  }

  public void setProximo(Elemento prox) {
    this.proximo = prox;
  }
}