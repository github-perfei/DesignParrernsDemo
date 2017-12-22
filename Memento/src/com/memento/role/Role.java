package com.memento.role;

public class Role {
    private String name;

    private String vit;
    private String atk;
    private String def;

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

    public Role(String name) {
        this.name = name;
        vit = "100";
        atk = "100";
        def = "100";
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit,atk,def);
    }

    public void recoveryState(RoleStateMemento memento) {
        vit = memento.getVit();
        atk = memento.getAtk();
        def = memento.getDef();
    }

    public void show() {
        System.out.println(name + "当前状态：");
        System.out.println("体力：" + vit);
        System.out.println("攻击力：" + atk);
        System.out.println("防御力：" + def);
    }

    public void fight() {
        vit = "10";
        atk = "20";
        def = "30";
    }
}
