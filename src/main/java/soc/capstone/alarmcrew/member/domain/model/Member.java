package soc.capstone.alarmcrew.member.domain.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "SEQ_TB_MEMEBR_CODE"
        , sequenceName = "SEQ_TB_MEMEBR_CODE"
        , initialValue = 1
        , allocationSize = 1
)

@Table(name = "TB_MEMBER")
public class Member {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
            , generator = "SEQ_TB_FRIEND_CODE"
    )

    @Column(name="MEMBER_CODE")
    private long memberCode;

    @Column(name="MEMBER_ID")
    private long memberId;
}
