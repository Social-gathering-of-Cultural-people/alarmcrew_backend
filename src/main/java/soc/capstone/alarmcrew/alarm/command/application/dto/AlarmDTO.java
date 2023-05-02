package soc.capstone.alarmcrew.alarm.command.application.dto;

import io.swagger.annotations.ApiModel;

import java.sql.Time;

/**
 * <pre>
 * Class : AlarmDTO
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
@ApiModel(value = "AlarmDTO",
        description = "alarmCode : 알람방 코드, memberCode : 방장코드, alarmTime : 알람방 시간")
public class AlarmDTO {
    private long alarmCode;
    private long memberCode;
    private Time alarmTime;


    public AlarmDTO(){}

    public AlarmDTO(long alarmCode, long memberCode, Time alarmTime) {
        this.alarmCode = alarmCode;
        this.memberCode = memberCode;
        this.alarmTime = alarmTime;
    }

    public long getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(long alarmCode) {
        this.alarmCode = alarmCode;
    }

    public long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(long memberCode) {
        this.memberCode = memberCode;
    }

    public Time getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public String toString() {
        return "AlarmDTO{" +
                "alarmCode=" + alarmCode +
                ", memberCode=" + memberCode +
                ", alarmTime=" + alarmTime +
                '}';
    }
}
