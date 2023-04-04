package soc.capstone.alarmcrew.member.query.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soc.capstone.alarmcrew.common.ResponseDTO;
import soc.capstone.alarmcrew.member.query.application.service.MemberQueryService;

/**
 * <pre>
 * Class : MemberQueryController
 * Comment: Member Select Controller
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-03-28         손준형           최초 생성
 * </pre>
 *
 * @author 손준형
 * @version 1(클래스 버전)
 * @see
 */

@RestController
@RequestMapping("/members")
public class MemberQueryController {

    private final MemberQueryService memberQueryService;

    public MemberQueryController(MemberQueryService memberQueryService){this.memberQueryService = memberQueryService;}

}
