package es.cifpcm.vidicdaliborkamiali.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_offer")
public class ProductOffer {
    @Id
    @Column(name = "product_id", nullable = false)
    private Integer id;
    @Column(name = "product_name", nullable = false)
    private String name;
    @Column(name = "product_price", nullable = true)
    private Float price;
    @Column(name = "product_picture", nullable = true)
    private String picture;
    @Column(name = "id_municipio", nullable = false)
    private Integer idMunicipio;
    @Column(name = "product_stock", nullable = false)
    private Integer stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}