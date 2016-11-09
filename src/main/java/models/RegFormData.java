package models;

import javax.persistence.*;
import javax.xml.registry.infomodel.RegistryObject;


@Entity
@Table(name = "registration_ostis", schema = "", catalog = "regdata")
public class RegFormData {
    private int id;
    private String article;
    private String participation;
    private String lastName;
    private String firstName;
    private String middleName;
    private String academicDegree;
    private String academicTitle;
    private String placeOfWork;
    private String position;
    private String country;
    private String city;
    private String email;
    private String contactNumber;
    private String certificate;
    private String invite;

    public RegFormData() {

    }

    public RegFormData(String article, String participation,
                       String lastName, String firstName,
                       String middleName, String academicDegree,
                       String academicTitle, String placeOfWork,
                       String position, String country, String city,
                       String email, String contactNumber,
                       String certificate, String invite) {
        this.article = article;
        this.participation = participation;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.academicDegree = academicDegree;
        this.academicTitle = academicTitle;
        this.placeOfWork = placeOfWork;
        this.position = position;
        this.country = country;
        this.city = city;
        this.email = email;
        this.contactNumber = contactNumber;
        this.certificate = certificate;
        this.invite = invite;
    }


    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ARTICLE", nullable = false, insertable = true, updatable = true, length = 100)
    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Basic
    @Column(name = "PARTICIPATION", nullable = false, insertable = true, updatable = true, length = 50)
    public String getParticipation() {
        return participation;
    }

    public void setParticipation(String participation) {
        this.participation = participation;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, insertable = true, updatable = true, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, insertable = true, updatable = true, length = 50)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "MIDDLE_NAME", nullable = false, insertable = true, updatable = true, length = 50)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "ACADEMIC_DEGREE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Basic
    @Column(name = "ACADEMIC_TITLE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    @Basic
    @Column(name = "PLACE_OF_WORK", nullable = false, insertable = true, updatable = true, length = 100)
    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    @Basic
    @Column(name = "POSITION", nullable = false, insertable = true, updatable = true, length = 100)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "CITY", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, insertable = true, updatable = true, length = 320)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CONTACT_NUMBER", nullable = false, insertable = true, updatable = true, length = 50)
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Basic
    @Column(name = "CERTIFICATE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    @Basic
    @Column(name = "INVITE", nullable = false, insertable = true, updatable = true, length = 50)
    public String getInvite() {
        return invite;
    }

    public void setInvite(String invite) {
        this.invite = invite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegFormData that = (RegFormData) o;

        if (id != that.id) return false;
        if (article != null ? !article.equals(that.article) : that.article != null) return false;
        if (participation != null ? !participation.equals(that.participation) : that.participation != null)
            return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (academicDegree != null ? !academicDegree.equals(that.academicDegree) : that.academicDegree != null)
            return false;
        if (academicTitle != null ? !academicTitle.equals(that.academicTitle) : that.academicTitle != null)
            return false;
        if (placeOfWork != null ? !placeOfWork.equals(that.placeOfWork) : that.placeOfWork != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (contactNumber != null ? !contactNumber.equals(that.contactNumber) : that.contactNumber != null)
            return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;
        if (invite != null ? !invite.equals(that.invite) : that.invite != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (article != null ? article.hashCode() : 0);
        result = 31 * result + (participation != null ? participation.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (academicDegree != null ? academicDegree.hashCode() : 0);
        result = 31 * result + (academicTitle != null ? academicTitle.hashCode() : 0);
        result = 31 * result + (placeOfWork != null ? placeOfWork.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (contactNumber != null ? contactNumber.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (invite != null ? invite.hashCode() : 0);
        return result;
    }
}
