package soc.capstone.alarmcrew.alarm.command.application.dto;

import io.swagger.annotations.ApiModel;

/**
 * <pre>
 * Class : AlarmSettingDTO
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
@ApiModel(value = "AlarmSettingDTO",
        description = "alarmSettingCode : 알람방 설정 코드, alarmCode : 알람방 코드, alarmMemberCode : 알람방 참여회원 코드, " +
                "alarmName : 알람이름, alarmVibe : 진동여부, alarmVolume : 음량설정, alarmRepeat : 다시울림, alarmMusic : 알람음," +
                "alarmActive : 활성화여부")
public class AlarmSettingDTO {
    private long alarmSettingCode;
    private long alarmCode;
    private long alarmMemberCode;
    private String alarmName;
    private Boolean alarmVibe;
    private double alarmVolume;
    private String alarmRepeat;
    private String alarmMusic;
    private Boolean alarmActive;


    public AlarmSettingDTO(){}

    public AlarmSettingDTO(long alarmSettingCode, long alarmCode, long alarmMemberCode, String alarmName, Boolean alarmVibe, double alarmVolume, String alarmRepeat, String alarmMusic, Boolean alarmActive) {
        this.alarmSettingCode = alarmSettingCode;
        this.alarmCode = alarmCode;
        this.alarmMemberCode = alarmMemberCode;
        this.alarmName = alarmName;
        this.alarmVibe = alarmVibe;
        this.alarmVolume = alarmVolume;
        this.alarmRepeat = alarmRepeat;
        this.alarmMusic = alarmMusic;
        this.alarmActive = alarmActive;
    }

    public long getAlarmSettingCode() {
        return alarmSettingCode;
    }

    public void setAlarmSettingCode(long alarmSettingCode) {
        this.alarmSettingCode = alarmSettingCode;
    }

    public long getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(long alarmCode) {
        this.alarmCode = alarmCode;
    }

    public long getAlarmMemberCode() {
        return alarmMemberCode;
    }

    public void setAlarmMemberCode(long alarmMemberCode) {
        this.alarmMemberCode = alarmMemberCode;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public Boolean getAlarmVibe() {
        return alarmVibe;
    }

    public void setAlarmVibe(Boolean alarmVibe) {
        this.alarmVibe = alarmVibe;
    }

    public double getAlarmVolume() {
        return alarmVolume;
    }

    public void setAlarmVolume(double alarmVolume) {
        this.alarmVolume = alarmVolume;
    }

    public String getAlarmRepeat() {
        return alarmRepeat;
    }

    public void setAlarmRepeat(String alarmRepeat) {
        this.alarmRepeat = alarmRepeat;
    }

    public String getAlarmMusic() {
        return alarmMusic;
    }

    public void setAlarmMusic(String alarmMusic) {
        this.alarmMusic = alarmMusic;
    }

    public Boolean getAlarmActive() {
        return alarmActive;
    }

    public void setAlarmActive(Boolean alarmActive) {
        this.alarmActive = alarmActive;
    }

    @Override
    public String toString() {
        return "AlarmSettingDTO{" +
                "alarmSettingCode=" + alarmSettingCode +
                ", alarmCode=" + alarmCode +
                ", alarmMemberCode=" + alarmMemberCode +
                ", alarmName='" + alarmName + '\'' +
                ", alarmVibe=" + alarmVibe +
                ", alarmVolume=" + alarmVolume +
                ", alarmRepeat='" + alarmRepeat + '\'' +
                ", alarmMusic='" + alarmMusic + '\'' +
                ", alarmActive=" + alarmActive +
                '}';
    }
}
