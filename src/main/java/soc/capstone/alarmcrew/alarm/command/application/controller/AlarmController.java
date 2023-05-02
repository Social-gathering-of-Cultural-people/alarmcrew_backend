package soc.capstone.alarmcrew.alarm.command.application.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import soc.capstone.alarmcrew.alarm.command.application.dto.AlarmDTO;
import soc.capstone.alarmcrew.alarm.command.application.dto.AlarmEventDTO;
import soc.capstone.alarmcrew.alarm.command.application.dto.AlarmMemberDTO;
import soc.capstone.alarmcrew.alarm.command.application.dto.AlarmSettingDTO;
import soc.capstone.alarmcrew.common.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * Class : AlarmController
 * Comment:
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-05-03         손준형           최초 생성
 * </pre>
 *
 * @author 손준형
 * @version 1(클래스 버전)
 * @see
 */
@RestController
@RequestMapping("/alarms")
@Api(tags = "Alarm Api")
public class AlarmController {

    @ApiOperation(value = "알람방 생성", notes = "알람방을 생성한다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> create(@RequestHeader(value="Authorization")  String accessToken, @RequestBody AlarmDTO alarmDTO, @RequestBody AlarmSettingDTO alarmSettingDTO){
        System.out.println("알람방 생성 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람방 생성 성공", ""));
    }

    @ApiOperation(value = "알람방 초대 요청", notes = "알람방 초대 요청 보내기") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @PostMapping("/request")
    public ResponseEntity<ResponseDTO> request(@RequestHeader(value="Authorization")  String accessToken, @RequestBody AlarmMemberDTO alarmMemberDTO){
        System.out.println("알람방 초대 요청 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람방 초대 요청 성공", ""));
    }

    @ApiOperation(value = "알람방 초대 요청 결과", notes = "알람방 초대 요청 결과 확인") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @PutMapping("/result")
    public ResponseEntity<ResponseDTO> result(@RequestHeader(value="Authorization")  String accessToken, @RequestBody AlarmMemberDTO alarmMemberDTO){
        System.out.println("알람방 초대 요청 결과 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람방 초대 결과 수신 성공", ""));
    }

    @ApiOperation(value = "알람방 삭제", notes = "알람방 삭제 진행") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None"),
    })
    @DeleteMapping("/delete/{alarmCode}")
    public ResponseEntity<ResponseDTO> deleteAlarm(@RequestHeader(value="Authorization") String accessToken, @PathVariable Long alarmCode){
        System.out.println("알람방 삭제 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람방 삭제 성공", ""));
    }

    @ApiOperation(value = "알람방 수정", notes = "알람방 수정") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> update(@RequestHeader(value="Authorization")  String accessToken, @RequestBody AlarmDTO alarmDTO, @RequestBody AlarmSettingDTO alarmSettingDTO){
        System.out.println("알람방 수정 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람방 수정 성공", ""));
    }

    @ApiOperation(value = "알람 이벤트 생성", notes = "알람 이벤트를 생성한다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @PostMapping("/event/create")
    public ResponseEntity<ResponseDTO> createEvent(@RequestHeader(value="Authorization")  String accessToken, @RequestBody AlarmEventDTO alarmEventDTO){
        System.out.println("알람 이벤트 생성 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람 이벤트 생성 성공", ""));
    }

    @ApiOperation(value = "알람 이벤트 종료", notes = "알람 울리기 시작할 시 1초마다 부를 api") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None")
    })
    @PostMapping("/event/update")
    public ResponseEntity<ResponseDTO> updateEvent(@RequestHeader(value="Authorization")  String accessToken, @RequestBody AlarmEventDTO alarmEventDTO){
        System.out.println("알람 이벤트 종료 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "알람 이벤트 종료", ""));
    }

}
