package soc.capstone.alarmcrew.friend.query.application.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import soc.capstone.alarmcrew.common.ResponseDTO;
//import soc.capstone.alarmcrew.friend.query.application.service.FriendQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * Class : FriendQueryController
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
@RequestMapping("/friends")
@Api(tags = "Friend Api")
public class FriendQueryController {

    @ApiOperation(value = "친구 요청 정보 조회", notes = "나에게 친구 추가를 건 사람들에 대한 정보") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
    })
    @GetMapping("/state/request")
    public ResponseEntity<ResponseDTO> findRequestFriendById(@RequestHeader(value="Authorization")  String accessToken){
        System.out.println("친구요청 정보 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청 정보 조회 성공", ""));
    }

    @ApiOperation(value = "친구 정보 조회", notes = "친구들에 대한 정보 조회") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", value = "accessToken 값",  defaultValue = "None"),
    })
    @GetMapping()
    public ResponseEntity<ResponseDTO> findFriendById(@RequestHeader(value="Authorization")  String accessToken){
        System.out.println("친구 정보 조회 API");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청 정보 조회 성공", ""));
    }

}
