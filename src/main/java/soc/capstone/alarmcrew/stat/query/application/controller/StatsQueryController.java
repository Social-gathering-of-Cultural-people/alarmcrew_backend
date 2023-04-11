package soc.capstone.alarmcrew.stat.query.application.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soc.capstone.alarmcrew.common.ResponseDTO;

/**
 * <pre>
 * Class : StatsQueryController
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
@RequestMapping("/stats")
@Api(tags = "Stats Api")
public class StatsQueryController {

    @ApiOperation(value = "통계 정보 조회", notes = "회원 통계 정보를 조회한다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
    })
    @GetMapping("")
    public ResponseEntity<ResponseDTO> findStatsById(@RequestHeader(value="Authorization")  String accessToken){
        System.out.println("통계 정보 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "통계 정보 조회 성공", ""));
    }

}
