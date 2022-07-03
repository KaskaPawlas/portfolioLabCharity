package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.model.Donation;

import java.security.Principal;

public interface DonationRepository extends JpaRepository<Donation, Long> {


    @Query("SELECT SUM(d.quantity) FROM Donation d")
    Integer countDonationsByQuantity();

    @Query("SELECT COUNT(d) FROM Donation d")
    Integer countDonations();

}
