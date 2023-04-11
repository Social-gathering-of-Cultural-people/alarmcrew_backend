package soc.capstone.alarmcrew.swagger.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * Class : SwaggerController
 * Comment: Swagger example api
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-04-04         손준형           최초 생성
 * </pre>
 *
 * @author 손준형
 * @version 1(클래스 버전)
 * @see
 */
@RestController
@RequestMapping("/test/api")
@Api(tags = "test용 api") // 해당 컨트롤러에 대한 내용 설정
public class SwaggerController {

    @ApiOperation(value = "testapi", notes = "테스트용 api 입니다.") // 매핑 메소드에 대한 설명
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x", value = "x 값", required = true, dataType = "int", paramType = "path", defaultValue = "None")
            , @ApiImplicitParam(name = "y", value = "y 값", required = true, dataType = "int", paramType = "query")
    })
    // paramType : @RequestParam - query, @PathVariable - path
    // required, dataType, paramType은 자동으로 채워짐
    @ApiResponses({ // 응답 코드에 대한 설명
            @ApiResponse(code=200, message="성공"),
            @ApiResponse(code=401, message="접근 권한이 없습니다."),
            @ApiResponse(code=404, message="페이지를 찾지 못했습니다.")
    })
    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }


}