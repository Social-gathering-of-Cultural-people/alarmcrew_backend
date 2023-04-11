package soc.capstone.alarmcrew.badge.command.application.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import soc.capstone.alarmcrew.common.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * Class : BadgeController
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
@RestController
@RequestMapping("/badges")
@Api(tags = "Badge Api")
public class BadgeController {

    @ApiOperation(value = "뱃지 삭제", notes = "memberBadgeDTO의 memberBadgeCode를 PathVariable에 넣어 보유뱃지삭제를 진행한다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @DeleteMapping("/delete/{badgeCode}")
    public ResponseEntity<ResponseDTO> deleteFriend(@RequestHeader(value="Authorization") String accessToken, @PathVariable Long badgeCode){
        System.out.println("뱃지 삭제 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "뱃지삭제 성공", ""));
    }

}
