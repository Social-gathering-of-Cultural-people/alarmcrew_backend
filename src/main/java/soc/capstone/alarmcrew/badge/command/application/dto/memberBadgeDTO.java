package soc.capstone.alarmcrew.badge.command.application.dto;

import io.swagger.annotations.ApiModel;

/**
 * <pre>
 * Class : memberBadgeDTO
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
@ApiModel(value = "memberBadgeDTO",
        description = "memberBadgeCode : 멤버별 뱃지 코드, memberCode : 회원코드, badgeCode : 뱃지코드")
public class memberBadgeDTO {
    private long memberBadgeCode;
    private long memberCode;
    private long badgeCode;

    public memberBadgeDTO(){}

    public memberBadgeDTO(long memberBadgeCode, long memberCode, long badgeCode) {
        this.memberBadgeCode = memberBadgeCode;
        this.memberCode = memberCode;
        this.badgeCode = badgeCode;
    }

    public long getMemberBadgeCode() {
        return memberBadgeCode;
    }

    public void setMemberBadgeCode(long memberBadgeCode) {
        this.memberBadgeCode = memberBadgeCode;
    }

    public long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(long memberCode) {
        this.memberCode = memberCode;
    }

    public long getBadgeCode() {
        return badgeCode;
    }

    public void setBadgeCode(long badgeCode) {
        this.badgeCode = badgeCode;
    }

    @Override
    public String toString() {
        return "memberBadgeDTO{" +
                "memberBadgeCode=" + memberBadgeCode +
                ", memberCode=" + memberCode +
                ", badgeCode=" + badgeCode +
                '}';
    }
}
