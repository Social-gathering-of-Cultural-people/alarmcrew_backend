package soc.capstone.alarmcrew.stat.domain.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "SEQ_TB_STATS_CODE"
        , sequenceName = "SEQ_TB_STATS_CODE"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_STATS")
public class Stats {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
            , generator = "SEQ_TB_STATS_CODE"
    )
    @Column(name="STATS_CODE")
    private long friendCode;

    @Column(name="MEMBER_CODE")
    private String memberCode;

    @Column(name="STATS_ALARM_NUM")
    private long statsAlarmNum;

    @Column(name="STATS_LATE_NUM")
    private long statsLateNum;

    @Column(name="STATS_LATE_RATE")
    private String statsLateRate;

    @Column(name="STATS_TURNOFF_RATE")
    private String statsTurnoffRate;



    public Stats(){}

    public Stats(long friendCode, String memberCode, long statsAlarmNum, long statsLateNum, String statsLateRate, String statsTurnoffRate) {
        this.friendCode = friendCode;
        this.memberCode = memberCode;
        this.statsAlarmNum = statsAlarmNum;
        this.statsLateNum = statsLateNum;
        this.statsLateRate = statsLateRate;
        this.statsTurnoffRate = statsTurnoffRate;
    }

    public long getFriendCode() {
        return friendCode;
    }

    public void setFriendCode(long friendCode) {
        this.friendCode = friendCode;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public long getStatsAlarmNum() {
        return statsAlarmNum;
    }

    public void setStatsAlarmNum(long statsAlarmNum) {
        this.statsAlarmNum = statsAlarmNum;
    }

    public long getStatsLateNum() {
        return statsLateNum;
    }

    public void setStatsLateNum(long statsLateNum) {
        this.statsLateNum = statsLateNum;
    }

    public String getStatsLateRate() {
        return statsLateRate;
    }

    public void setStatsLateRate(String statsLateRate) {
        this.statsLateRate = statsLateRate;
    }

    public String getStatsTurnoffRate() {
        return statsTurnoffRate;
    }

    public void setStatsTurnoffRate(String statsTurnoffRate) {
        this.statsTurnoffRate = statsTurnoffRate;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "friendCode=" + friendCode +
                ", memberCode='" + memberCode + '\'' +
                ", statsAlarmNum=" + statsAlarmNum +
                ", statsLateNum=" + statsLateNum +
                ", statsLateRate='" + statsLateRate + '\'' +
                ", statsTurnoffRate='" + statsTurnoffRate + '\'' +
                '}';
    }
}
