package projetofaculdade;
class Ponto {
    // Atributos
    private int x,y;
    // Construtores
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
     public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    // Métodos 
    public boolean PontosIguais(Ponto pontoB) {
        if (this.getX() == pontoB.getX() && this.getY() == pontoB.getY()) {
            return true;
        } else {
            return false;
        }
    }
    public double Distancia(Ponto pontoB) {
        double D = Math.sqrt(Math.pow((pontoB.getX() - this.getX()),2)
        + Math.pow((pontoB.getY() - this.getY()),2) );
        return Math.round(D);
    } 
}


