package com.gupao.vip.jsonclone;

import lombok.Data;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * 手机类
 */
public class Phone {

    private String model;
    private Integer rom;
    private Integer ram;
    private List<String>color;
    private Double price;
    public Phone(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    /**
     * 克隆
     * @param phones
     * @return
     */
    public Phone clone(Phone phones){

        JSONObject json = JSONObject.fromObject(phones);
        String jsonStr = json.toString();

        System.out.println(jsonStr);
        JSONObject object =JSONObject.fromObject(jsonStr);

        Phone phone = (Phone) JSONObject.toBean(object,Phone.class);
        System.out.println(phone.getModel());

        return  phone;
    }

    public Phone(String model, Integer rom, Integer ram, List<String> color, Double price) {
        this.model = model;
        this.rom = rom;
        this.ram = ram;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", rom=" + rom +
                ", ram=" + ram +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
