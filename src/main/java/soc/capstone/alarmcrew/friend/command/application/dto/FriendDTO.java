package soc.capstone.alarmcrew.friend.command.application.dto;

import io.swagger.annotations.ApiModel;

/**
 * <pre>
 * Class : FriendDTO
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
@ApiModel(value = "FriendDTO",
        description = "friendCode : 친구코드, memberCode : 친구멤버코드1, friendMemberCode : 친구멤버코드2, friendState : 친구상태")
public class FriendDTO {
    private long friendCode;
    private long memberCode;
    private long friendMemberCode;
    private String friendState;

    public FriendDTO(){}

    public FriendDTO(long friendCode, long memberCode, long friendMemberCode, String friendState) {
        this.friendCode = friendCode;
        this.memberCode = memberCode;
        this.friendMemberCode = friendMemberCode;
        this.friendState = friendState;
    }

    public long getFriendCode() {
        return friendCode;
    }

    public void setFriendCode(long friendCode) {
        this.friendCode = friendCode;
    }

    public long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(long memberCode) {
        this.memberCode = memberCode;
    }

    public long getFriendMemberCode() {
        return friendMemberCode;
    }

    public void setFriendMemberCode(long friendMemberCode) {
        this.friendMemberCode = friendMemberCode;
    }

    public String getFriendState() {
        return friendState;
    }

    public void setFriendState(String friendState) {
        this.friendState = friendState;
    }

    @Override
    public String toString() {
        return "FriendDTO{" +
                "friendCode=" + friendCode +
                ", memberCode=" + memberCode +
                ", friendMemberCode=" + friendMemberCode +
                ", friendState='" + friendState + '\'' +
                '}';
    }
}
