package soc.capstone.alarmcrew.alarm.query.application.dto;

import io.swagger.annotations.ApiModel;

/**
 * <pre>
 * Class : BadgeDTO
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
@ApiModel(value = "BadgeDTO",
        description = "badgeCode : 뱃지 코드, badgeName : 뱃지 이름, badgeExplain : 뱃지 설명, badgeURL : 뱃지 이미지 주소")
public class AlarmDTO {
    private long badgeCode;
    private String badgeName;
    private String badgeExplain;
    private String badgeURL;

    public AlarmDTO(){}

    public AlarmDTO(long badgeCode, String badgeName, String badgeExplain, String badgeURL) {
        this.badgeCode = badgeCode;
        this.badgeName = badgeName;
        this.badgeExplain = badgeExplain;
        this.badgeURL = badgeURL;
    }

    public long getBadgeCode() {
        return badgeCode;
    }

    public void setBadgeCode(long badgeCode) {
        this.badgeCode = badgeCode;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getBadgeExplain() {
        return badgeExplain;
    }

    public void setBadgeExplain(String badgeExplain) {
        this.badgeExplain = badgeExplain;
    }

    public String getBadgeURL() {
        return badgeURL;
    }

    public void setBadgeURL(String badgeURL) {
        this.badgeURL = badgeURL;
    }

    @Override
    public String toString() {
        return "BadgeDTO{" +
                "badgeCode=" + badgeCode +
                ", badgeName='" + badgeName + '\'' +
                ", badgeExplain='" + badgeExplain + '\'' +
                ", badgeURL='" + badgeURL + '\'' +
                '}';
    }
}
