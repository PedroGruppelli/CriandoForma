package Principal;
import Facade.CriandoForma;
public class FacadeDemo {
    public static void main(String[] args) {
        CriandoForma criar = new CriandoForma();
        
        criar.criarTriangulo();        
        criar.criarQuadrilatero();
        criar.criarPentagono();
        criar.criarHexagono();
        criar.criarHeptagono();
        criar.criarOctogono();
        criar.criarEneagono();
        criar.criarDecagono();
        criar.criarUndecagono();
        criar.criarDodecagono();
        criar.criarPentadecagono();
        criar.criarIcosagono();
    }   
}