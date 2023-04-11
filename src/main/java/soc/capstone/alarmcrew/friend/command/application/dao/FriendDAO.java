package soc.capstone.alarmcrew.friend.command.application.dao;

import soc.capstone.alarmcrew.friend.domain.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 * Class : FriendDAO
 * Comment:
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-04-11         손준형           최초 생성
 * </pre>
 *
 * @author 손준형
 * @version 1(클래스 버전)
 * @see
 */
public interface FriendDAO extends JpaRepository<Friend, Long>{

}
