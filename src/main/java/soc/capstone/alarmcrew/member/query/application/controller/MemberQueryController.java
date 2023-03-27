package soc.capstone.alarmcrew.member.query.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soc.capstone.alarmcrew.common.ResponseDTO;
import soc.capstone.alarmcrew.member.query.application.service.MemberQueryService;

@RestController
@RequestMapping("/members")
public class MemberQueryController {

    private final MemberQueryService memberQueryService;

    public MemberQueryController(MemberQueryService memberQueryService){this.memberQueryService = memberQueryService;}

    @GetMapping("/example")
    public ResponseEntity<ResponseDTO> ex(){
        System.out.println("예시 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청 정보 조회 성공", "dd"));
    }
}
