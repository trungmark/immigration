package com.example.immigration.model;

import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "Immigration_information")
public class ImmigrationInformation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Basic
    @NotNull
    @Column(name = "destination")
    private String destination;
    @Basic
    @NotNull
    @Column(name = "return_date")
    private Date returnDate;

    @Basic
    @Column(name = "start_date")
    @CreationTimestamp
    private Date startDate;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
    private Customer customerByCustomerId;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "direction_id", referencedColumnName = "id", nullable = false)
    private Direction directionByDirectionId;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "purpose_id", referencedColumnName = "id", nullable = false)
    private Purpose purposeByPurposeId;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "identirycard_id", referencedColumnName = "id", nullable = false)
    private Identitycard identitycardByIdentirycardId;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "license_id", referencedColumnName = "id", nullable = false)
    private License licenseByLicenseId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmigrationInformation that = (ImmigrationInformation) o;

        if (id != that.id) return false;

        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (returnDate != null ? !returnDate.equals(that.returnDate) : that.returnDate != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));

        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (returnDate != null ? returnDate.hashCode() : 0);


        return result;
    }

    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    public Direction getDirectionByDirectionId() {
        return directionByDirectionId;
    }

    public void setDirectionByDirectionId(Direction directionByDirectionId) {
        this.directionByDirectionId = directionByDirectionId;
    }

    public Purpose getPurposeByPurposeId() {
        return purposeByPurposeId;
    }

    public void setPurposeByPurposeId(Purpose purposeByPurposeId) {
        this.purposeByPurposeId = purposeByPurposeId;
    }

    public Identitycard getIdentitycardByIdentirycardId() {
        return identitycardByIdentirycardId;
    }

    public void setIdentitycardByIdentirycardId(Identitycard identitycardByIdentirycardId) {
        this.identitycardByIdentirycardId = identitycardByIdentirycardId;
    }

    public License getLicenseByLicenseId() {
        return licenseByLicenseId;
    }

    public void setLicenseByLicenseId(License licenseByLicenseId) {
        this.licenseByLicenseId = licenseByLicenseId;
    }
}
