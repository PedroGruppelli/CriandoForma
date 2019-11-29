package Facade;
public class CriandoForma {
    private FormaIF triangulo;
    private FormaIF quadrilatero;
    private FormaIF pentagono;
    private FormaIF hexagono;
    private FormaIF heptagono;
    private FormaIF octogono;
    private FormaIF eneagono;
    private FormaIF decagono;
    private FormaIF undecagono;
    private FormaIF dodecagono;
    private FormaIF pentadecagono;
    private FormaIF icosagono;

    
    
    public CriandoForma() {
        triangulo = new Triangulo();
        quadrilatero = new Quadrilatero();
        pentagono = new Pentagono();
        hexagono = new Hexagono();
        heptagono = new Heptagono();
        octogono = new Octogono();
        eneagono = new Eneagono();
        decagono = new Decagono();
        undecagono = new Undecagono();
        dodecagono = new Dodecagono();
        pentadecagono = new Pentadecagono();
        icosagono = new Icosagono();
        
    }
    
    public void criarTriangulo() {
        triangulo.desenhar();
    }

    public void criarQuadrilatero() {
        quadrilatero.desenhar();
        
    }
    
    public void criarPentagono() {
        pentagono.desenhar();
    }    
        
    public void criarHexagono() {
        hexagono.desenhar();
    }
    
    public void criarHeptagono() {
        heptagono.desenhar();
    }
    
    public void criarOctogono() {
        octogono.desenhar();
    }
    
    public void criarEneagono() {
        eneagono.desenhar();
    }
    
    public void criarDecagono() {
        decagono.desenhar();
    }
    
    public void criarUndecagono() {
        undecagono.desenhar();
    }
    
    public void criarDodecagono() {
        dodecagono.desenhar();
    }
    
    public void criarPentadecagono() {
        pentadecagono.desenhar();
    }
    
    public void criarIcosagono() {
        icosagono.desenhar();
    }
}
