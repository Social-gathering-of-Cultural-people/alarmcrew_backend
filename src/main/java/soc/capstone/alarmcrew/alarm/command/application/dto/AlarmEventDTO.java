package soc.capstone.alarmcrew.alarm.command.application.dto;

import io.swagger.annotations.ApiModel;

import java.sql.Date;
import java.sql.Time;

/**
 * <pre>
 * Class : AlarmEventDTO
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
@ApiModel(value = "AlarmEventDTO",
        description = "alarmEventCode : 알람 이벤트 코드, alarmCode : 알람방 코드, alarmMemberCode : 알람방 참여회원 코드, " +
                "alarmEventDate : 알람 이벤트 날짜, alarmTurnoffTime : 알람 종료 시간, alarmLate : 지각 여부")
public class AlarmEventDTO {
    private long alarmEventCode;
    private long alarmCode;
    private long alarmMemberCode;
    private Date alarmEventDate;
    private Time alarmTurnoffTime;
    private Boolean alarmLate;

    public AlarmEventDTO(){}


}
