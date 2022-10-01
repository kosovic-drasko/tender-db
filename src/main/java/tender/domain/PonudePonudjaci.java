package tender.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A PonudePonudjaci.
 */
@Entity
@Table(name = "view_ponude_ponudjaci")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class PonudePonudjaci implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "sifra_postupka", nullable = false)
    private Integer sifraPostupka;

    @NotNull
    @Column(name = "sifra_ponude", nullable = false)
    private Integer sifraPonude;

    @NotNull
    @Column(name = "sifra_ponudjaca", nullable = false)
    private Integer sifraPonudjaca;

    @NotNull
    @Column(name = "broj_partije", nullable = false)
    private Integer brojPartije;

    @Column(name = "naziv_proizvodjaca")
    private String nazivProizvodjaca;

    @Column(name = "naziv_ponudjaca")
    private String nazivPonudjaca;

    @Column(name = "zasticeni_naziv")
    private String zasticeniNaziv;

    @NotNull
    @Column(name = "ponudjena_vrijednost", nullable = false)
    private Double ponudjenaVrijednost;

    @Column(name = "rok_isporuke")
    private Integer rokIsporuke;

    @Column(name = "jedinicna_cijena")
    private Double jedinicnaCijena;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "created_date")
    private LocalDate created_date;

    @Column(name = "last_modified_by")
    private String last_modified_by;

    @Column(name = "last_modified_date")
    private LocalDate last_modified_date;

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Column(name = "selected")
    private Boolean selected;

    public Integer getSifraPonudjaca() {
        return sifraPonudjaca;
    }

    public void setSifraPonudjaca(Integer sifraPonudjaca) {
        this.sifraPonudjaca = sifraPonudjaca;
    }

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public String getLast_modified_by() {
        return last_modified_by;
    }

    public void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by;
    }

    public LocalDate getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(LocalDate last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public Long getId() {
        return this.id;
    }

    public PonudePonudjaci id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSifraPostupka() {
        return this.sifraPostupka;
    }

    public PonudePonudjaci sifraPostupka(Integer sifraPostupka) {
        this.setSifraPostupka(sifraPostupka);
        return this;
    }

    public void setSifraPostupka(Integer sifraPostupka) {
        this.sifraPostupka = sifraPostupka;
    }

    public Integer getSifraPonude() {
        return this.sifraPonude;
    }

    public PonudePonudjaci sifraPonude(Integer sifraPonude) {
        this.setSifraPonude(sifraPonude);
        return this;
    }

    public void setSifraPonude(Integer sifraPonude) {
        this.sifraPonude = sifraPonude;
    }

    public Integer getBrojPartije() {
        return this.brojPartije;
    }

    public PonudePonudjaci brojPartije(Integer brojPartije) {
        this.setBrojPartije(brojPartije);
        return this;
    }

    public void setBrojPartije(Integer brojPartije) {
        this.brojPartije = brojPartije;
    }

    public String getNazivProizvodjaca() {
        return this.nazivProizvodjaca;
    }

    public PonudePonudjaci nazivProizvodjaca(String nazivProizvodjaca) {
        this.setNazivProizvodjaca(nazivProizvodjaca);
        return this;
    }

    public void setNazivProizvodjaca(String nazivProizvodjaca) {
        this.nazivProizvodjaca = nazivProizvodjaca;
    }

    public String getNazivPonudjaca() {
        return this.nazivPonudjaca;
    }

    public PonudePonudjaci nazivPonudjaca(String nazivPonudjaca) {
        this.setNazivPonudjaca(nazivPonudjaca);
        return this;
    }

    public void setNazivPonudjaca(String nazivPonudjaca) {
        this.nazivPonudjaca = nazivPonudjaca;
    }

    public String getZasticeniNaziv() {
        return this.zasticeniNaziv;
    }

    public PonudePonudjaci zasticeniNaziv(String zasticeniNaziv) {
        this.setZasticeniNaziv(zasticeniNaziv);
        return this;
    }

    public void setZasticeniNaziv(String zasticeniNaziv) {
        this.zasticeniNaziv = zasticeniNaziv;
    }

    public Double getPonudjenaVrijednost() {
        return this.ponudjenaVrijednost;
    }

    public PonudePonudjaci ponudjenaVrijednost(Double ponudjenaVrijednost) {
        this.setPonudjenaVrijednost(ponudjenaVrijednost);
        return this;
    }

    public void setPonudjenaVrijednost(Double ponudjenaVrijednost) {
        this.ponudjenaVrijednost = ponudjenaVrijednost;
    }

    public Integer getRokIsporuke() {
        return this.rokIsporuke;
    }

    public PonudePonudjaci rokIsporuke(Integer rokIsporuke) {
        this.setRokIsporuke(rokIsporuke);
        return this;
    }

    public void setRokIsporuke(Integer rokIsporuke) {
        this.rokIsporuke = rokIsporuke;
    }

    public Double getJedinicnaCijena() {
        return this.jedinicnaCijena;
    }

    public PonudePonudjaci jedinicnaCijena(Double jedinicnaCijena) {
        this.setJedinicnaCijena(jedinicnaCijena);
        return this;
    }

    public void setJedinicnaCijena(Double jedinicnaCijena) {
        this.jedinicnaCijena = jedinicnaCijena;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public PonudePonudjaci selected(Boolean selected) {
        this.setSelected(selected);
        return this;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PonudePonudjaci)) {
            return false;
        }
        return id != null && id.equals(((PonudePonudjaci) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PonudePonudjaci{" +
            "id=" + getId() +
            ", sifraPostupka=" + getSifraPostupka() +
            ", sifraPonude=" + getSifraPonude() +
            ", brojPartije=" + getBrojPartije() +
            ", nazivProizvodjaca='" + getNazivProizvodjaca() + "'" +
            ", nazivPonudjaca='" + getNazivPonudjaca() + "'" +
            ", zasticeniNaziv='" + getZasticeniNaziv() + "'" +
            ", ponudjenaVrijednost=" + getPonudjenaVrijednost() +
            ", rokIsporuke=" + getRokIsporuke() +
            ", jedinicnaCijena=" + getJedinicnaCijena() +
            ", selected='" + getSelected() + "'" +
            "}";
    }
}
