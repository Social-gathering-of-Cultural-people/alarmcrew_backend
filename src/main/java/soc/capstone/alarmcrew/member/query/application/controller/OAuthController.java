package soc.capstone.alarmcrew.member.query.application.controller;

import io.swagger.annotations.*;
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
@Api(tags = "Kakao Api")
public class OAuthController {

    private final OAuthService oAuthService;

    public OAuthController(OAuthService oAuthService){this.oAuthService = oAuthService;}

    @ApiOperation(value = "Kakao Login", notes = "카카오 access token을 받아 정보(회원코드, 닉네임, 프로필사진)를 return합니다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "access_code 값", required = true, dataType = "String", paramType = "query"),
    })
    @ApiResponses({ // 응답 코드에 대한 설명
            @ApiResponse(code=200, message="성공")
    })
    @ResponseBody
    @GetMapping("/kakao")
    public ResponseEntity<ResponseDTO> kakaoCallback(@RequestParam String code, HttpSession session) {
//        token을 backend에서 받아오는 과정
//        System.out.println("code = " + code);
//        String access_Token = oAuthService.getKakaoAccessToken(code);
//        System.out.println("access_Token = " + access_Token);

        HashMap<String, Object> userInfo = oAuthService.getUserInfo(code);
        System.out.println("login Controller : " + userInfo);

//            클라이언트의 닉네임이 존재할 때 세션에 해당 닉네임과 토큰 등록
        if (userInfo.get("nickname") != null) {
            session.setAttribute("userNickname", userInfo.get("nickname"));
            session.setAttribute("profile_image", userInfo.get("profile_image"));
            session.setAttribute("access_Token", code);
        }

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "카카오 로그인 성공", ""));
    }

    @ApiOperation(value = "Kakao Logout", notes = "카카오 로그아웃입니다.") // 매핑 메소드에 대한 설명
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "code", value = "access_code 값", required = true, dataType = "String", paramType = "query")
//    })
    @ApiResponses({ // 응답 코드에 대한 설명
            @ApiResponse(code=200, message="성공")
    })
    @GetMapping("/logout")
    public ResponseEntity<ResponseDTO> logout(HttpSession session) {
        oAuthService.kakaoLogout((String)session.getAttribute("access_Token"));
        session.removeAttribute("access_Token");
        session.removeAttribute("userNickname");
        session.removeAttribute("profile_image");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "카카오 로그아웃 성공", ""));
    }


}
