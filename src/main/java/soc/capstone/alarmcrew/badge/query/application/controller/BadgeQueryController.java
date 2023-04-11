package soc.capstone.alarmcrew.badge.query.application.controller;

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
 * Class : BadgeQueryController
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
public class BadgeQueryController {

    @ApiOperation(value = "회원 보유 뱃지 목록 조회", notes = "회원이 가지고 있는 뱃지 목록 조회") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
    })
    @GetMapping()
    public ResponseEntity<ResponseDTO> findBadgeById(@RequestHeader(value="Authorization")  String accessToken){
        System.out.println("회원 보유 뱃지 목록 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "회원 보유 뱃지 목록 조회 성공", ""));
    }

    @ApiOperation(value = "전체 뱃지 정보 조회", notes = "전체 뱃지에 대한 정보 조회") // 매핑 메소드에 대한 설명
    @GetMapping("/all")
    public ResponseEntity<ResponseDTO> findAllBadge(){
        System.out.println("전체 뱃지 정보 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "전체 뱃지 정보 조회 성공", ""));
    }

}
