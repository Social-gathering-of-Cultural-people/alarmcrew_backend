package soc.capstone.alarmcrew.alarm.query.application.controller;

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
 * Class : AlarmQueryController
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
@RequestMapping("/alarms")
@Api(tags = "Alarm Api")
public class AlarmQueryController {

    @ApiOperation(value = "요청 상태의 알람방 조회", notes = "현재 초대 요청받은 알람방 목록 조회") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
    })
    @GetMapping()
    public ResponseEntity<ResponseDTO> findAlarmsById(@RequestHeader(value="Authorization")  String accessToken){
        System.out.println("요청 상태의 알람방 목록 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "요청 상태의 알람방 목록 조회 성공", ""));
    }

    @ApiOperation(value = "알람방 목록 조회", notes = "알람방 목록 조회") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
    })
    @GetMapping("")
    public ResponseEntity<ResponseDTO> findAllAlarms(@RequestHeader(value="Authorization")  String accessToken){
        System.out.println("전체 알람방 목록 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "전체 알람방 정보 조회 성공", ""));
    }

}
