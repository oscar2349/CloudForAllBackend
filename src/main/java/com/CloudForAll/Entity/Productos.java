package com.CloudForAll.Entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdProducto", query = "SELECT p FROM Productos p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Productos.findByCantidadProducto", query = "SELECT p FROM Productos p WHERE p.cantidadProducto = :cantidadProducto")
    , @NamedQuery(name = "Productos.findByIdPreventa", query = "SELECT p FROM Productos p WHERE p.idPreventa = :idPreventa")
    , @NamedQuery(name = "Productos.findByVendido", query = "SELECT p FROM Productos p WHERE p.vendido = :vendido")
    , @NamedQuery(name = "Productos.findByIdFactura", query = "SELECT p FROM Productos p WHERE p.idFactura = :idFactura")
    , @NamedQuery(name = "Productos.findByValorDescontado", query = "SELECT p FROM Productos p WHERE p.valorDescontado = :valorDescontado")
    , @NamedQuery(name = "Productos.findByLugarDespacho", query = "SELECT p FROM Productos p WHERE p.lugarDespacho = :lugarDespacho")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Long idProducto;
    
    @Basic(optional = false)
    @Column(name = "cantidad_producto")
    private int cantidadProducto;
    @Basic(optional = false)
    @Column(name = "id_preventa")
    private int idPreventa;
    @Basic(optional = false)
    @Column(name = "vendido")
    private String vendido;
    @Basic(optional = false)
    @Column(name = "id_factura")
    private int idFactura;
    @Basic(optional = false)
    @Column(name = "valor_descontado")
    private int valorDescontado;
    @Basic(optional = false)
    @Column(name = "lugar_despacho")
    private String lugarDespacho;

    public Productos() {
    }

    public Productos(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Productos(Long idProducto, int cantidadProducto, int idPreventa, String vendido, int idFactura, int valorDescontado, String lugarDespacho) {
        this.idProducto = idProducto;
        this.cantidadProducto = cantidadProducto;
        this.idPreventa = idPreventa;
        this.vendido = vendido;
        this.idFactura = idFactura;
        this.valorDescontado = valorDescontado;
        this.lugarDespacho = lugarDespacho;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdPreventa() {
        return idPreventa;
    }

    public void setIdPreventa(int idPreventa) {
        this.idPreventa = idPreventa;
    }

    public String getVendido() {
        return vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getValorDescontado() {
        return valorDescontado;
    }

    public void setValorDescontado(int valorDescontado) {
        this.valorDescontado = valorDescontado;
    }

    public String getLugarDespacho() {
        return lugarDespacho;
    }

    public void setLugarDespacho(String lugarDespacho) {
        this.lugarDespacho = lugarDespacho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Productos[ idProducto=" + idProducto + " ]";
    }

}
