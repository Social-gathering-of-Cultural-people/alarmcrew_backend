package soc.capstone.alarmcrew.friend.command.application.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import soc.capstone.alarmcrew.common.ResponseDTO;
import soc.capstone.alarmcrew.friend.command.application.dto.FriendDTO;
//import soc.capstone.alarmcrew.friend.command.application.service.FriendService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/friends")
@Api(tags = "Friends Api")
public class FriendController {

    @ApiOperation(value = "친구요청", notes = "친구 요청 보내기") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
            @ApiImplicitParam(name = "memberCode", value = "친구요청을 받을 사용자의 code값",  defaultValue = "None")
    })
    @PostMapping("/request")
    public ResponseEntity<ResponseDTO> request(@RequestHeader(value="Authorization")  String accessToken, @RequestBody Long memberCode){
        System.out.println("친구요청 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청 성공", ""));
    }

    @ApiOperation(value = "친구요청결과", notes = "친구 수락이면 friendState에 friend, 거절이면 reject를 return한다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값", defaultValue = "None"),
    })
    @PutMapping("/result")
    public ResponseEntity<ResponseDTO> result(@RequestHeader(value="Authorization") String accessToken, @RequestBody FriendDTO friendDTO){
        System.out.println("친구요청결과 API");
        System.out.println("friendDTO = " + friendDTO);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청결과 확인", ""));
    }

}
