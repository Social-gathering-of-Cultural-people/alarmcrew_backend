package soc.capstone.alarmcrew.friend.command.application.dao;

import soc.capstone.alarmcrew.friend.domain.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendDAO extends JpaRepository<Friend, Long>{

}
