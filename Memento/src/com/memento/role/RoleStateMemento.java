package com.memento.role;

public class RoleStateMemento {
    private String vit;
    private String atk;
    private String def;

    public RoleStateMemento(String vit, String atk, String def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public String getVit() {
        return vit;
    }

    public void setVit(String vit) {
        this.vit = vit;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
