//package soc.capstone.alarmcrew.friend.query.application.controller;
//
//import soc.capstone.alarmcrew.common.ResponseDTO;
////import soc.capstone.alarmcrew.friend.query.application.service.FriendQueryService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/friends")
//public class FriendQueryController {
//
//    @GetMapping("/state/request")
//    public ResponseEntity<ResponseDTO> findRequestFriendById(@RequestHeader(value="Authorization")  String accessToken){
//        System.out.println("친구요청 정보 조회 API");
//        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청 정보 조회 성공", ""));
//    }
//
//    @GetMapping()
//    public ResponseEntity<ResponseDTO> findFriendById(@RequestHeader(value="Authorization")  String accessToken){
//        System.out.println("친구 정보 조회 API");
//        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구요청 정보 조회 성공", ""));
//    }
//
//    @DeleteMapping("/delete/{friendCode}")
//    public ResponseEntity<ResponseDTO> deleteFriend(@PathVariable Long friendCode){
//        System.out.println("친구 삭제 API");
//        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "친구삭제 성공", ""));
//    }
//}
