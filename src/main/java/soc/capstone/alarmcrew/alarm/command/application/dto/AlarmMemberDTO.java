package soc.capstone.alarmcrew.alarm.command.application.dto;

import io.swagger.annotations.ApiModel;

/**
 * <pre>
 * Class : AlarmMemberDTO
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
@ApiModel(value = "AlarmMemberDTO",
        description = "alarmMemberCode : 알람방 참여회원 코드, memberCode : 회원 코드, alarmCode : 알람방 코드, alarmMemberState : 참여 상태")
public class AlarmMemberDTO {
    private long alarmMemberCode;
    private long memberCode;
    private long alarmCode;
    private String alarmMemberState;

    public AlarmMemberDTO(){}

    public AlarmMemberDTO(long alarmMemberCode, long memberCode, long alarmCode, String alarmMemberState) {
        this.alarmMemberCode = alarmMemberCode;
        this.memberCode = memberCode;
        this.alarmCode = alarmCode;
        this.alarmMemberState = alarmMemberState;
    }

    public long getAlarmMemberCode() {
        return alarmMemberCode;
    }

    public void setAlarmMemberCode(long alarmMemberCode) {
        this.alarmMemberCode = alarmMemberCode;
    }

    public long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(long memberCode) {
        this.memberCode = memberCode;
    }

    public long getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(long alarmCode) {
        this.alarmCode = alarmCode;
    }

    public String getAlarmMemberState() {
        return alarmMemberState;
    }

    public void setAlarmMemberState(String alarmMemberState) {
        this.alarmMemberState = alarmMemberState;
    }

    @Override
    public String toString() {
        return "AlarmMemberDTO{" +
                "alarmMemberCode=" + alarmMemberCode +
                ", memberCode=" + memberCode +
                ", alarmCode=" + alarmCode +
                ", alarmMemberState='" + alarmMemberState + '\'' +
                '}';
    }
}
