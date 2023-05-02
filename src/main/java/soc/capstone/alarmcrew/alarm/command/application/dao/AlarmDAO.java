package soc.capstone.alarmcrew.alarm.command.application.dao;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <pre>
 * Class : AlarmDAO
 * Comment:
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-05-03         손준형           최초 생성
 * </pre>
 *
 * @author 손준형
 * @version 1(클래스 버전)
 * @see
 */
public interface AlarmDAO extends JpaRepository<Alarm, Long>{

}
