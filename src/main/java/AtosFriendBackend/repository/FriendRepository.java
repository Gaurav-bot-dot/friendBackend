package AtosFriendBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AtosFriendBackend.model.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long>{

}
 