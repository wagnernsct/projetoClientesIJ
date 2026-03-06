package enums;

public enum Parentesco {

    FILHO("filho",100),
    PAI("pai",1),
    MAE("mae",1),
    CONJUGE("conjuge",0),
    UNKNOW("unknow",0);

    private String descricao;
    private int dependentes;

    Parentesco(String descricao, int dependentes) {
        this.descricao = descricao;
        this.dependentes = dependentes;
    }

    public String getDescricao() {
        return descricao;
    }

    public int  getDependentes() {
        return dependentes;
    }

    public static Parentesco findByDescricao(String descricao){
        for(Parentesco p : Parentesco.values()){
            if(p.getDescricao().equals(descricao)){
                return p;
            }
        }
        return Parentesco.UNKNOW;
    }

    public static boolean isUnknow(Parentesco p){
        return p == Parentesco.UNKNOW;
    }

    public static boolean isNotUnknow(Parentesco p){
        return !isUnknow(p);
    }
}
