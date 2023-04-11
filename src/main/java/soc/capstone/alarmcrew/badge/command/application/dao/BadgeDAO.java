package soc.capstone.alarmcrew.badge.command.application.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import soc.capstone.alarmcrew.badge.domain.model.Badge;

/**
 * <pre>
 * Class : BadgeDAO
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
public interface BadgeDAO extends JpaRepository<Badge, Long>{

}
