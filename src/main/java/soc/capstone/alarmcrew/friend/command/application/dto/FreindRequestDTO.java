package soc.capstone.alarmcrew.friend.command.application.dto;

/**
 * <pre>
 * Class : FreindRequestDTO
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
public class FreindRequestDTO {
    private String friendMemberId;

    public FreindRequestDTO(){}

    public FreindRequestDTO(String friendMemberId) {
        this.friendMemberId = friendMemberId;
    }

    public String getFriendMemberId() {
        return friendMemberId;
    }

    public void setFriendMemberId(String friendMemberId) {
        this.friendMemberId = friendMemberId;
    }

    @Override
    public String toString() {
        return "FreindRequestDTO{" +
                "friendMemberId='" + friendMemberId + '\'' +
                '}';
    }
}
