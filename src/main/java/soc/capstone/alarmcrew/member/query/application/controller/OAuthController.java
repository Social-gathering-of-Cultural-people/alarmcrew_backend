package soc.capstone.alarmcrew.member.query.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import soc.capstone.alarmcrew.common.ResponseDTO;
import soc.capstone.alarmcrew.member.query.application.service.OAuthService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * <pre>
 * Class : OAuthController
 * Comment: Kakao API
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
@RequestMapping("/oauth")
public class OAuthController {

    private final OAuthService oAuthService;

    public OAuthController(OAuthService oAuthService){this.oAuthService = oAuthService;}

    @ResponseBody
    @GetMapping("/kakao")
    public ResponseEntity<ResponseDTO> kakaoCallback(@RequestParam String code) {
        System.out.println("code = " + code);
        String access_Token = oAuthService.getKakaoAccessToken(code);
        System.out.println("access_Token = " + access_Token);

        HashMap<String, Object> userInfo = oAuthService.getUserInfo(access_Token);
        System.out.println("login Controller : " + userInfo);

//            클라이언트의 이메일이 존재할 때 세션에 해당 이메일과 토큰 등록
//        if (userInfo.get("email") != null) {
//            session.setAttribute("userNickname", userInfo.get("nickname"));
//            session.setAttribute("access_Token", access_Token);
//        }

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "카카오 정보 조회 성공", "dd"));
    }

}
