package lk.ijse.dep.pos.dao;

import lk.ijse.dep.pos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderDAO extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT IFNULL((SELECT id FROM `Order` ORDER BY id DESC LIMIT 1),0) AS id", nativeQuery = true)
    int getLastOrderId() ;

    @Query(value = "SELECT IF(EXISTS(SELECT * FROM `Order` WHERE customer_id=?1),'TRUE','FALSE')", nativeQuery = true)
    boolean existsByCustomerId(String customerId) ;

}
