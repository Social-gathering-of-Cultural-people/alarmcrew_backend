package soc.capstone.alarmcrew.member.command.application.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "TB_MEMBER", description = "회원코드, 카카오 ID")
public class MemberDTO {
    private Long memberCode;
    private Long memberId;

    public MemberDTO(){}

    public MemberDTO(Long memberCode, Long memberId) {
        this.memberCode = memberCode;
        this.memberId = memberId;
    }

    public Long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Long memberCode) {
        this.memberCode = memberCode;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberId=" + memberId +
                '}';
    }
}
