package org.RicardoPluto._03di;

public class MyBean {
    private Long id;
    private String name;
    private Long idd;

    public MyBean() {
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idd=" + idd +
                '}';
    }

    public Long getIdd() {
        return idd;
    }

    public void setIdd(Long idd) {
        this.idd = idd;
    }

    public MyBean(Long id, String name, Long idd) {
        this.id = id;
        this.name = name;
        this.idd = idd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
